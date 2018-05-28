<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page='base.jsp'/>
<main role="main">

    <div class="jumbotron">
        <div class="container">
            <h1>注册</h1>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <form method="post" accept-charset="utf-8" autocomplete="off" role="form" class="form-horizontal" id="register_form">
                    <c:if test="${error!=null}">
                        <div class="alert alert-danger alert-dismissible" role="alert" id="alert">
                            <div id="alert_context">${error}</div>
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>
                        </div>
                    </c:if>
                    <div class="form-group">
                        <label for="username">
                            用户名
                            <i class="far fa-question-circle text-muted cursor-help" data-toggle="tooltip" data-placement="right" title="" data-original-title="用户名10个字符以内，不能包含符号"></i>
                        </label>

                        <input class="form-control" type="text" name="username" id="username"  />
                    </div>
                    <div class="form-group">
                        <label for="email">
                            邮箱
                        </label>
                        <input class="form-control" type="email" name="email" id="email"  />
                    </div>
                    <div class="form-group">
                        <label for="password">
                            密码
                            <i class="far fa-question-circle text-muted cursor-help" data-toggle="tooltip" data-placement="right" title="" data-original-title="密码在6个以上"></i>
                        </label>
                        <input class="form-control" type="password" name="password" id="password"/>
                    </div>
                    <div class="form-group">
                        <label for="schoolname">
                            学校
                        </label>
                        <c:set  var="school" value="${school}" scope="request"/>
                        <select class="custom-select " name="schoolname" id="schoolname">
                            <option value="${school}">${school}</option>
                            <c:forEach items="${schoolnames}" var="schoolname">
                                <option value="${schoolname}" <c:if test="${school == schoolname}">selected</c:if> >${schoolname}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="row pt-3">
                        <div class="col-md-12">
                            <button type="submit" id="submit" tabindex="5" class="btn btn-md btn-primary btn-outlined float-right">注册</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <script src="${requestScope.getContextPath}/js/vendor/jquery.md5.js"></script>
    <script type="text/javascript">

        $(function () {
            $("#register_form").submit(function () {

                if($("#username").val().length == 0 ){
                    $("#username").focus();
                    return false
                }

                if($("#email").val().length == 0 ){
                    $("#email").focus();
                    return false
                }

                if($("#password").val().length == 0 ){
                    $("#password").focus();
                    return false
                }

                $("#password").val($.md5($("#password").val()));
                return true;
            });
        })
    </script>
</main>
