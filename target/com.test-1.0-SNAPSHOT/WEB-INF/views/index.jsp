<%--
  Created by IntelliJ IDEA.
  User: Administrator1995
  Date: 18/01/2018
  Time: 7:21 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .mt-100 {
            margin-top: 100px;
        }
        .mb-100 {
            margin-bottom: 100px;
        }

        .icon {
            width: 32px;
            height: 32px;
            text-align: center;
            padding: 7px 8px;
            border: 2px solid;
            border-radius: 50%;
        }

        .header {
            padding-top: 50px;
            background-color: #eee;
            overflow: hidden;
        }
        .footer {
            color: #887;
            background-color: #eee;
            padding-top: 30px;
            padding-bottom: 30px;
        }

        .content {
            position: relative;
            display: table;
            width: 100%;
            min-height: 100vh;
        }
        .pull-middle {
            display: table-cell;
            vertical-align: middle;
        }

        .btn {
            padding-left: 25px;
            padding-right: 25px;
        }
        .btn-circle {
            border-radius: 20px;
        }

        .input-group input {
            border: 0;
            box-shadow: none;
            padding-right: 30px;
        }
        .input-group input:focus,
        .input-group input:active {
            outline: 0;
            box-shadow: none;
        }
        .input-group-btn:last-child>.btn {
            z-index: 2;
            margin-left: -18px;
            border-radius: 20px;
        }

        .phone {
            position: relative;
            max-width: 263px;
            margin: 0 auto;
            padding: 65px 15px 55px;
            border: 2px solid #ddd;
            border-radius: 20px;
            background-color: #222;
            box-shadow: 20px 20px 40px #887;
        }

        #login-btn {
            text-decoration: none;
            color: #ffffff;
        }
    </style>
</head>
<body>
<div class="wrapper">
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navigation">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand text-uppercase" href="#">Drone4Hire App <span class="label label-success text-capitalize">3.0</span></a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="navigation">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">About</a></li>
                    <li><a href="#">Features</a></li>
                    <li><button type="button" class="btn btn-success navbar-btn btn-circle"><a href="/login" id="login-btn">Sign in</a></button></li>
                </ul>
            </div>
        </div>
    </nav>
    <header class="header">
        <div class="container">
            <div class="row">
                <div class="col-md-5 col-md-offset-1">
                    <div class="content">
                        <div class="pull-middle">
                            <h1 class="page-header">Create an awesome App template with Bootstrap.</h1>
                            <p class="lead">Lorem ipsum dolor sit amet.</p>
                            <div class="panel panel-default">
                                <div class="panel-body">
                                    <form action="#" role="form">
                                        <div class="input-group">
                                            <input type="email" class="form-control" placeholder="Email Address" required>
                                            <span class="input-group-btn">
                                      <button class="btn btn-success btn-circle" type="submit">Sign up for free</button>
                                    </span>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-md-offset-1 text-center mt-100 mb-100">
                    <div class="phone">
                        <img class="img-responsive img-rounded" src="http://placemi.com/djlnr/263x480">
                    </div>
                </div>
            </div>
        </div>
    </header>
    <section class="section">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-1 text-center mt-100 mb-100">
                    <div class="phone">
                        <img class="img-responsive img-rounded" src="http://placemi.com/djlnr/263x480">
                    </div>
                </div>
                <div class="col-md-5 col-md-offset-1">
                    <div class="content">
                        <div class="pull-middle">
                            <h2 class="h1 page-header">Discover more about features.</h2>
                            <ul class="media-list">
                                <li class="media">
                                    <a class="media-left" href="#">
                                        <span class="glyphicon glyphicon-cloud icon text-success"></span>
                                    </a>
                                    <div class="media-body">
                                        <h3 class="media-heading">Praesent porttitor urna ut enim.</h3>
                                        <p>Maecenas vitae ex iaculis, efficitur est eu, fermentum quam.</p>
                                    </div>
                                </li>
                                <li class="media">
                                    <a class="media-left" href="#">
                                        <span class="glyphicon glyphicon-lock icon text-success"></span>
                                    </a>
                                    <div class="media-body">
                                        <h3 class="media-heading">Cras consequat est et elit.</h3>
                                        <p>Integer suscipit massa at tellus semper, at aliquam ante bibendum.</p>
                                    </div>
                                </li>
                                <li class="media">
                                    <a class="media-left" href="#">
                                        <span class="glyphicon glyphicon-user icon text-success"></span>
                                    </a>
                                    <div class="media-body">
                                        <h3 class="media-heading">Aenean vel enim quis dui blandit.</h3>
                                        <p>Maecenas vitae ex iaculis, efficitur est eu, fermentum quam.</p>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="section">
        <div class="container">
            <div class="row">
                <div class="col-md-3 text-right">
                    <div class="content">
                        <div class="pull-middle">
                            <h4><strong>Describe your product.</strong></h4>
                            <p>Proin sapien neque, consequat ac tempus aliquam, gravida in urna. Phasellus et lectus in odio imperdiet tempus. Aenean posuere, nunc a tristique imperdiet, massa dolor dictum eros, sit amet tempor turpis turpis vel tortor.</p>
                            <small>Phasellus feugiat at lorem a tincidunt. Nam hendrerit leo vitae orci pellentesque, nec euismod dolor condimentum.</small>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 col-md-offset-1 mt-100 mb-100">
                    <div class="phone">
                        <img class="img-responsive img-rounded" src="http://placemi.com/djlnr/263x480">
                    </div>
                </div>
                <div class="col-md-3 col-md-offset-1">
                    <div class="content">
                        <div class="pull-middle">
                            <h4><strong>Even more stuff.</strong></h4>
                            <p>Proin sapien neque, consequat ac tempus aliquam, gravida in urna. Phasellus et lectus in odio imperdiet tempus. Aenean posuere, nunc a tristique imperdiet, massa dolor dictum eros, sit amet tempor turpis turpis vel tortor.</p>
                            <a class="btn btn-success btn-circle" href="#">Sign up for free</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <footer class="footer text-center">
        <div class="container">
            <small>© Copyright 2015. Crafted with love by <a href="https://www.twitter.com/maridlcrmn">@maridlcrmn</a></small>
        </div>
    </footer>
</div>
</body>
</html>
