<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page='base.jsp'/>
<main role="main">
    <div class="jumbotron">
        <div class="container">
            <h1>个人信息</h1>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <c:if test="${success!=null}">
                    <div class="alert alert-success alert-dismissable submit-row" role="alert">
                        <strong>Success!</strong>
                        Your profile has been updated
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>
                    </div>
                </c:if>
                <c:forEach items="${errors}" var="error">
                    <div class="submit-row">
                        <div class="alert alert-danger alert-dismissable" role="alert">
                            <span class="sr-only">Error:</span>
                            ${error}
                            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>
                        </div>
                    </div>
                </c:forEach>

                <form method="post" accept-charset="utf-8" autocomplete="off" role="form" class="form-horizontal">
                    <div class="form-group">
                        <label for="username">
                            用户名
                        </label>
                        <input class="form-control" type="text" name="username" id="username" value="${user.userName}"/>
                    </div>
                    <div class="form-group">
                        <label for="email">
                            邮箱
                        </label>
                        <input class="form-control" type="email" name="email" id="email" value="${user.email}"/>
                    </div>
                    <div class="form-group">
                        <label for="currentpassword">
                            当前密码
                        </label>
                        <input class="form-control" type="password" name="currentpassword" id="currentpassword" />
                    </div>
                    <div class="form-group">
                        <label for="newpassword">
                            新密码
                        </label>
                        <input class="form-control" type="password" name="newpassword" id="newpassword" />
                    </div>
                    <div class="form-group">
                        <label for="realname">
                            真实姓名
                        </label>
                        <input class="form-control" type="text" name="country" id="realname" value="${user.realName}" />
                    </div>

                    <div class="form-group">
                        <label for="number">
                            <c:if test="${user.userType == 0}">
                                学号
                            </c:if>
                            <c:if test="${user.userType == 1}">
                                工号
                            </c:if>
                        </label>
                        <input class="form-control" type="text" name="number" id="number" value="${user.userNumber}" />
                    </div>
                    <div class="form-group">
                        <button type="submit" id="submit" tabindex="5" class="btn btn-md btn-primary btn-outlined float-right">修改</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</main>
