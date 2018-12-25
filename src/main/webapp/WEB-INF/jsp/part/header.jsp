<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<style type="text/css">
		.navigation {
			padding-right: 400px;
			display: inline;
		}
		.split{
			height: 17px;
			line-height: 51px;
		}
	</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
		<div class="container">
			<h1><a class="navbar-brand" href="${pageContext.request.contextPath}">人在旅途</a></h1>
			<!-- <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav"
			 aria-expanded="false" aria-label="Toggle navigation">
				<span class="oi oi-menu"></span> Menu
			</button> -->

			<div class="collapse navbar-collapse navigation" id="ftco-nav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a href="${pageContext.request.contextPath}" class="nav-link">主页</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/placesView" class="nav-link">目的地</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/hotelView" class="nav-link">酒店</a></li>
					<li class="nav-item"><a href="#" class="nav-link">游记</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/trainView" class="nav-link">火车</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/contactView" class="nav-link">联系</a></li>
				</ul>
			</div>
			
			<div>
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a href="${pageContext.request.contextPath}/loginView" class="nav-link">登陆</a></li>
					<span class="split">|</span>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/registerView" class="nav-link">注册</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- END nav -->
</body>
</html>