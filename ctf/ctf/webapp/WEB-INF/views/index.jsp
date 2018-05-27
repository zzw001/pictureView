<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/20
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page='base.jsp'/>
<main role="main">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <img class="w-100 mx-auto d-block" style="max-width: 500px;padding: 50px;padding-top: 14vh;" src="${requestScope.getContextPath}/img/logo.png" />
            <h3 class="text-center">
                <p>A cool CTF platform from <a href="#">ctfd.io</a></p>
                <p>Follow us on social media:</p>
                <a href="#"><i class="fab fa-twitter fa-2x" aria-hidden="true"></i></a>&nbsp;
                <a href="#"><i class="fab fa-facebook fa-2x" aria-hidden="true"></i></a>&nbsp;
                <a href="#"><i class="fab fa-github fa-2x" aria-hidden="true"></i></a>
            </h3>
            <br>
            <h4 class="text-center">
                <a href="#">Click here</a> to login and setup your CTF
            </h4>
        </div>
    </div>
</main>