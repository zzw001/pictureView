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
                <form action="/register/confirm" method="post" accept-charset="utf-8" autocomplete="off" role="form" class="form-horizontal" id="register_form">
                    <c:choose>
                        <c:when test="${error!=null&&error.length()>0}">
                            <div class="alert alert-danger alert-dismissible" role="alert" id="alert">
                                <div id="alert_context">${error}</div>
                                <button type="button" class="close" aria-label="Close"><span aria-hidden="true">×</span></button>
                            </div>
                        </c:when>
                        <c:when test="${(error!=null&&error.length()==0)||error==null}">
                            <div class="alert alert-danger alert-dismissible fade" role="alert" id="alert">
                                <div id="alert_context"></div>
                                <button type="button" class="close" aria-label="Close"><span aria-hidden="true">×</span></button>
                            </div>
                        </c:when>
                    </c:choose>

                    <div class="form-group">
                        <label for="username">
                            用户名
                        </label>
                        <input class="form-control" type="text" name="username" id="username"  />
                    </div>
                    <div class="form-group">
                        <label for="email">
                            邮箱
                        </label>
                        <input class="form-control" type="text" name="email" id="email"  />
                    </div>
                    <div class="form-group">
                        <label for="password">
                            密码
                        </label>
                        <input class="form-control" type="password" name="password" id="password"/>
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

            var alert_btn='<button type="button" class="close" aria-label="Close"><span aria-hidden="true">×</span></button>';
            $('.close').on('click',function () {
                $('#alert').hide();
            });
            $("#register_form").submit(function () {

                var username = $("#username").val();
                var usernameReg = /^[\w|\u4e00-\u9fa5]{1,10}$/;

                if(username.length == 0){

                    $("#alert_context").html("用户名不能为空");
                    $("#alert").attr("class","alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#username").focus();

                    return false;
                }else if(username.length>10){
                    $("#alert_context").html("用户名长度不能超过10个");
                    $("#alert").attr("class","alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#username").focus();

                    return false;
                } else if(!usernameReg.test(username)){

                    $("#alert_context").html("用户名格式不正确,不能包含符号");
                    $("#alert").attr("class","alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#username").focus();

                    return false;
                }

                var email = $("#email").val();
                var emailReg= /^([a-zA-Z0-9]+[-|_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|-|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{1,3}$/;
                //var emailReg=/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9-])+((\.[a-zA-Z0-9-]{2,3}){1,2})$/;
                if(email.length == 0){

                    $("#alert_context").html("邮箱不能为空");
                    $("#alert").attr("class","alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#email").focus();

                    return false;

                }else if(email.length >= 32){

                    $("#alert_context").html("邮箱长度不能超过32位,请更换一个邮箱");
                    $("#alert").attr("class","alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#email").focus();

                    return false;
                }else if(!emailReg.test(email)){

                    $("#alert_context").html("邮箱格式不正确");
                    $("#alert").attr("class","alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#email").focus();

                    return false;
                }

                var password = $("#password").val();

                if(password.length<6 || password.length>20){

                    $("#alert_context").html("密码长度应该大于6,小于20");
                    $("#alert").attr("class","alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#password").focus();

                    return false;
                }

                $("#password").val($.md5(password));

                return true;
            });
        })
    </script>
</main>
