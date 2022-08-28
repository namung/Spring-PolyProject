<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%@include file="../includes/admin/pheader.jsp" %>
                <div class="admin_content_wrap">
                    <div class="admin_content_subject"><span>상품 등록</span></div>
                <div class="admin_content_main">
                    	<form action="/admin/products/productsEnroll.do" id="enrollForm" method = "post">
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>분류코드</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productId">
                    			</div>
                    		</div>
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>음식명</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productName">
                    			</div>
                    		</div>
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>카테고리</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="category">
                    			</div>
                    		</div>
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>판매금액</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productPrice">
                    			</div>
                    		</div>
                    		
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품이미지</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productImg">
                    			</div>
                    		</div>
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>비고</label>
                    			</div>
                    			<div class="form_section_content">
                    				<textarea name="etc"></textarea>
                    			</div>
                    		</div>
                   		</form>
                   			<div class="btn_section">
                   				<button id="cancelBtn" class="btn">취 소</button>
	                    		<button id="enrollBtn" class="btn enroll_btn">등 록</button>
	                    	</div> 
                    </div>
                </div>
                <div class="clearfix"></div>

        
        <%@include file="../includes/admin/footer.jsp" %>
 <script>
 let enrollForm = $("#enrollForm")

/* 취소 버튼 */
$("#cancelBtn").click(function(){
    location.href="/admin/products/productsManage"
});
 
/* 등록 버튼 */
$("#enrollBtn").on("click", function(e){ 
	e.preventDefault();
    enrollForm.submit();
});
 
 
</script>
</body>
</html>