<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Week Sales List</title>
</head>
<body>

<%@include file="../includes/admin/header.jsp" %>

<h2>매출 관리 페이지</h2>

<div class="containder">
	
	<div class="sales_total">
	
    	<a href="choice_sales.jsp">[오늘/이번주/이번달/올해] 매출 보러가기</a>
    
        <br>
		
		<h3>이번 주 총 합계: <fmt:formatNumber value="${weekTotal}" type="number"/>원</h3>
		
		<h4>상세보기</h4>
		
			<div class="details_table_wrap">
	           	<!-- detail 리스트 O -->
	            <c:if test="${listcheck != 'empty'}">
	            	<table class="details_table">
	            		<thead>
	            			<tr>
								<td class="th_column_1">상품 번호</td>
	            				<td class="th_column_2">상품 이름</td>
	            				<td class="th_column_3">상품 가격</td>
	            				<td class="th_column_4">구매 수량</td>
	            				<td class="th_column_5">총 매출</td>
	            				<td class="th_column_6">구매 날짜</td>
	            			</tr>
	            		</thead>	
	            		<c:forEach items="${list}" var="list">
	           			<tr>
	            			<td><c:out value="${list.productId}"></c:out></td>
	            			<td><c:out value="${list.productName}"></c:out></td>
	            			<td><c:out value="${list.productPrice}"></c:out></td>
	            			<td><c:out value="${list.outputAmount}"></c:out></td>
	            			<td><c:out value="${list.totalPrice}"></c:out></td>
	            			<td><c:out value="${list.salesDate}"></c:out></td>
	            		</tr>
	            		</c:forEach>
	            	</table>
	            </c:if>
	            <!-- 상품 리스트 X -->
	       		<c:if test="${listcheck == 'empty' || listcheck == 'null'}">
	       			<div class="table_empty">
	       				구매 상품 목록이 없습니다.
	       			</div>
	       		</c:if> 
	       	</div>
	       	
	</div>
</div>

<%@include file="../includes/admin/footer.jsp" %>
</body>
</html>