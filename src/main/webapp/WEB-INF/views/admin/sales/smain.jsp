<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>

<h1>������� ������</h1>

<div class="container">

    <div class="sales_total">
        <div class="sales_check_box">
            <button class="year_btn">���� ����</button>
            <button class="month_btn">�̹� �� ����</button>
            <button class="week_btn">�̹� �� ����</button>
            <input type="month"name="date" id="date">
            <button class="other_month_search">�˻�</button>
        </div>

        <br>

        <div class="sales_month_check_box">
            <form id="sales_form" method="post">
                <label for="select_month_label">Choose Month:</label>
                <select id="select_month" name="select_month">
                    <option value="">���� �������ּ���.</option>
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

                <button id="send_data" type="button" value="���� ���� ��ư">������</button>
            </form>

        </div>
    </div>
</div>


<script>

$(document).ready(function() {
	
	/* ������ �������� �� */
	$("#send_data").click(function(){
		
		/* ���� ���ٸ� */
		if ($("#select_month").val() == "") 
		{ 	
			alert("�׸��� �������ּ���");
		}
		/* ���� �ִٸ� */
		else 
		{    
			    /* �α��� �޼��� ���� ��û */
				$("#sales_form").attr("action", "/admin/sales/smain");
			    $("#sales_form").submit();     
		    
		}
	});
});
	    
 
</script>
</body>
</html>