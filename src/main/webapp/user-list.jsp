<%@ page language="java" contentType="text/html; charset=utf-8"pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="wanx" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="pages/css/common.css">
<title>user-list</title>
</head>
<body>
	<table align="center" border="1" cellpadding="0" cellspacing="0" width="400">
		<thead>
			<tr>
				<th width="40%">id</th>
				<th width="60%">name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userPage.results}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2">
					<%-- 
					<a href="?userPage.currentPage=1">首页</a>
					<a href="?userPage.currentPage=${userPage.beforePage}">上一页</a>
					<a href="?userPage.currentPage=${userPage.nextPage}">下一页</a>
					<a href="?userPage.currentPage=${userPage.totalPage}">尾页</a>
					 --%>
					<wanx:tabPage pageInfo="${userPage}" startUrl="?userPage.currentPage=" /> 
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>