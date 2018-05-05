<%--
  Created by IntelliJ IDEA.
  User: ToLife
  Date: 2018/5/4
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>

</style>
<head>
    <title>财咖联盟</title>
    <link rel="stylesheet" href="<%=this.getServletContext().getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css" />
    <link rel="stylesheet" href="<%=this.getServletContext().getContextPath()%>/bootstrap-3.3.7-dist/js/bootstrap.js" />
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">财咖联盟</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">首页</a>
                        </li>
                        <li>
                            <a href="#">国内网赚</a>
                        </li>
                        <li>
                            <a href="#">国外网赚</a>
                        </li>
                        <li>
                            <a href="#">会员中心</a>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" />
                        </div> <button type="submit" class="btn btn-default">查找</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>
            <div class="row clearfix">
                <div class="col-md-8 column">
                    <div class="carousel slide" id="carousel-813092">
                        <ol class="carousel-indicators">
                            <li class="active" data-slide-to="0" data-target="#carousel-813092">
                            </li>
                            <li data-slide-to="1" data-target="#carousel-813092">
                            </li>
                            <li data-slide-to="2" data-target="#carousel-813092">
                            </li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="item active">
                                <img alt="" src="image/logo.jpg" />
                                <div class="carousel-caption">
                                    <h4>
                                        First Thumbnail label
                                    </h4>
                                    <p>
                                        Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                    </p>
                                </div>
                            </div>
                            <div class="item">
                                <img alt="" src="image/1.png" />
                                <div class="carousel-caption">
                                    <h4>
                                        Second Thumbnail label
                                    </h4>
                                    <p>
                                        Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                    </p>
                                </div>
                            </div>
                            <div class="item">
                                <img alt="" src="image/logo.jpg" />
                                <div class="carousel-caption">
                                    <h4>
                                        Third Thumbnail label
                                    </h4>
                                    <p>
                                        Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                    </p>
                                </div>
                            </div>
                        </div> <a class="left carousel-control" href="#carousel-813092" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-813092" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
                    </div>
                    <div class="row">
                        <div class="col-md-4">
                            <div class="thumbnail">
                                <img alt="300x200" src="image/logo.jpg" />
                                <div class="caption">
                                    <h3>
                                        Thumbnail label
                                    </h3>
                                    <p>
                                        Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                    </p>
                                    <p>
                                        <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="thumbnail">
                                <img alt="300x200" src="image/logo.jpg" />
                                <div class="caption">
                                    <h3>
                                        Thumbnail label
                                    </h3>
                                    <p>
                                        Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                    </p>
                                    <p>
                                        <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="thumbnail">
                                <img alt="300x200" src="image/logo.jpg" />
                                <div class="caption">
                                    <h3>
                                        Thumbnail label
                                    </h3>
                                    <p>
                                        Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                                    </p>
                                    <p>
                                        <a class="btn btn-primary" href="#">Action</a> <a class="btn" href="#">Action</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 column">
                    <img alt="140x140" src="image/logo.jpg" />
                    <ol>
                        <li>
                            Lorem ipsum dolor sit amet
                        </li>
                        <li>
                            Consectetur adipiscing elit
                        </li>
                        <li>
                            Integer molestie lorem at massa
                        </li>
                        <li>
                            Facilisis in pretium nisl aliquet
                        </li>
                        <li>
                            Nulla volutpat aliquam velit
                        </li>
                        <li>
                            Faucibus porta lacus fringilla vel
                        </li>
                        <li>
                            Aenean sit amet erat nunc
                        </li>
                        <li>
                            Eget porttitor lorem
                        </li>
                    </ol>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="row clearfix">
    <div class="col-md-12 column" >
        <nav class="navbar navbar-default navbar-fixed-bottom" role="navigation">
                     © 2018 杰神联盟   © 2015~2018 杰神联盟 | 渝ICP备15012822号-1
        </nav>
    </div>
</div>
</body>
</html>