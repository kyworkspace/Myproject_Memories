<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Navigation -->
  <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="/">Our Memories</a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      
      
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
          <a  href="#" class="btn btn-primary">로그인</a>
          <span class="nav-link" style = "color:white;">님 환영 합니다.</span>
          <a  href="#" class="btn btn-danger">로그아웃</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="about.html">마이페이지</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/makerInformation/main">제작자 정보</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="contact.html">Contact</a>
          </li>
          
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPages" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              		게시판보기
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPages">
              <a class="dropdown-item" href="/board/main">게시판</a>
              <a class="dropdown-item" href="/picture/main">사진첩</a>
              <a class="dropdown-item" href="/video/main">동영상</a>
            </div>
          </li>
        </ul>
      </div>
    </div>
  </nav>