<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <link rel="canonical" href="https://getbootstrap.com/docs/4.4/examples/dashboard/">

    <!-- Bootstrap core CSS -->
<link href="/docs/4.4/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


<%@include file="header.jsp" %>
            <!-- top_subject_area -->
            <div class="admin_top_wrap">
                <span>재고관리 페이지</span>
                
            </div>
            <!-- contents-area -->
            <div class="container-fluid">
			  <div class="row">
			    <nav class="col-md-2 d-none d-md-block bg-light sidebar">
			      <div class="sidebar-sticky">
			        <ul class="nav flex-column">
			          <li class="nav-item">
			            <a class="nav-link active" href="/admin/products/productsEnroll">
			              
			              상품 등록 <span class="sr-only">(current)</span>
			            </a>
			          </li>
			          <li class="nav-item">
			            <a class="nav-link" href="/admin/products/productsManage">
			             
			              전체 상품 관리
			            </a>
			          </li>
			          <li class="nav-item">
			            <a class="nav-link" href="/admin/IO/productsInput">
			             
			              입고 등록
			            </a>
			          </li>
			          <li class="nav-item">
			            <a class="nav-link" href="/admin/IO/productsInputList">
			            
			              입고 내역
			            </a>
			          </li>
			          <li class="nav-item">
			            <a class="nav-link" href="/admin/IO/productsOutput">
			            
			              출고 등록
			            </a>
			          </li>
			          <li class="nav-item">
			            <a class="nav-link" href="/admin/IO/productsOutputList">
			           
			              출고 내역
			            </a>
			          </li>
			        </ul>
                </div>
                </nav>
              </div>
