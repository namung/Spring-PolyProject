<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>

<body>
	<%@include file="../includes/admin/header.jsp" %>
	<div class="admin_content_wrap">
                    <div class="admin_content_subject"><span>상품 상세</span></div>

                    <div class="admin_content_main">

                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>분류코드</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productId" value="<c:out value="${productsInfo.productId}"/>" disabled>
                    			</div>
                    		</div>
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품명</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productName" value="<c:out value="${productsInfo.productName}"/>" disabled>
                    				                    				
                    			</div>
                    		</div>
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>등록날짜</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input value="<fmt:formatDate value='${productsInfo.regDate}' pattern='yyyy-MM-dd'/>" disabled>
                    			</div>
                    		</div>
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>최근 수정 날짜</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input value="<fmt:formatDate value='${productsInfo.updateDate}' pattern='yyyy-MM-dd'/>" disabled>
                    			</div>
                    		</div>                    		                    		
                    		            
              
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>카테고리</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="category" value="<c:out value="${productsInfo.category}"/>" disabled>
                    			</div>
                    		</div>             
                 
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>판매금액</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productPrice" value="<c:out value="${productsInfo.productPrice}"/>" disabled>
                    			</div>
                    		</div>               
                    		
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품이미지</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productImg" value="<c:out value="${productsInfo.productImg}"/>" disabled>
                    			</div>
                    		</div>          		
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>비고</label>
                    			</div>
                    			<div class="form_section_content bit">
                    				<textarea name="etc" disabled>${productsInfo.etc}</textarea>
                    			</div>
                    		</div>        		
                    		
                   			<div class="btn_section">
                   				<button id="cancelBtn" class="btn">상품 목록</button>
	                    		<button id="modifyBtn" class="btn enroll_btn">수정 </button>
	                    	</div> 
                    </div>      

                	
                	<form id="moveForm" action="/admin/products/productsManage" method="get" >
 						<input type="hidden" name="pageNum" value="${cri.pageNum}">
						<input type="hidden" name="amount" value="${cri.amount}">
						<input type="hidden" name="keyword" value="${cri.keyword}">
                	</form>
                	
                </div>
 				<%@include file="../includes/admin/footer.jsp" %>
	<script>
	
	/* 목록 이동 버튼 */
	$("#cancelBtn").on("click", function(e){
		e.preventDefault();
		$("#moveForm").submit();	
	});	
	
	/* 수정 페이지 이동 */
	$("#modifyBtn").on("click", function(e){
		e.preventDefault();
		let addInput = '<input type="hidden" name="productId" value="${productsInfo.productId}">';
		$("#moveForm").append(addInput);
		$("#moveForm").attr("action", "/admin/products/productsModify");
		$("#moveForm").submit();
	});	
	</script>
</body>
</html>