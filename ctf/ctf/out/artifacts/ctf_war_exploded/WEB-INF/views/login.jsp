<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/20
  Time: 0:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page='base.jsp'/>
<div class="jumbotron">
    <div class="container">
        <h1>登录</h1>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-6 offset-md-3">
            <form method="post" accept-charset="utf-8" autocomplete="off" role="form" class="form-horizontal">
                <div class="form-group">
                    <label for="name-input">
                        用户名
                    </label>
                    <input class="form-control" type="text" name="name" id="name-input" />
                </div>
                <div class="form-group">
                    <label for="password-input">
                        密码
                    </label>
                    <input class="form-control" type="password" name="password" id="password-input" />
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
                <input type="hidden" name="nonce" value="0">
            </form>
        </div>
    </div>
</div>