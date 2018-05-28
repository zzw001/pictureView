<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page='${requestScope.getContextPath}/WEB-INF/views/admin/base.jsp'/>
<main role="main">
    <div class="jumbotron">
        <div class="container">
            <h1>出题</h1>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <div id="create-chal-entry-div">
                            <form method="POST" action="/admin/chal/new">
                                <div class="form-group">
                                    <label for="name">题目名字
                                        <i class="far fa-question-circle text-muted cursor-help" data-toggle="tooltip" data-placement="right" title="" data-original-title="The name of your challenge"></i>
                                    </label>
                                    <input class="form-control" name="name" id="name" placeholder="Enter challenge name" type="text">
                                </div>
                                <div class="form-group">
                                    <label for="catename">分类
                                        <i class="far fa-question-circle text-muted cursor-help" data-toggle="tooltip" data-placement="right" title="" data-original-title="The category of your challenge"></i>
                                    </label>
                                    <c:set var="catename" value="${catename}" scope="request"></c:set>
                                    <select class="custom-select" name="catename" id="catename">
                                        <option value="${catename}">${catename}</option>
                                        <c:forEach items="${categorys}" var="category">
                                        <option value="${category}" <c:if test="${catename == category}">selected</c:if> >${category}</option>
                                        </c:forEach>
                                    </select>
                                </div>

                                <div class="tab-content">
                                    <div role="tabpanel" class="tab-pane active" id="new-desc-write">
                                        <div class="form-group">
                                            <label for="description" class="control-label">内容
                                                <i class="far fa-question-circle text-muted cursor-help" data-toggle="tooltip" data-placement="right" title="" data-original-title="Use this to give a brief introduction to your challenge. The description supports HTML and Markdown."></i>
                                            </label>
                                            <textarea id="description" class="form-control" name="description" rows="10"></textarea>
                                        </div>
                                    </div>
                                    <div role="tabpanel" class="tab-pane content" id="new-desc-preview" style="height:234px; overflow-y: scroll;">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="score">积分
                                        <i class="far fa-question-circle text-muted cursor-help" data-toggle="tooltip" data-placement="right" title="" data-original-title="This is how many points are rewarded for solving this challenge."></i>
                                    </label>
                                    <input class="form-control" name="score" id="score" placeholder="Enter value" type="number">
                                </div>

                                <div class="form-group">
                                    <label for="flag">flag
                                        <i class="far fa-question-circle text-muted cursor-help" data-toggle="tooltip" data-placement="right" title="" data-original-title="This is the flag or solution for your challenge. You can choose whether your flag is a static string or a regular expression."></i>
                                    </label>
                                    <input class="form-control" name="flag" id="flag" placeholder="Enter flag" type="text">
                                </div>

                                <div class="form-group">
                                    <label for="point">考查点

                                    </label>
                                    <input class="form-control" name="point" id="point" placeholder="Enter point" type="text">
                                </div>

                                <div class="form-group">
                                    <label for="writeup">解题思路

                                    </label>
                                    <input class="form-control" name="writeup" id="writeup" placeholder="Enter writeup" type="text">
                                </div>

                                <div class="form-group">
                                    <label>Upload Challenge Files
                                        <i class="far fa-question-circle text-muted cursor-help" data-toggle="tooltip" data-placement="right" title="" data-original-title="Challenges files are provided to users for download alongside your challenge description"></i>
                                    </label>
                                    <input class="form-control-file" name="files[]" multiple="multiple" type="file">
                                    <sub class="help-block">Attach multiple files using Control+Click or Cmd+Click.</sub>
                                </div>

                                <div class="form-group">
                                    <button class="btn btn-primary float-right create-challenge-submit" type="submit">创建</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <script src="${requestScope.getContextPath}/js/admin/utils.js"></script>
    <script src="${requestScope.getContextPath}/js/admin/vendor/codemirror.min.js"></script>
    <script src="${requestScope.getContextPath}/js/admin/vendor/markdown-it.min.js"></script>
    <script src="${requestScope.getContextPath}/js/admin/challenges/chal-new.js"></script>
</main>
