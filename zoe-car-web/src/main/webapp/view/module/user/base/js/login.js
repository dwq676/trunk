$(function () {
    $("#login-submit-btn").click(function () {
        form.submit("login-form", ['text', 'password']).ajax("/car/user/data/login/submit", function (result) {
            var o = "登录";
            if (result.code == "0") {
                //dialog.alert(form.success.replace("{0}", o));

                window.location.href = "/";
            } else {
                dialog.alert(result.message);
            }
        });
    });
});