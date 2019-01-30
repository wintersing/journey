<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html>
<html lang="zh-CN">

<head>
<title>旅游攻略,自由行 - 人在旅途</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Abril+Fatface"
	rel="stylesheet">

<link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">

<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">

<link rel="stylesheet" href="css/aos.css">

<link rel="stylesheet" href="css/ionicons.min.css">

<link rel="stylesheet" href="css/bootstrap-datepicker.css">
<link rel="stylesheet" href="css/jquery.timepicker.css">


<link rel="stylesheet" href="css/flaticon.css">
<link rel="stylesheet" href="css/icomoon.css">
<link rel="stylesheet" href="css/style.css">
</head>

<body>

	<%@ include file="./part/header.jsp"%>

	<div class="hero-wrap js-fullheight"
		style="background-image: url('images/bg_1.jpg');">
		<div class="overlay"></div>
		<div class="container">
			<div
				class="row no-gutters slider-text js-fullheight align-items-center justify-content-center"
				data-scrollax-parent="true">
				<div class="col-md-9 text-center ftco-animate"
					data-scrollax=" properties: { translateY: '70%' }">
					<p class="breadcrumbs"
						data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">
						<span class="mr-2"><a href="index.html">Home</a></span> <span>Places</span>
					</p>
					<h1 class="mb-3 bread"
						data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">景点</h1>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 sidebar order-md-last ftco-animate">
					<div class="sidebar-wrap ftco-animate">
						<h3 class="heading mb-4">寻找景点</h3>
						<form action="${pageContext.request.contextPath}/searchPlaces">
							<div class="fields">
								<div class="form-group">
									<input name="cityName" type="text" class="form-control"
										placeholder="请输入您要所搜的城市">
								</div>
								<c:choose>
									<c:when test="${not empty resObj.cityid}">
										<input name="pageToken" type="hidden" value="${resObj.pageToken }">
									</c:when>
									<c:otherwise>
										<input name="pageToken" type="hidden" value="1">
									</c:otherwise>
								</c:choose>
								<c:if test="${resObj.hasNext == '1' }">
									<input name="hasNext" type="hidden" value="1">
								</c:if>
								<c:if test="${resObj.hasNext == '0' }">
									<input name="hasNext" type="hidden" value="0">
								</c:if>
								<div class="form-group">
									<div class="select-wrap one-third">
										<div class="icon">
											<span class="ion-ios-arrow-down"></span>
										</div>
										<select name="sort" id="" class="form-control"
											placeholder="Keyword search">
											<option value="1">人气最高</option>
											<option value="2">距离最近</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<input type="submit" value="Search"
										class="btn btn-primary py-3 px-5">
								</div>
							</div>
						</form>
					</div>
					<div class="sidebar-wrap ftco-animate">
						<h3 style="color: darkgoldenrod;" class="heading mb-4">新闻资讯</h3>
						<p>
							<a target="_blank" class="news"
								href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
								另一老兵众筹"买梯子"</a>
						</p>

						<p>
							<a target="_blank" class="news"
								href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
								另一老兵众筹"买梯子"</a>
						</p>

						<p>
							<a target="_blank" class="news"
								href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
								另一老兵众筹"买梯子"</a>
						</p>

						<p>
							<a target="_blank" class="news"
								href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
								另一老兵众筹"买梯子"</a>
						</p>

						<p>
							<a target="_blank" class="news"
								href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
								另一老兵众筹"买梯子"</a>
						</p>

						<p>
							<a target="_blank" class="news"
								href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
								另一老兵众筹"买梯子"</a>
						</p>

					</div>
				</div>
				<!-- END-->
				<div class="col-lg-9">
					<div class="row">
					<c:forEach var="placesItem" begin="0" end="${fn:length(resObj.dataList)}" items="${resObj.dataList }">
						<div class="col-sm col-md-6 col-lg-4 ftco-animate">
							<div class="destination">
								<a href="#"
									class="img img-2 d-flex justify-content-center align-items-center"
									style="background-image: url(${placesItem.imageUrls[0] });">
									<div
										class="icon d-flex justify-content-center align-items-center">
										<span class="icon-link"></span>
									</div>
								</a>
								<div class="text p-3">
									<div class="d-flex">
										<div class="one">
											<h3>
												<a href="#">${placesItem.title }</a>
											</h3>
											<p class="rate">
											<fmt:parseNumber var="rating" type="number" value="${placesItem.rating}" />
											<c:forEach begin="1" end="${rating }">
												<i class="icon-star"></i> 
											</c:forEach>
											<c:if test="${placesItem.rating%1 > 0}">
												<i class="icon-star-half"></i> 
											</c:if>
													<span>${placesItem.rating}/5.0分</span>
											</p>
										</div>
										<div class="two">
											<span class="price"> 
												<c:choose>
													<c:when test="${placesItem.price > '0' }">
														
														￥${placesItem.price }
														
													</c:when>
													<c:otherwise>
														<p style="font-size: 15px">免费开放</p>
													</c:otherwise>
												</c:choose>
											</span>
										</div>
									</div>
									<p${placesItem.subtitle }</p>
									<p class="days openinghours">开放时间：${placesItem.openingHours }</p>
									<hr>
									<p class="bottom-area d-flex">
										<span><i class="icon-map-o"></i>${placesItem.city }</span> <span
											class="ml-auto"><a href="#">发现</a></span>
									</p>
								</div>
							</div>
						</div>
						</c:forEach>
					</div>
					<div class="row mt-5">
						<div class="col text-center">
							<div class="block-27">
							<c:choose>
								<c:when test="${resObj.pageToken-5 <= 0}">
									<c:set var="begin_" value="1" scope="page"/>
								</c:when>
								<c:otherwise>
									<c:set var="begin_" value="${resObj.pageToken-5}" scope="page"/>
								</c:otherwise>
							</c:choose>
								<ul>
									<li id="toLeft"><a href="${resObj.reqURI }?cityid=${resObj.cityid}&pageToken=${resObj.pageToken-2 }&hasNext=${resObj.hasNext}&sort=${resObj.sort}">&lt;</a></li>
									<c:forEach var="j" begin="${begin_ }" end="${resObj.pageToken-1 }">
										<li id="li-${j }"><a href="${resObj.reqURI}?cityid=${resObj.cityid}&pageToken=${j }&hasNext=${resObj.hasNext}&sort=${resObj.sort}">${j }</a></li>
									</c:forEach>
									<c:if test="${resObj.hasNext == '1' }">
										<li id="li-${resObj.pageToken }"><a href="${resObj.reqURI}?cityid=${resObj.cityid}&pageToken=${resObj.pageToken }&hasNext=${resObj.hasNext}&sort=${resObj.sort}">${resObj.pageToken }</a></li>
									</c:if>
									<li id="toRight"><a href="${resObj.reqURI}?cityid=${resObj.cityid}&pageToken=${resObj.pageToken }&hasNext=${resObj.hasNext}&sort=${resObj.sort}">&gt;</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<!-- .col-md-8 -->
			</div>
		</div>
	</section>
	<!-- .section -->

	<section class="ftco-section-parallax">
		<div class="parallax-img d-flex align-items-center">
			<div class="container">
				<div class="row d-flex justify-content-center">
					<div
						class="col-md-7 text-center heading-section heading-section-white ftco-animate">
						<h2>Subcribe to our Newsletter</h2>
						<p>Far far away, behind the word mountains, far from the
							countries Vokalia and Consonantia, there live the blind texts.
							Separated they live in</p>
						<div class="row d-flex justify-content-center mt-5">
							<div class="col-md-8">
								<form action="#" class="subscribe-form">
									<div class="form-group d-flex">
										<input type="text" class="form-control"
											placeholder="Enter email address"> <input
											type="submit" value="Subscribe" class="submit px-3">
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<%@ include file="./part/footer.jsp"%>


	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen">
		<svg class="circular" width="48px" height="48px">
			<circle class="path-bg" cx="24" cy="24" r="22" fill="none"
				stroke-width="4" stroke="#eeeeee" />
			<circle class="path" cx="24" cy="24" r="22" fill="none"
				stroke-width="4" stroke-miterlimit="10" stroke="#F96D00" /></svg>
	</div>


	<script src="js/jquery.min.js"></script>
	<script src="js/jquery-migrate-3.0.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/jquery.stellar.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/aos.js"></script>
	<script src="js/jquery.animateNumber.min.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/scrollax.min.js"></script>

	<script src="js/google-map.js"></script>
	<script src="js/main.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){ 
		   $("#li-${resObj.pageToken-1 }").prop("class","active");
			if ("${resObj.pageToken-1 }" == "1") {
				$("#li-1 > a").prop("class","entry");
				$("#toLeft > a").prop("class","entry");
			}
			if ("${resObj.hasNext }" == "0") {
				$("#toRight > a").prop("class","entry");
				$("#li-${resObj.pageToken-1 } > a").prop("class","entry");
			}
		}); 
		
	</script>
</body>
</html>