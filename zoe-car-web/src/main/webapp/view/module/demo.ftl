<!DOCTYPE html>
<html class="js cssanimations">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>快舟拼车</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp">
<#include "favicon.ftl"/>
<#include "frame.ftl"/>
    <link rel="stylesheet" href="/theme/default/assets/css/amazeui.css">
    <style type="text/css">
        html, body {
            width: 100%;
            height: 100%;
            margin: 0px;
            padding: 0px;
            min-width: 300px;
        }
    </style>

</head>
<body class="am-with-fixed-navbar" style="">

<header data-am-widget="header" class="am-header am-header-default am-no-layout">
    <div class="am-header-left am-header-nav">
        <a href="#left-link" class="">
              <span class="am-header-nav-title">
                  厦门
              </span>

            <i class="am-header-icon am-icon-map-marker"></i>
        </a>
    </div>
    <h1 class="am-header-title">
        <div class="am-form-group am-form-icon">
            <i class="am-icon-search"></i>
            <input type="search"  style="margin-top: 5px;width: 100%" class="am-form-field am-round" placeholder="输入用户名、目的地、出发地">
        </div>
    </h1>
    <div class="am-header-right am-header-nav"></div>
</header>
<#include "../lib/msg/html/srcoll-list.ftl"/>
<#include "../lib/tool-btn/tool-btn.ftl"/>

<script type="text/x-handlebars-template" id="amz-tpl">
 <#--   {{>menu menu}}-->
</script>
<script src="/theme/default/assets/js/amazeui.js"></script>
<script src="/theme/default/assets/js/handlebars.min.js"></script>
<script src="/theme/default/assets/js/amazeui.widgets.helper.js"></script>
<script>
    var $tpl = $('#amz-tpl');
    var source = $tpl.text();
    var template = Handlebars.compile(source);
    var data = {
        menu: {
            "options": {
                "cols": "1"
            },
            "content": [
                {
                    "link": "##",
                    "title": "新建路线",
                    "subCols": 2,
                    "channelLink": "进入栏目 »",
                    "subMenu": [
                        {
                            "link": "##",
                            "title": "公司"
                        }
                    ]
                }
            ],
            "theme": "offcanvas1"
        }
    };
    var html = template(data);
    $tpl.before(html);
</script>

<#--<div class="am-popup" id="my-popup">
    <div class="am-popup-inner">
        <div class="am-popup-hd" style="background-color: #0e90d2">
            <h4 class="am-popup-title" style="color: white">发布消息</h4>
            <span data-am-modal-close class="am-close" style="color:yellow">&times;</span>
        </div>
        <div class="" style="width: 100%;height: 100%;font-size: 14px;font-weight: normal">
            <form>
                <form action="" class="am-form am-form-inline">
                    <div class="am-form-group am-form-icon">
                        <i class="am-icon-search"></i>
                        <input type="search" class="am-form-field am-round" placeholder="输入用户名、目的地、出发地">
                    </div>

                    <div class="am-form-group am-form-icon">
                        <i class="am-icon-clock-o"></i>
                        <input type="text" class="am-form-field" placeholder="时间">
                    </div>
                </form>
            </form>
        </div>
    </div>
</div>-->

<#include "navbar.ftl">
</body>
</html>