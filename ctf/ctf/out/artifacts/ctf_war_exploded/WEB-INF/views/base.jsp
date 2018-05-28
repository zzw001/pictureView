<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri="http://shiro.apache.org/tags" prefix="shiro"%>
<!DOCTYPE html>
<html>
<head>
    <title>ctf训练系统</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/vendor/bootstrap.min.css">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/vendor/font-awesome/fontawesome-fonts.css" type='text/css'>
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/vendor/font-awesome/fontawesome-all.css" type='text/css'>
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/vendor/font.css" type="text/css">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/jumbotron.css">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/sticky-footer.css">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/base.css">
    <script src="${requestScope.getContextPath}/js/vendor/moment.min.js"></script>
    <script src="${requestScope.getContextPath}/js/vendor/nunjucks.min.js"></script>
</head>
<body>
<!--页首-->
<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    <div class="container">
        <a href="/" class="navbar-brand">
            CTF
            <%--<img class="img-responsive ctf_logo" src="img/logo.png" height="25" alt="">--%>
        </a>
        <button class="navbar-toggler"  data-toggle="collapse" data-target="#base-navbars"
                aria-controls="base-navbars" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="base-navbars">
            <ul class="navbar-nav mr-auto">
                <!--<li class="nav-item">
                    <a class="nav-link" href="#">Teams</a>
                </li>-->
                <li class="nav-item">
                    <a class="nav-link" href="/scoreboard">积分榜</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/challengeboard">贡献榜</a>
                </li>
                <shiro:authenticated>
                    <li class="nav-item">
                        <a class="nav-link" href="/challenge">题目</a>
                    </li>
                </shiro:authenticated>

            </ul>
            <hr class="d-sm-flex d-md-flex d-lg-none">

            <ul class="navbar-nav ml-md-auto d-block d-sm-flex d-md-flex">
                <shiro:hasRole name="admin">
                    <li class="nav-item">
                        <a class="nav-link" href="/admin/">管理</a>
                    </li>
                </shiro:hasRole>

                <c:if test="${username == null}">
                    <li class="nav-item">
                        <a class="nav-link" href="/register">注册</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link d-none d-md-block d-lg-block">|</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/login">登录</a>
                    </li>
                </c:if>
                <c:if test="${username !=null}">
                    <li class="nav-item">
                        <a class="nav-link" href="/team">关于我</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/profile">欢迎${username}</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/logout">退出</a>
                    </li>
                </c:if>
            </ul>
        </div>
    </div>
</nav>

<!-- 在其他页面写main标签-->
<%--<main role="main"></main>--%>

<!--页尾-->
<footer class="footer">
    <div class="container text-center">
        <a href="#">
            <small class="text-muted">Powered by ZZW</small>
        </a>
    </div>
</footer>

<script src="${requestScope.getContextPath}/js/vendor/jquery.min.js"></script>
<script src="${requestScope.getContextPath}/js/vendor/markdown-it.min.js"></script>
<script src="${requestScope.getContextPath}/js/vendor/bootstrap.bundle.min.js"></script>
<script src="${requestScope.getContextPath}/js/style.js"></script>
<script src="${requestScope.getContextPath}/js/ezq.js"></script>
<script src="${requestScope.getContextPath}/js/jquery.min.js"></script>
<script src="${requestScope.getContextPath}/js/vendor/bootstrap.bundle.min.js"></script>
<script src="${requestScope.getContextPath}/js/style.js"></script>


