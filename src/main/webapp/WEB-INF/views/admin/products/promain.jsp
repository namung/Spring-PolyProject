<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/admin/main.css">
 
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
</head>
<body>
 
    <%@include file="../includes/admin/header.jsp" %>
            <!-- top_subject_area -->
            <div class="admin_top_wrap">
                <span>재고관리 페이지</span>
                
            </div>
            <!-- contents-area -->
            <div class="admin_wrap">
                <!-- 네비영역 -->
                <div class="admin_navi_wrap">
                    <ul>
                        <li >
                            <a class="admin_list_01" href="/admin/products/productsEnroll">상품 등록</a>
                        </li>
                        <li>
                            <a class="admin_list_02" href="/admin/products/productsManage">상품 관리</a>
                        </li>
                                                                                 
                    </ul>
                </div>
                <div class="admin_content_wrap">
                    <div>재고관리 페이지 입니다.</div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
    </div>
  <%@include file="../includes/admin/footer.jsp" %>
</body>
</html>
