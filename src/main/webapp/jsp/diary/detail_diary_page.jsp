<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="/WEB-INF/include/head.jsp" %>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/diary/detail_diary_page.css">
	<script src="${pageContext.request.contextPath}/assets/js/diary/detail_diary.js"></script>
</head>

<body>
    <%@ include file="/WEB-INF/include/preload.jsp" %>

    <%@ include file="/WEB-INF/include/header.jsp" %>
    <%@ include file="/jsp/diary/detail_diary.jsp" %>
    <%@ include file="/WEB-INF/include/footer.jsp" %>

 
</html>