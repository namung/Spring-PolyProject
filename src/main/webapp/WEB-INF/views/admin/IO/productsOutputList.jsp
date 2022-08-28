<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출고 목록 페이지</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>

<body>
	<%@include file="../includes/admin/header.jsp" %>

            <div class="admin_content_wrap">
                <div class="admin_content_subject"><span>출고 목록 페이지</span></div>
                <div>${list}</div>
                <div>${pageMaker}</div>
                <!-- <div class="author_table_wrap">
                    	<table class="author_table">
                    		<thead>
                    			<tr>
                    				<td class="th_column_1">출고 번호</td>
                    				<td class="th_column_2">상품 아이디(분류코드)</td>
                    				<td class="th_column_3">출고량</td>
                    				<td class="th_column_4">출고 날짜</td>
                    			</tr>
                    		</thead>
                    		<c:forEach items="${list}" var="list">
                    		<tr>
                    			<td><c:out value="${list.outputNum}"></c:out> </td>
                    			<td><c:out value="${list.productId}"></c:out></td>
                    			<td><c:out value="${list.outputAmount}"></c:out> </td>
                    			<td><fmt:formatDate value="${list.salesDate}" pattern="yyyy-MM-dd"/></td>
                    		</tr>
                    		</c:forEach>
                    	</table>                			
                    </div>   -->                 
                </div>
        
        <%@include file="../includes/admin/footer.jsp" %>
</body>
</html>