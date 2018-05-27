<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page='base.jsp'/>
<main role="main">
    <div class="jumbotron">
        <div class="container">
            <h1>登录</h1>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <form action="/login/confirm" method="post" accept-charset="utf-8" autocomplete="off" role="form" class="form-horizontal" id="login_form">
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
                        <label for="email">
                            邮箱
                        </label>
                        <input class="form-control" type="text" name="email" id="email" />
                    </div>
                    <div class="form-group">
                        <label for="password">
                            密码
                        </label>
                        <input class="form-control" type="password" name="password" id="password" />
                    </div>
                    <div class="row pt-3">
                        <input type="text" name = "code" id="code" class="float-left form-control col-md-6"/>
                        <img id ="myPic" src="/images/captcha" class="float-right col-md-6">
                    </div>
                    <div class="row pt-3">
                        <div class="col-md-6">
                            <a class="float-left align-text-to-button" href="#">
                                忘记密码?
                            </a>
                        </div>
                        <div class="col-md-6">
                            <button type="submit" id="submit" tabindex="5" class="btn btn-md btn-primary btn-outlined float-right">
                                登录
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="${requestScope.getContextPath}/js/vendor/jquery.md5.js"></script>
    <script type="text/javascript">

        $(function () {

            $("#myPic").bind("click",function () {
                $(this).attr("src","/images/captcha?"+Math.random());
                return false;
            });

            $('.close').on('click', function () {
                $('#alert').hide();
            });

            $("#login_form").submit(function () {

                var code = $("#code").val();

                if (code.length != 5) {

                    $("#alert_context").html("验证码错误");
                    $("#alert").attr("class", "alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#code").focus();

                    return false;
                }

                var email = $("#email").val();
                var emailReg = /^([a-zA-Z0-9]+[-|_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|-|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{1,3}$/;
                //var emailReg=/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9-])+((\.[a-zA-Z0-9-]{2,3}){1,2})$/;
                if (email.length == 0) {

                    $("#alert_context").html("邮箱不能为空");
                    $("#alert").attr("class", "alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#email").focus();

                    return false;

                } else if (email.length >= 32) {

                    $("#alert_context").html("邮箱长度不能超过32位,请更换一个邮箱");
                    $("#alert").attr("class", "alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#email").focus();

                    return false;
                } else if (!emailReg.test(email)) {

                    $("#alert_context").html("邮箱格式不正确");
                    $("#alert").attr("class", "alert alert-danger alert-dismissible");
                    $("#alert").show();
                    $("#email").focus();

                    return false;
                }

                var password = $("#password").val();

                if (password.length < 6 || password.length > 20) {

                    $("#alert_context").html("密码应该大于6,小于20");
                    $("#alert").attr("class", "alert alert-danger alert-dismissible");
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
