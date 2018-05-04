

<%@page contentType="text/html; charset=utf-8"  language="java" %>
<html>
<head>
    <title>财咖联盟首页</title>
    <link rel="stylesheet" href="../../layui/css/layui.css" />

</head>
<body>
<div>
    <ul class="layui-nav layui-bg-gray " style="color: #c2c2c2" >
        <li class="layui-nav-item" >
            <img src="../../image/logo.jpg" style="height: 80px;width: 200px;">
        </li>
        <li class="layui-nav-item"><a href="">最新活动</a></li>
        <li class="layui-nav-item">
            <a href="javascript:;">产品</a>
            <dl class="layui-nav-child">
                <dd><a href="">选项1</a></dd>
                <dd><a href="">选项2</a></dd>
                <dd><a href="">选项3</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">大数据</a></li>
        <li class="layui-nav-item">
            <a href="javascript:;">解决方案</a>
            <dl class="layui-nav-child">
                <dd><a href="">移动模块</a></dd>
                <dd><a href="">后台模版</a></dd>
                <dd class="layui-this"><a href="">选中项</a></dd>
                <dd><a href="">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">社区</a></li>
    </ul>
</div>
</body>

<script src="../../layui/layui.all.js"></script>
<script>
    layui.use(['layer','form','element'],function(){
        var layer = layui.layer,
            element = layui.element,
            form = layui.form;
    })

</script>

</html>

