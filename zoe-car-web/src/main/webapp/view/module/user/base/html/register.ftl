<!DOCTYPE html>
<html class="js cssanimations">
<head>
    <title>用户注册</title>
<#include  "../../../frame.ftl">
<#include "../../../favicon.ftl">
    <link rel="stylesheet" href="/theme/default/assets/css/bootstrap.min.css">
    <script type="text/javascript" src="/view/module/user/base/js/register.js"></script>
    <style type="text/css">
        body {
            font-family: 'microsoft yahei', Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
    </style>
</head>
<body class="" style="">
<div class="modal show" style="margin-top: 20%">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close">x</button>
                <h2 class="text-center text-primary">注册</h2>
            </div>
            <div class="modal-body">
                <div id="register-modal" class="form center-block col-md-12">
                    <div class="form-group">
                        <input name="phone" data-val="true" data-val-required="亲，您还没有输入手机号码！" data-val-pattern="^[0-9]*$" maxlength="11" value="" data-val-regex="亲，只能手机号码" type="text" class="form-control input-lg " placeholder="手机号码">
                    </div>
                    <div class="form-group">
                        <input name="password" type="password" class="form-control input-lg" placeholder="请输入密码" data-confirm-required="两次的输入的密码不一致！" confirm="1">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control input-lg" placeholder="请再次确认密码" confirm="1">
                    </div>
                <#--  <div class="form-group form-inline row">
                      <div class="form-group col-md-5">
                          <input type="password" class="form-control" id="" placeholder="手机验证码">
                      </div>
                      <div class="form-group col-md-5">
                          <button type="button" class="form-control btn-default">获取验证码</button>
                      </div>
                  </div>-->
                    <div class="input-append">
                        <input name="verification" id="verification-txt" class="" placeholder="验证码" type="text">
                        <span id="verification-btn" class="add-on">获取验证码</span>
                    </div>
                    <div class="form-group" style="margin-top: 10px">
                        <button id="register-btn" class="btn btn-primary btn-lg btn-block">注册</button>
                    </div>
                </div>
                <div class="modal-footer"></div>
            </div>
        </div>
    </div>
</body>
</html>