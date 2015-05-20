<%@ tag pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ attribute name="pageInfo" required="true" type="me.wanx.common.core.persistence.BasePagination" description="分页对象类型"%>
<%@ attribute name="startUrl" required="true" type="java.lang.String" description="分页开始"%>
<%@ attribute name="endUrl" required="false" type="java.lang.String" description="分页结束"%>
<c:if test="${not empty pageInfo}">
	<div class="page-nav">
		<span><a href="${startUrl}1">首页</a></span>
		<span><a href="${startUrl}${pageInfo.beforePage}">上一页</a></span>
		<span><a href="${startUrl}${pageInfo.nextPage}">下一页</a></span>
		<span><a href="${startUrl}${pageInfo.totalPage}">尾页</a></span>
	</div>
</c:if>


