<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출고 등록 페이지</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<style>
/* 관리자 컨텐츠 메인 영역 */
.form_section{
	width: 95%;
    margin-left: 2%;
    margin-top: 20px;
    border: 1px solid #dbdde2;
    background-color: #efefef;	
}
.form_section_title{
	padding: 20px 35px;	
}
.form_section_title label{
	display: block;
    font-size: 20px;
    font-weight: 800;
}
.form_section_content{
	padding: 20px 35px;
    border-top: 1px solid #dbdde2;	
}
.form_section_content input{
	width: 98%;
    height: 25px;
    font-size: 20px;
    padding: 5px 1%;
}
.form_section_content select{
	width: 98%;
    height: 35px;
    font-size: 20px;
    text-align-last: center;
}


/* 버튼 영역 */
.btn_section{
	text-align: center;
	margin: 80px 0;
}
.btn{
    min-width: 180px;
    padding: 4px 30px;
    font-size: 25px;
    font-weight: 600;
    line-height: 40px;
}
.enroll_btn{
	background-color: #dbdde2;
	margin-left:15px;
}
#enrollBtn:hover {
    background-color: #c9cbd0;
}
</style>
</head>
<body>	
	<%@include file="../includes/admin/header.jsp" %>
            <!-- top_subject_area -->
            <div class="admin_top_wrap">
                <span>출고 등록 페이지</span>
                
            </div>
            <!-- contents-area -->
            <div class="admin_wrap">
                <!-- 네비영역 -->
                <div class="admin_navi_wrap">
                  <ul>

                      <li>
                          <a class="admin_list_02" href="/admin/IO/productsOutputList">출고 내역</a>
                      </li>                                                                           
                  </ul>
                </div>
                <div class="admin_content_wrap">
                    <div class="admin_content_subject"><span>출고 등록</span></div>
                <div class="admin_content_main">
                
                    	<form action="/admin/IO/productsOutput.do" id="outputForm" method = "post">
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품아이디(분류코드)</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="productId">
                    			</div>
                    		</div>
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>출고 수량</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="outputputAmount">
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
            </div>
        
        <%@include file="../includes/admin/footer.jsp" %>
 <script>
 let outputForm = $("#outputForm")

/* 취소 버튼 */
$("#cancelBtn").click(function(){
    location.href="/admin/IO/productsOutput"
});
 
/* 등록 버튼 */
$("#enrollBtn").on("click", function(e){ 
	e.preventDefault();
    outputForm.submit();
});
</script>
</body>
</html>