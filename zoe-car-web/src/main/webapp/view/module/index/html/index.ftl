<!DOCTYPE HTML>
<html class="demo js cssanimations"><!--<![endif]-->
<head>
    <meta name="description" content="">
    <meta name="keywords" content="">
<#include "../../favicon.ftl"/>
<#include "../../frame.ftl"/>
    <style type="text/css">
        html, body {
            width: 100%;
            height: 100%;
            margin: 0px;
            padding: 0px;
            min-width: 300px;
        }
    </style>
    <script type="text/javascript">
        var point = {longitude: 118.199179, latitude: 24.485316};
        carzoe.native.handler.gps(function (json) {
            //point.longitude = json.longitude;
            //point.latitude = json.latitude;
        });
    </script>
    <script src="/theme/default/assets/js/amazeui.js"></script>
</head>
<body>
<div class="page">
    <header data-am-widget="header" class="am-header am-header-default am-no-layout">
        <div class="am-header-left am-header-nav">
            <a href="#left-link" class="">
              <span class="am-header-nav-title">
                  厦门
              </span>
                <i class="am-header-icon am-icon-map-marker"></i>
            </a>
        </div>
        <div class="am-header-title">
            <div class="am-form-group am-form-icon">
                <i class="am-icon-search"></i>
                <input type="search" style="margin-top: 5px;width: 100%" class="am-form-field am-round"
                       placeholder="输入用户名、目的地、出发地">
            </div>
        </div>

        <div id="menu-view" data-backend-compiled="">
        <#include "../../menu.ftl">
        </div>
    </header>
<#include "../../../lib/msg/html/srcoll-list.ftl"/>
<#include "../../../lib/tool-btn/tool-btn.ftl"/>
<#include "../../navbar.ftl"/>
<#include "../../message/public.ftl"/>
    <script src="/view/module/index/js/index.js"></script>
</div>
</body>
</html>