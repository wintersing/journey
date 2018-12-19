<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>

	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>“人在旅途”注册</title>

	<!-- CSS -->
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
	<link rel="stylesheet" href="/journey/assets/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/journey/assets/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="/journey/assets/css/form-elements.css">
	<link rel="stylesheet" href="/journey/assets/css/style.css">

	<style>
		.col-center-block {
			float: none;
			display: block;
			margin-left: auto;
			margin-right: auto;
		}
		.size{
			width: 100%;
		}
	</style>
</head>

<body>

	<!-- Top content -->
	<div class="top-content">

		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-5 col-center-block form-box">
						<div class="form-top">
							<div class="form-top-left">
								<h3>人在旅途注册</h3>
							</div>
						</div>
						<div class="form-bottom">
							<form role="form" action="" method="post" class="registration-form">
								<div class="form-group">
									<label for="form-first-name">手机号码</label>
									<input type="text" name="mobile" placeholder="手机号码" class="form-control" id="mobile">
								</div>
								<div class="form-group">
									<label for="form-last-name">密码</label>
									<input type="text" name="password" placeholder="密码" class="form-control" id="password">
								</div>
								<div class="form-group">
									<label for="form-email">验证码</label>
									<div class="form-inline">
										<input type="text" name="code" placeholder="验证码" class="form-control size" id="SMS">
										<input class="btn btn-default" type="button" value="发送验证码" onclick="sendcode()">
									</div>
								</div>
								<button type="submit" class="btn">注册</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Javascript -->
	<script src="/journey/assets/js/jquery-1.11.1.min.js"></script>
	<script src="/journey/assets/bootstrap/js/bootstrap.min.js"></script>
	<script src="/journey/assets/js/jquery.backstretch.min.js"></script>
	<script src="/journey/assets/js/retina-1.1.0.min.js"></script>
	<script src="/journey/assets/js/scripts.js"></script>
	<script type="text/javascript">
		function sendcode() {
			var json = JSON.stringify({
				"mobile": document.getElementById("mobile").value
			})
			$.ajax({
				url: "/journey/sendSMScode",
				type: "POST",
				data: json,
				dataType: "json",
				contentType: "application/json;charset=utf-8",
				success: function (data) {
					console.log(data);
				}
			});
		}
	</script>
</body>

</html>