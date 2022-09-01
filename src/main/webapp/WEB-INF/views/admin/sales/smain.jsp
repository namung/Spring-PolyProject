<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매출관리 페이지</title>
<style>
.table_empty {
	height: 50px;
	text-align: center;
	margin: 200px 0 215px 0px;
	font-size: 25px;
}

.sales_list {
	display: none;
}
</style>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>

<%@include file="../includes/admin/header.jsp" %>

<h1>매출관리 페이지</h1>

<div class="container">

    <div class="sales_total">
    
    	<a href="choice_sales">[오늘/이번주/이번달/올해] 매출 보러가기</a>
    
        <br>

        <div class="sales_month_check_box">
            <form id="sales_form" method="post">
                <label for="select_month_label">보고 싶은 월을 선택하세요:</label>
                <select id="select_month" name="select_month">
                    <option value="">월을 선택해주세요.</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                </select>

                <button id="send_data" type="button" value="서버 제출 버튼">보내기</button>
            </form>
        </div>
     
    </div>
</div>

<%@include file="../includes/admin/footer.jsp" %>

<script>

$(document).ready(function() {
	
	/* 월 선택 보내기 클릭 */
	$("#send_data").click(function(){
		
		/* 값이 없다면 */
		if ($("#select_month").val() == "") 
		{ 	
			alert("항목을 선택해주세요");
			return false;
		}
		/* 값이 있다면 */
		else 
		{    
			    /* 월 매출 메서드 서버 요청 */
				$("#sales_form").attr("action", "/admin/sales/smain");
			    $("#sales_form").submit();     
		    
		}
	});	
});
</script>
</body>
</html>