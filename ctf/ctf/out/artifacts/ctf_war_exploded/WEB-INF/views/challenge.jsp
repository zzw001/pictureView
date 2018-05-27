<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page='base.jsp'/>
<main role="main">
    <link rel="stylesheet" href="${requestScope.getContextPath}/css/challenge-board.css">
    <div class="jumbotron">
        <div class="container">
            <h1>题目</h1>
        </div>
    </div>
    <div class="container">
        <div id='challenges-board'>
            <div class="text-center">
                <i class="fas fa-circle-notch fa-spin fa-3x fa-fw spinner"></i>
            </div>
        </div>
    </div>

    <input id="nonce" type="hidden" name="nonce" value="{{ nonce }}">

    <div class="modal fade" id="chal-window" tabindex="-1" role="dialog">
    </div>

    <script src="${requestScope.getContextPath}/js/utils.js"></script>
    <script src="${requestScope.getContextPath}/js/multi-modal.js"></script>
    <script src="${requestScope.getContextPath}/js/chalboard.js"></script>
    <script src="${requestScope.getContextPath}/js/style.js"></script>
</main>