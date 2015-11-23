var form = {
    //表单固定属性
    data_val_required: "data-val-required",
    data_val_pattern: "data-val-pattern",
    data_val_regex: "data-val-regex",
    data_val: "data-val",
    data_confirm: "confirm",
    data_confirm_required: "data-confirm-required",
    success: "{0}成功!",
    error: "{0}失败！",

    //表单结果值
    result: {},

    error_mark: 0,

    init: function (params) {
        form.result = $.extend({}, params);
        form.error_mark = 0;
        return this;
    },

    submit: function (formId, inputType) {
        form.init();
        //提取表单中input值
        $(inputType).each(function () {
            if (this != "select") {
                formId = formId.indexOf("#") > -1 ? formId : "#" + formId;
                $(formId).find("input[type='" + this + "']").each(function () {
                    var data_val = $(this).attr(form.data_val);
                    if (data_val == "true") {
                        if ($(this).val() == "") {
                            dialog.alert($(this).attr(form.data_val_required));
                            form.error_mark = 1;
                        } else {
                            if ($(this).attr(form.data_val_pattern) != "" && $(this).attr(form.data_val_pattern) != undefined) {
                                var re = new RegExp($(this).attr(form.data_val_pattern));
                                if (!re.test($(this).val())) {
                                    dialog.alert($(this).attr(form.data_val_regex));
                                    form.error_mark = 1;
                                }
                            }
                        }
                    } else {
                        if ($(this).attr(form.data_val_pattern) != "" && $(this).attr(form.data_val_pattern) != undefined) {
                            var re = new RegExp($(this).attr(form.data_val_pattern));
                            if (!re.test($(this).val())) {
                                dialog.alert($(this).attr(form.data_val_regex));
                                form.error_mark = 1;
                            }
                        }
                    }
                    if ($(this).attr(form.data_confirm) != undefined) {
                        var confirm_val = $(this).val();
                        var confirm_text = $(this).attr(form.data_confirm_required);
                        $("input[confirm='" + $(this).attr(form.data_confirm) + "']").each(function () {
                            if (confirm_val != $(this).val()) {
                                if ($(this).attr("hasAlert") != "true") {
                                    alert(confirm_text);
                                }
                                $("input[confirm='" + $(this).attr(form.data_confirm) + "']").attr("hasAlert", true);
                                form.error_mark = 1;
                            }
                        })
                    }
                    form.result[$(this).attr("name")] = $(this).val();
                });
            }
            else {
                //提取表单中下拉框架值
                $(formId).find("select").each(function () {
                    form.result[$(this).attr("name")] = $(this).find("option:selected").val();
                });
            }
        });
        return this;
    },
    ajax: function (url, callBack, data) {
        if (form.error_mark == 1)
            return;
        var request = $.extend({}, form.result, data);
        ajax(url, request, callBack);
        return this;
    },
    error: function (errorMsg) {
        window.location.href = "error.html?error=" + errorMsg;
    }
};

var ajax = function (url, request, callBack) {
    $.ajax({
        url: url,
        type: 'post',
        contentType: "application/x-www-form-urlencoded; charset=gbk",
        dataType: 'json',
        data: request,
        success: callBack
    });
}


var dialog = {

    /*    alert: function (message) {
     alert(message);
     }*/
    alert: function (message) {
        /*        var alert = "<div class=\"am-modal am-modal-no-btn\" tabindex=\"-1\" id=\"your-modal\">\n" +
         "  <div class=\"am-modal-dialog\">\n" +
         "    <div class=\"am-modal-hd\">\n" +
         "      <a href=\"javascript: void(0)\" class=\"am-close am-close-spin\" data-am-modal-close>&times;</a>\n" +
         "    </div>\n" +
         "    <div class=\"am-modal-bd\">\n" +
         "     \n" +
         "    </div>\n" +
         "  </div>\n" +
         "</div>";
         $("body").append(alert);
         var $modal = $('#your-modal');
         $modal.find(".am-modal-bd").text(message);
         $modal.modal();*/
        alert(message)
    }
}

/**
 * 获取指定URL的参数值
 * @param url  指定的URL地址
 * @param name 参数名称
 * @return 参数值
 */
function getUrlParam(url, name) {
    var pattern = new RegExp("[?&]" + name + "\=([^&]+)", "g");
    var matcher = pattern.exec(url);
    var items = null;
    if (null != matcher) {
        try {
            items = decodeURIComponent(decodeURIComponent(matcher[1]));
        } catch (e) {
            try {
                items = decodeURIComponent(matcher[1]);
            } catch (e) {
                items = matcher[1];
            }
        }
    }
    return items;
}

function getdate()
{
    var now=new Date()
    y=now.getFullYear()
    m=now.getMonth()+1
    d=now.getDate()
    m=m<10?"0"+m:m
    d=d<10?"0"+d:d
    return y+"-"+m+"-"+d
}





