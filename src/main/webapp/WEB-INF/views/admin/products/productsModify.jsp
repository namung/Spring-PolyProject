<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="//code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" />
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
 <script src="https://cdn.ckeditor.com/ckeditor5/26.0.0/classic/ckeditor.js"></script>
 <script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="//code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
</head>
</head>
<body>
				<%@include file="../includes/admin/header.jsp" %>
				
                <div class="admin_content_wrap">
                    <div class="admin_content_subject"><span>상품수정</span></div>
                    <div class="admin_content_main">
                    	<form action="/admin/products/productsModify" method="post" id="modifyForm">
                    	
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>분류코드</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productId" value="${productsInfo.productId}" disabled>
                    			</div>
                    		</div>
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품명</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productName" value="${productsInfo.productName}" disabled>
                    			</div>
                    		</div>            
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>카테고리</label>
                    			</div>
                     			<div class="form_section_content">
                    				<input name="category" value="${productsInfo.category}">
                    				<span class="ck_warn bookName_warn">카테고리를 입력해주세요.</span>
                    			</div>
                    		</div>            
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>판매금액</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productPrice" value="${productsInfo.productPrice}">
                    				<span class="ck_warn publisher_warn">판매금액을 입력해주세요.</span>
                    			</div>
                    		</div>             
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품재고</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productStock" value="${productsInfo.productStock}">
                    				<span class="ck_warn publisher_warn">상품재고를 입력해주세요.</span>
                    			</div>
                    			                  				                 
                    		</div>          
                    		
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 이미지</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productImg" value="${productsInfo.productImg}">
                    				<span class="ck_warn bookPrice_warn">상품이미지를 업로드해주세요.</span>
                    			</div>
                    		</div>               
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>비고</label>
                    			</div>
                    			<div class="form_section_content">
                    				<textarea name="etc" >${productsInfo.etc}</textarea>
                    				<span class="ck_warn bookStock_warn">비고사항을 입력해주세요.</span>
                    			</div>
                    		</div>          
                    		
                    		<input type="hidden" name='productId' value="${productsInfo.productId}">
                   </form>
                   			<div class="btn_section">
                   				<button id="cancelBtn" class="btn">취 소</button>
	                    		<button id="modifyBtn" class="btn modify_btn">수 정</button>
	                    		<button id="deleteBtn" class="btn delete_btn">삭 제</button>
	                    	</div> 
                    </div>  
                	<form id="moveForm" action="/admin/products/productsManage" method="get" >
 						<input type="hidden" name="pageNum" value="${cri.pageNum}">
						<input type="hidden" name="amount" value="${cri.amount}">
						<input type="hidden" name="keyword" value="${cri.keyword}">
						<input type="hidden" name='productId' value="${productsInfo.productId}">
                	</form>                     
                </div>
 
 				<%@include file="../includes/admin/footer.jsp" %>
 	<script>
 	/*취소버튼*/
	 $("#cancelBtn").on("click", function(e){
		 e.preventDefault();
		 $("#moveForm").submit();
	 });
	 
	 /*수정버튼*/
	 $("#modifyBtn").on("click",function(e){
		 e.preventDefault();
	 	$("#modifyForm").submit();
	 });
	 
	 /* 삭제 버튼 */
		$("#deleteBtn").on("click", function(e){
			e.preventDefault();
			let moveForm = $("#moveForm");
			moveForm.find("input").remove();
			moveForm.append('<input type="hidden" name="productId" value="${productsInfo.productId}">');
			moveForm.attr("action", "/admin/products/productsDelete");
			moveForm.attr("method", "post");
			moveForm.submit();
		});
	 </script>
</body>
</html>