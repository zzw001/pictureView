<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page='base.jsp'/>
<main role="main">
    <div class="jumbotron">
        <div class="container">
            <h1 id="username" >${user.userName}</h1>
        </div>
    </div>

    <div class="container">
        <div class="team-info">
            <h2 id="team-score" class="text-center">
                ${user.score} <small>积分</small>
            </h2>
        </div>
    </div>

</main>