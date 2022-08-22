<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome AdminPage</title>
<!-- Bootstrap core CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/main">관리자페이지</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      
      <!-- 로그인 x -->
       <c:if test = "${member == null }">
       <li class="nav-item">
       <p class="nav-link">로그인해주세요.</p>
       </li>
       <li class="nav-item">
           <a class="nav-link" href="/member/login">로그인</a>
       </li> 
       <li class="nav-item">
           <a class="nav-link" href="/member/join">회원가입</a>
       </li>
       </c:if>
       
       <!-- 로그인 o -->
       <c:if test="${member != null }">
      <li class="nav-item">
        <a class="nav-link" href="/admin/sales/smain">매출관리</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/admin/products/promain">재고관리</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/admin/menu/mmain">메뉴관리</a>
      </li>
      <li class="nav-item">
    	<a class="nav-link" id="gnb_logout_button">로그아웃</a>
      </li>
      </c:if>    
      
      <li class="nav-item">
          <a class="nav-link" href="#">고객센터</a>
      </li>
    </ul>
  </div>
</nav>
<div class="wrapper">
	<div class="wrap">
		<div class="top_area">

			<div class="login_area">
			<!-- 로그인 하지 않은 상태 -->
                <c:if test = "${member == null }">
                    <div class="login_button"><a href="/member/login">로그인</a></div>
                    <span><a href="/member/join">회원가입</a></span>                
                </c:if>
                <!-- 로그인한 상태 -->
                <c:if test="${ member != null }">
                    <div class="login_success_area">
                        <span>관리자이름 : ${member.adName}</span>
                    	<a href="/member/logout.do">로그아웃</a>
                    </div>
                </c:if>
			</div>
			<div class="clearfix"></div>			
		</div>
		<div class="navi_bar_area">
			<h1>navi area</h1>
		</div>
		<div class="content_area">
			<h1>content area</h1>
		</div>
	<!-- Footer 영역 -->        
	<div class="container">
	  <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
	    <p class="col-md-4 mb-0 text-muted">&copy; ANOTHER</p>
	  </footer>
	</div>
        
</div>
<script>
 
    /* gnb_area 로그아웃 버튼 작동 */
    $("#gnb_logout_button").click(function(){
    	//alert("버튼 작동");
        $.ajax({
            type:"POST",
            url:"/member/logout.do",
            success:function(data){
                alert("로그아웃 성공");
                document.location.reload();     
            } 
        }); // ajax 
    });
    
</script>
</body>
</html>