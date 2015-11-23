$(function () {
    $("#register-btn").click(function () {
        form.submit("register-modal", ['text','password']).ajax("/car/user/data/register/submit", function () {
            var o = "注册";
            if (data.code == "0") {
                alert(form.success.replace("{0}", o));
                Window.location = "/car/user/v/login";
            } else {
                alert(form.error.replace("{0}", o))
            }
        });
    });
    $("#verification-btn").click(function () {
        time(this);
        ajax("/car/user/data/verification-code/get", {}, function (result) {
            $("#verification-txt").val(result.data);
        });
    });
});
var wait=60;
function time(o) {
    if (wait == 0) {
        o.removeAttribute("disabled");
        o.innerHTML="免费获取验证码";
        wait = 60;
    } else {
        o.setAttribute("disabled", true);
        o.innerHTML="重新发送(" + wait + ")";
        wait--;
        setTimeout(function() {
                time(o)
            },
            1000)
    }
}