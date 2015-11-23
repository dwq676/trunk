(function ($) {
    $.fn.post = function (options) {
        //debug(this);
        // build main options before element iteration
        var opts = $.extend({}, $.fn.post.defaults, options);
        // iterate and reformat each matched element
        return this.each(function () {
            //$this = $(this);
            // build element specific options
            var o = $.meta ? $.extend({}, opts, $this.data()) : opts;
            setValue(this, o);

            /*      var markup = $this.html();
             // call our format function
             markup = $.fn.hilight.format(markup);
             $this.html(markup);*/
        });
    };
    $.fn.postDisplay = function () {
        return this.each(function () {
            $(this).removeClass("msg-post-display");
        });
    };
    $.fn.postResize = function () {
        return this.each(function () {
            $this = $(this);
            $this.hover(function () {
                if ($(this).find(".msg-post-tip") != undefined) {

                    $(this).find(".msg-post-tip").css("display", "inline");
                }
            }, function () {
                $(this).find(".msg-post-tip").css("display", "none");
            });
            /* $('.msg-post').each(function () {*/
            $this.height($this.find(".msg-post-body").height());

            /*});*/
        });
    };
    // 定义暴露format函数
    $.fn.post.format = function (txt) {
        return '<strong>' + txt + '</strong>';
    };
    // 插件的defaults
    $.fn.post.defaults = {};
    function setValue(obj, opts) {
        $obj = $(obj);
        //$obj.find("#" + "msg-message-count").text(opts.post.count);
        var userPage = "/user/info?id=";
        var searchPage = "/search?key=";
        var orderPage = "/user/order?userId=";
        var messagePage = "/user/order/message?userId=";
        var tipPage = "/tip?userId=";
        $obj.find("div.msg-post-out div.msg-post-avatar a.person-img").attr("title", opts.name)
            .attr("href", userPage + opts.userId).find("img").attr("src", opts.photo);
        $obj.find("div.msg-post-out div.msg-post-body a.person-span").attr("title", opts.name).text(opts.name)
            .parent().find("span").text(opts.createTime);
        console.log($obj.find("div.msg-post-out div.msg-post-body a.person-span").attr("title", opts.name).text(opts.name)
            .find("span"))
        var content = [];
        content.push("<a href='" + searchPage + opts.content.date + "'>" + opts.content.dateCn + "</a>");
        content.push("<a href='" + searchPage + opts.content.time + "'>&nbsp;" + opts.content.timeCn + "</a>" + "左右，");
        content.push("从<a href='" + searchPage + opts.content.start + "'>" + opts.content.start + "</a>出发，");
        if (opts.content.goby.length > 0) {
            content.push("途经")
            for (var i = 0; i < opts.content.goby.length; i++) {
                if (i > 0)
                    content.push("-");
                content.push("<a href='" + searchPage + opts.content.goby[i] + "'>" + opts.content.goby[i] + "</a>");
            }
            content.push("，")
        }
        content.push("到<a href='" + searchPage + opts.content.end + "'>" + opts.content.end + "</a>");
        content.push("剩余<a href='#'>[" + opts.content.left + "]</a>个位置，");
        content.push("有需要的请联系<a href='#'>" + opts.content.phone + "</a>。");

        $obj.find("div.msg-post-out div.msg-post-body div.msg-post-body-text span").html(content.join(""));
        $obj.find("div.msg-post-out div.msg-post-body div.msg-post-body-footer .msg-post-seat").attr("href", orderPage + opts.userId);
        $obj.find("div.msg-post-out div.msg-post-body div.msg-post-body-footer .msg-post-message").attr("href", messagePage + opts.userId);
        $obj.find("div.msg-post-out div.msg-post-body div.msg-post-body-footer .msg-post-tip").attr("href", tipPage + opts.userId);
        //content
    };
})(jQuery);