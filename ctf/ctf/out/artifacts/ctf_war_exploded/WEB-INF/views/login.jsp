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
                <form method="post" accept-charset="utf-8" autocomplete="off" role="form" class="form-horizontal" id="login_form">
                    <c:if test="${error!=null}">
                        <div class="alert alert-danger alert-dismissible" role="alert" id="alert">
                            <div id="alert_context">${error}</div>
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>
                        </div>
                    </c:if>
                    <div class="form-group">
                        <label for="email">
                            邮箱
                        </label>
                        <input class="form-control" type="email" name="email" id="email" />
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

            $("#login_form").submit(function () {

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
