<!DOCTYPE html>
<html class="js cssanimations">
<head>
<#include "../../../favicon.ftl">
<#include "../../../frame.ftl">
    <title>用户登录</title>
    <link rel="stylesheet" href="/theme/default/assets/css/bootstrap.min.css">
    <script type="text/javascript" src="/view/module/user/base/js/login.js"></script>
    <style type="text/css">
        body{
            font-family: 'microsoft yahei',Arial,sans-serif;
            margin:0;
            padding:0;
        }
    </style>
</head>
<body class="" style="">
<div id="loginModal" class="modal show">
    <div class="modal-dialog" style="margin-top: 20%">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close">x</button>
                <h1 class="text-center text-primary">登录</h1>
            </div>
            <div class="modal-body">
                <div id="login-form" class="form col-md-12 center-block">
                    <div class="form-group">
                        <input name="phone" type="text" class="form-control input-lg" placeholder="手机号码或用户名">
                    </div>
                    <div class="form-group">
                        <input name="password" type="password" class="form-control input-lg" placeholder="登录密码">
                    </div>
                    <div class="form-group">
                        <button id="login-submit-btn" class="btn btn-primary btn-lg btn-block">立刻登录</button>
                        <span><a href="#">找回密码</a></span>
                        <span><a href="/car/user/v/login" class="pull-right">注册</a></span>
                    </div>
                </div>
            </div>
            <div class="modal-footer">

            </div>
        </div>
    </div>
</div>
</body>
</html>