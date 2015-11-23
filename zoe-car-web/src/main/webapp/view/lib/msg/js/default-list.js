var message = {
    pageSize: 5,
    pageNum: 1,
    type: 0,
    setType: function (type) {
        this.type = type;
        return this;
    },
    query: function (request, type) {
        var opt = {pageSize: this.pageSize, pageNum: this.pageNum++, type: this.type};
        $.extend(opt, request);
        ajax("/car/message/data/query", opt, function (result) {
            if (type == 2)
                message.insert(result.data);
            else
                message.append(result.data);
            message.pageNum = message.pageNum + 1;
        })
        return this;
    },
    append: function (messages) {
        var $template = $("#post-template li").first();
        this.pageNum = messages.pageNum;
        this.pageSize = messages.pageSize;
        $(messages.posts).each(function () {
            var $post = $template.clone();
            $("#thelist").append($post.post(this).postDisplay());
            $post.postResize();
        });
    },
    insert: function (messages) {
        var $template = $("#post-template li").first();
        this.pageNum = messages.pageNum;
        this.pageSize = messages.pageSize;
        $(messages.posts).each(function () {
            var $post = $template.clone();
            $("#thelist").insert($post.post(this).postDisplay());
            $post.postResize();
        });
    }
};


$(function () {
    $("#wrapper").height(document.body.clientHeight - 130);
    $(window).resize(function () {
        $("#wrapper").height(document.body.clientHeight - 130);
    });
    $("#pullDown").css("display", "none");
    $("#pullUp").css("display", "none");

    $("#msg-refresh").hover(function () {
        $("#msg-refresh-a").addClass("am-icon-spin");
    }, function () {
        $("#msg-refresh-a").removeClass("am-icon-spin");
    });
    $(window).resize(function () {
        $(".msg-post").each(function () {
            $(this).height($(this).find(".msg-post-body").height());
        });
    });
    //message.append(lineMessage);
    /*var $template = $("#post-template li").first();
     var getLineMessages = "/car/message/data/query?type=";

     $(lineMessage.posts).each(function () {
     var $post = $template.clone();
     $("#thelist").append($post.post(this).postDisplay());
     $post.postResize();
     });*/


});