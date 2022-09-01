<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<form id="sales_week_form" method="get">
    <input type="radio" name="btn" value="year_btn"> 올해 매출<br>
    <input type="radio" name="btn" value="month_btn"> 이번 달 매출<br>
    <input type="radio" name="btn" value="week_btn"> 이번 주 매출<br>
    <button id="send_week_data" type="button" value="서버 제출 버튼">보내기</button>
</form>
