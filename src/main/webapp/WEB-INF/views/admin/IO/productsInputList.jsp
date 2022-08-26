<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <!-- top_subject_area -->
            <div class="admin_top_wrap">
                <span>재고관리 페이지</span>
                
            </div>
            <!-- contents-area -->
            <div class="admin_wrap">
                <!-- 네비영역 -->
                <div class="admin_navi_wrap">
                  <ul>
                      <li>
                          <a class="admin_list_01" href="/admin/products/productsEnroll">상품 등록</a>
                      </li>
                      <li>
                          <a class="admin_list_02" href="/admin/products/productsManage">상품 관리</a>
                      </li>
                        <li>
                            <a class="admin_list_04" href="/admin/IO/productsOutput">출고 관리</a>
                        </li>                               
                      <li>
                          <a class="admin_list_03" href="/admin/IO/productsInput">입고 등록</a>
                      </li>                                          
                  </ul>
                </div>
                <div class="admin_content_wrap">
                    <div class="admin_content_subject"><span>입고 목록</span></div>
                </div>
               <div class="goods_table_wrap">
                   <div class="details_table_wrap">
	           	<!-- 입고 목록 O -->
	            <c:if test="${listcheck != 'empty'}">
	            	<table class="details_table">
	            		<thead>
	            			<tr>
								<td class="th_column_1">상품코드</td>
	            				<td class="th_column_2">상품이름</td>
	            				<td class="th_column_3">입고수량</td>
	            				<td class="th_column_4">입고날짜</td>
	            			</tr>
	            		</thead>	
	            		<tbody>
	            		<c:forEach items="${list}" var="list">
	            		<tr>
	            			<td><c:out value="${list.productId}"></c:out></td>
	            			<td><c:out value="${list.productName}"></c:out></td>
	            			<td><c:out value="${list.inputAmount}"></c:out></td>
	            			<td><fmt:formatDate value="${list.inputDate}" pattern="yyyy-MM-dd-hh:mm:ss"/></td>
	            		</tr>
	            		</c:forEach>
	            		</tbody>
	            	</table>
	            </c:if>
	            <!-- 상품 리스트 X -->
	       		<c:if test="${listcheck == 'empty'}">
	       			<div class="table_empty">
	       				입고목록이 없습니다.
	       			</div>
	       		</c:if> 
	       	</div>
                	
               	<!-- 검색 영역 -->
               	<div class="search_wrap">
               		<form id="searchForm" action="/admin/IO/productsInputList" method="get">
               			<div class="search_input">
                   			<input type="text" name="keyword" value='<c:out value="${pageMaker.cri.keyword}"></c:out>' placeholder="상품명을 입력하세요.">
                   			<input type="hidden" name="pageNum" value='<c:out value="${pageMaker.cri.pageNum }"></c:out>'>
                   			<input type="hidden" name="amount" value='${pageMaker.cri.amount}'>
                   			<input type="hidden" name="type" value="G">
                   			<button class='btn search_btn'>검 색</button>                				
               			</div>
               		</form>
               	</div>
                	
                	<!-- 페이지 이름 인터페이스 영역 -->
                	<div class="pageMaker_wrap">
                		<ul class="pageMaker">
                			
                			<!-- 이전 버튼 -->
                			<c:if test="${pageMaker.prev }">
                				<li class="pageMaker_btn prev">
                					<a href="${pageMaker.pageStart -1}">이전</a>
                				</li>
                			</c:if>
                			
                			<!-- 페이지 번호 -->
                			<c:forEach begin="${pageMaker.pageStart }" end="${pageMaker.pageEnd }" var="num">
                				<li class="pageMaker_btn ${pageMaker.cri.pageNum == num ? 'active':''}">
                					<a href="${num}">${num}</a>
                				</li>	
                			</c:forEach>
                		
	                    	<!-- 다음 버튼 -->
	                    	<c:if test="${pageMaker.next}">
	                    		<li class="pageMaker_btn next">
	                    			<a href="${pageMaker.pageEnd + 1 }">다음</a>
	                    		</li>
	                    	</c:if>
	                    </ul>
                	</div>
                	
                	<form id="moveForm" action="/admin/products/productsManage" method="get" >
 						<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
						<input type="hidden" name="amount" value="${pageMaker.cri.amount}">
						<input type="hidden" name="keyword" value="${pageMaker.cri.keyword}">
                	</form>
                
                <div class="clearfix"></div>
            </div>
        
         <%@include file="../includes/admin/footer.jsp" %>

</body>


</html>