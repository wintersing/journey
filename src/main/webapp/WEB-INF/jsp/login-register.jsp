<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Splash &mdash; Free Website Template, Free HTML5 Template
	by FreeHTML5.co</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by FreeHTML5.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
<meta name="author" content="FreeHTML5.co" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700"
	rel="stylesheet">

<!-- Animate.css -->
<!-- <link rel="stylesheet" href="css/animate.css"> -->
<!-- Bootstrap  -->
<link rel="stylesheet" href="/css/bootstrap.css">

<!-- Theme style  -->
<link rel="stylesheet" href="/css/style.login.css">
<style type="text/css">
.sendMessages {
	display: inline-block;
	padding: 32px 0px 0px 16px;
}

.register {
	padding-top: 12px;
}
.nav{
	padding-right: 300px;
}
.title{
	width: 20%
}
.nav-{
	top:20px
}
</style>


</head>

<body>
	<div id="page">

		<div class="page-inner">
			<nav class="gtco-nav nav-" role="navigation">
				<div class="gtco-container">

					<div class="row">
						<div class="col-sm-4 col-xs-12 title">
							<div id="gtco-logo">
								<a href="/">人在旅途 <em>.</em></a>
							</div>
						</div>
						<div class="col-xs-8 text-right menu-1 nav">
							<ul>
								<li><a href="">主页</a></li>
								<li><a href="/placesView">目的地</a></li>
								<li><a href="/hotelView">酒店</a></li>
								<li><a
									href="/tavelNotesView">游记</a></li>
								<li><a href="/placesView">火车票</a></li>
								<li><a
									href="/contactView">联系</a></li>
							</ul>
						</div>
					</div>

				</div>
			</nav>

			<header id="gtco-header" class="gtco-cover" role="banner"
				style="background-image: url(images/destination-1.jpg)">
				<div class="overlay"></div>
				<div class="gtco-container">
					<div class="row">
						<div class="col-md-12 col-md-offset-0 text-left">


							<div class="row row-mt-15em">
								<div class="col-md-7 mt-text animate-box"
									data-animate-effect="fadeInUp">
									<span class="intro-text-small">欢迎来到人在旅途</span>
									<h1>发现一个新的地方</h1>
								</div>
								<div class="col-md-4 col-md-push-1 animate-box"
									data-animate-effect="fadeInRight">
									<div class="form-wrap">
										<div class="tab">
											<ul class="tab-menu">
												<li class="gtco-first"><a href="#" data-tab="signup">登陆</a></li>
												<li class="gtco-second"><a href="#"
													data-tab="login">注册</a></li>
											</ul>
											<div class="tab-content">
												<div id="login" class="tab-content-inner " data-content="signup">
													<form action="#">
														<div class="row form-group">
															<div class="col-md-12">
																<label for="username">用户名</label> <input type="text"
																	class="form-control" id="username">
															</div>
														</div>
														<div class="row form-group">
															<div class="col-md-12">
																<label for="password">密码</label> <input type="password"
																	class="form-control" id="password">
															</div>
														</div>

														<div class="row form-group">
															<div class="col-md-12">
																<input type="submit" class="btn btn-primary" value="登陆">
															</div>
														</div>
													</form>
												</div>

												<div id="register" class="tab-content-inner" data-content="login">
													<form action="#">
														<div class="row form-group">
															<div class="col-md-12">
																<label for="username">手机号码</label> <input type="text"
																	class="form-control" id="phone">
															</div>
														</div>
														<div class="row form-group">
															<div class="col-md-12">
																<label for="password">用户名</label> <input type="password"
																	class="form-control" id="password">
															</div>
														</div>
														<div class="row form-group">
															<div class="col-md-12">
																<label for="password2">密码</label> <input type="password"
																	class="form-control" id="password2">
															</div>
														</div>
														<div class="row">
															<div class="col-md-7">
																<label for="password2">验证码</label> <input type="text"
																	class="form-control" id="code">
															</div>
															<div class="sendMessages">
																<input id="getCode" onclick="sendMessages()"
																	type="button" class="btn btn-default btn-sm" value="发送" />
															</div>
														</div>
														<div class="row form-group">
															<div class="col-md-12 register">
																<input type="submit" class="btn btn-primary" value="注册">
															</div>
														</div>
													</form>
												</div>

											</div>
										</div>
									</div>
								</div>
							</div>


						</div>
					</div>
				</div>
			</header>
		</div>

		<!-- jQuery -->
		<script src="/js/jquery.min.login.js"></script>
		<!-- Waypoints -->
		<script src="/js/jquery.waypoints.min.login.js"></script>
		<!-- Carousel -->
		<script src="/js/owl.carousel.min.js"></script>
		<!-- Main -->
		<script src="/js/main.login.js"></script>

		<script>
			var InterValObj; //timer变量，控制时间 
			var count = 5; //间隔函数，1秒执行 
			var curCount; //当前剩余秒数 
			var code = ""; //验证码 
			// var codeLength = 6; //验证码长度 
			function sendMessages() {
				curCount = count;
				// var phone = $("#phone").val()
				var phone = "15779819842";
				if (phone != "") {
					//设置button效果，开始计时 
					$("#getCode").attr("disabled", "true");
					$("#getCode").val(curCount + "秒");
					InterValObj = window.setInterval(SetRemainTimes, 1000); //启动计时器，1秒执行一次 
					//向后台发送处理数据 
					//    $.ajax({
					//       url: "getCode.action",
					//       dataType: "json",
					//       type: "get",
					//       data: "phone=" + phone,
					//       success: function(data) {
					//          //保存验证码
					//          $("#code").val(data);
					//       }
					//    });
				} else {
					alert("手机号码不能为空！！！！！！");
				}
			}
			//timer处理函数 
			function SetRemainTimes() {
				if (curCount == 0) {
					window.clearInterval(InterValObj); //停止计时器 
					$("#getCode").removeAttr("disabled"); //启用按钮 
					$("#getCode").val("发送");
					code = ""; //清除验证码。如果不清除，过时间后，输入收到的验证码依然有效   
				} else {
					curCount--;
					$("#getCode").val(curCount + "秒");
				}
			}
			$(document).ready(function(){
				var url = window.location.pathname;
				if(url == "/journey/loginView"){
					$(".gtco-first").addClass("active");
					$("#login").addClass("active");
				} else if(url == "/journey/registerView"){
					$(".gtco-second").addClass("active");
					$("#register").addClass("active");
				}
			})
		</script>
</body>

</html>