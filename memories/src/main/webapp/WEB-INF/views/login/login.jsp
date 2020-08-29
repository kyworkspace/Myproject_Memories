<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link href="${pageContext.request.contextPath}/resources/css_login/login.css" rel="stylesheet">

<!-- This snippet uses Font Awesome 5 Free as a dependency. You can download it at fontawesome.io! -->

<script>
function signUp(){
	const form = $("#loginForm");
	form.attr("action","/login/signUp.go")
	form.submit();
}
function login(){
	
	const form = $("#loginForm");
	$("#userId").val($("#inputUserId").val());
	$("#password").val($("#inputPassword").val());
	form.attr("action","/login/login.do");
	form.submit();
	
}
</script>

<body>
<form id="loginForm" method="POST">
	<input type = "hidden" id="userId" />
	<input type = "hidden" id="password" />
</form>

  <div class="container">
    <div class="row">
      <div class="col-lg-10 col-xl-9 mx-auto">
        <div class="card card-signin flex-row my-5">
          <div class="card-img-left d-none d-md-flex">
             <!-- Background image for card set in CSS! -->
          </div>
          <div class="card-body">
            <h5 class="card-title text-center">로그인</h5>
            <form class="form-signin">
              <div class="form-label-group">
                <input type="text" id="inputUserId" class="form-control" placeholder="Username" required autofocus>
                <label for="inputUserId">ID</label>
              </div>
              <hr>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                <label for="inputPassword">Password</label>
              </div>

              <button class="btn btn-lg btn-primary btn-block text-uppercase" onclick="login()" >로그인</button>
              <a class="d-block text-center mt-2 small" href="javascript:signUp()">회원가입</a>
              <hr class="my-4">
              <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit"><i class="fab fa-google mr-2"></i> Sign up with Google</button>
              <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit"><i class="fab fa-facebook-f mr-2"></i> Sign up with Facebook</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>