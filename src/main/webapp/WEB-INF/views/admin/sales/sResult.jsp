<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sample file</title>
<style>
/* 상품 목록 영역 */
.details_table_wrap{
	padding: 20px 35px
}
.details_table{
	width: 100%;
    border: 1px solid #d3d8e1;
    text-align: center;
    border-collapse: collapse;
}
.details_table td{
	padding: 10px 5px;
	border : 1px solid #e9ebf0;
}
.details_table thead{
	background-color: #f8f9fd;	
	font-weight: 600;
}

.th_column_1{
	width:120px;
}
.th_column_3{
	width:110px;
}
.th_column_4{
	width:140px;
}
.th_column_5{
	width:140px;
}
	
.table_empty{
	height: 50px;
    text-align: center;
    margin: 200px 0 215px 0px;
    font-size: 25px;
}
</style>
</head>
<body>

<%@include file="../includes/admin/header.jsp" %>

<h1>매출관리 페이지</h1>

<div class="container">

	<div class="sales_total">
	        <div class="sales_check_box">
	            <button class="year_btn">올해 매출</button>
	            <button class="month_btn">이번 달 매출</button>
	            <button class="week_btn">이번 주 매출</button>
	            <input type="month"name="date" id="date">
	            <button class="other_month_search">검색</button>
	        </div>

		<h2><span id="month">${selected_month}</span>월 총 합계: ${total}</h2>
		
		<h2>상세보기</h2>
		
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
	            				<td class="th_column_5">구매 날짜</td>
	            			</tr>
	            		</thead>	
	            		<c:forEach items="${list}" var="list">
	           			<tr>
	            			<td><c:out value="${list.productId}"></c:out></td>
	            			<td><c:out value="${list.productName}"></c:out></td>
	            			<td><c:out value="${list.productPrice}"></c:out></td>
	            			<td><c:out value="${list.salesAmount}"></c:out></td>
	            			<td><c:out value="${list.salesDate}"></c:out></td>
	            		</tr>
	            		</c:forEach>
	            	</table>
	            </c:if>
	            <!-- 상품 리스트 X -->
	       		<c:if test="${listcheck == 'empty'}">
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