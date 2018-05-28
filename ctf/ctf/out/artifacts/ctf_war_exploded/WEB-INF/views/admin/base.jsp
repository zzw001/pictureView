<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri="http://shiro.apache.org/tags" prefix="shiro"%>
<!DOCTYPE html>
<html>
<head>
    <title>ctf训练系统</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="/img/favicon.ico" type="image/x-icon">
    <link rel="icon" href="img/favicon.ico" type="image/x-icon">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/admin/vendor/bootstrap.min.css">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/admin/vendor/font-awesome/fontawesome-fonts.css" type='text/css'>
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/admin/vendor/font-awesome/fontawesome-all.css" type='text/css'>
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/admin/vendor/font.css" type="text/css">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/admin/jumbotron.css">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/admin/sticky-footer.css">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/base.css">
    <script src="${requestScope.getContextPath}/js/admin/vendor/moment.min.js"></script>
    <script src="${requestScope.getContextPath}/js/admin/vendor/moment-timezone-with-data.min.js"></script>
    <script src="${requestScope.getContextPath}/js/admin/vendor/nunjucks.min.js"></script>
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

                <li class="nav-item">
                    <a class="nav-link" href="/admin/chal/new">出题</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="/admin/chal/all">题目列表</a>
                </li>
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

<script src="${requestScope.getContextPath}/js/admin/vendor/jquery.min.js"></script>
<script src="${requestScope.getContextPath}/js/admin/vendor/markdown-it.min.js"></script>
<script src="${requestScope.getContextPath}/js/admin/vendor/bootstrap.bundle.min.js"></script>
<script src="${requestScope.getContextPath}/js/admin/style.js"></script>
<script src="${requestScope.getContextPath}/js/admin/ezq.js"></script>
<script src="${requestScope.getContextPath}/js/admin/main.js"></script>
<script src="${requestScope.getContextPath}/js/admin/vendor/bootstrap.bundle.min.js"></script>
<script src="${requestScope.getContextPath}/js/admin/style.js"></script>


