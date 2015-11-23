<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>demo page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is demo page for learn">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>

<body>
<#include "header.ftl" parse=true encoding="utf-8">
<hr/>
<a href="#">用户列表</a><br/>
<table border="1">
    <tr>
        <td>用户名</td>
        <td>年龄</td>
        <td>生日</td>
        <td>id</td>
    </tr>
<#list users as user>
    <tr>
        <td>${user.name}</td>
        <td>${user.age}</td>
        <td>
        ${user.birthday?string("yyyy-MM-dd HH:mm:ss")}
        </td>
        <td>${user.id}</td>
    </tr>
</#list>

</table>
<hr/>
<#include "footer.ftl" parse=true encoding="utf-8">
</body>
</html>