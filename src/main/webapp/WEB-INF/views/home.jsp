<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>HOME</title>
	<!-- Bootstrap core CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class="jumbotron">
  <h1 class="display-4">관리자 페이지</h1>
  <p class="lead">매출관리, 재고관리, 메뉴관리 기능을 제공하는 페이지입니다.</p>
  <hr class="my-4">
  <p>관리자 페이지로 이동하려면, 아래 버튼을 클릭해주세요.</p>
  <a class="btn btn-primary btn-lg" href="main" role="button">관리자 페이지로 이동하기</a>
</div>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
