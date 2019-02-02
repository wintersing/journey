<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
	<title>旅游攻略,自由行 - 人在旅途</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Abril+Fatface" rel="stylesheet">

	<link rel="stylesheet" href="/css/open-iconic-bootstrap.min.css">
	<link rel="stylesheet" href="/css/animate.css">

	<link rel="stylesheet" href="/css/owl.carousel.min.css">
	<link rel="stylesheet" href="/css/owl.theme.default.min.css">
	<link rel="stylesheet" href="/css/magnific-popup.css">

	<link rel="stylesheet" href="/css/aos.css">

	<link rel="stylesheet" href="/css/ionicons.min.css">

	<link rel="stylesheet" href="/css/bootstrap-datepicker.css">
	<link rel="stylesheet" href="/css/jquery.timepicker.css">


	<link rel="stylesheet" href="/css/flaticon.css">
	<link rel="stylesheet" href="/css/icomoon.css">
	<link rel="stylesheet" href="/css/style.css">
</head>

<body>

	<%@ include file="./part/header.jsp" %>

	<div class="hero-wrap js-fullheight" style="background-image: url('/images/bg_1.jpg');">
		<div class="overlay"></div>
		<div class="container">
			<div class="row no-gutters slider-text js-fullheight align-items-center justify-content-center" data-scrollax-parent="true">
				<div class="col-md-9 text-center ftco-animate" data-scrollax=" properties: { translateY: '70%' }">
					<!-- <p class="breadcrumbs" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }"><span class="mr-2"><a href="index.html">主页</a></span> <span>酒店</span></p> -->
					<h1 class="mb-3 bread" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">酒店</h1>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section ftco-degree-bg">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 sidebar">
					<div class="sidebar-wrap ftco-animate">
						<h3 class="heading mb-4">寻找酒店</h3>
						<form action="#">
							<div class="fields">
								<div class="form-group">
									<input name="city" type="text" class="form-control" placeholder="请输入您要所搜的城市">
								</div>
								<div class="form-group">
									<div class="select-wrap one-third">
										<div class="icon"><span class="ion-ios-arrow-down"></span></div>
										<select name="level" id="" class="form-control" placeholder="Keyword search">
											<option value="">请选择酒店星级</option>
											<option value="五星级/豪华">五星级/豪华</option>
											<option value="四星级/高档">四星级/高档</option>
											<option value="三星级/舒适">三星级/舒适</option>
											<option value="二星级/经济">二星级/经济</option>
											<option value="客栈/旅馆">客栈/旅馆</option>
											<option value="其他">其他</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<input name="brandName" type="text" id="checkin_date" class="form-control" placeholder="请输入您要搜索的酒店品牌">
								</div>
								<!-- <div class="form-group">
						              	<div class="range-slider">
						              		<span>
										    <input type="number" value="25000" min="0" max="120000"/>	-
										    <input type="number" value="50000" min="0" max="120000"/>
										  </span>
										  <input value="1000" min="0" max="120000" step="500" type="range"/>
										  <input value="50000" min="0" max="120000" step="500" type="range"/>
										  </svg>
										</div>
		              			</div> -->
								<div class="form-group">
									<input type="submit" value="Search" class="btn btn-primary py-3 px-5">
								</div>
							</div>
						</form>
					</div>
				</div>
				
				<c:if test="${not empty resObj }">
					<c:set var="hotelDes" value="${resObj.dataList[0] }"></c:set>
				</c:if>
				<div class="col-lg-9">
					<div class="row">
						<div class="col-md-12 ftco-animate">
							<div class="single-slider owl-carousel">
								<c:forEach var="imageUrl" items="${hotelDes.imageUrls }">
									<div class="item">
										<div class="hotel-img" style="background-image: url(${imageUrl });"></div>
									</div>
								</c:forEach>
							</div>
						</div>
						<div class="col-md-12 hotel-single mt-4 mb-5 ftco-animate">
							<h2>${hotelDes.title }</h2>
							<span>${hotelDes.openingHours }</span>
							<p class="rate mb-5">
								<span class="loc"><a href="#"><i class="icon-map"></i>${hotelDes.address }</a></span>
								<span class="star">
									<fmt:parseNumber var="rating2" type="number" value="${hotelDes.rating }" />
									<c:forEach begin="1" end="${rating2 }">
										<i class="icon-star"></i> 
									</c:forEach>
									<c:if test="${hotelDes.rating%1 > 0}">
										<i class="icon-star-half"></i> 
									</c:if>
									${hotelDes.rating } 分</span>
							</p>
							<p>${hotelDes.description }</p>
							<div class="d-md-flex mt-5 mb-5">
								<ul class="ml-md-5">
									<h4>标签</h4>
									<c:if test="${not empty hotelDes.tags }">
										<c:forEach var="tag" items="${hotelDes.tags }">
											<li>${tag }</li>
										</c:forEach>
									</c:if>
								</ul>
								<ul class="ml-md-5">
									<h4>基本服务</h4>
									<c:if test="${not empty hotelDes.services }">
										<c:forEach var="service" items="${hotelDes.services }">
											<li>${service.name }</li>
										</c:forEach>
									</c:if>
								</ul>
								<ul class="ml-md-5">
									<h4>其他服务</h4>
									<c:if test="${not empty hotelDes.assistServices }">
										<c:forEach var="assistService" items="${hotelDes.assistServices }">
											<li>${assistService }</li>
										</c:forEach>
									</c:if>
								</ul>
								<ul class="ml-md-5">
									<h4>酒店设施</h4>
									<c:if test="${not empty hotelDes.facilities }">
										<c:forEach var="facilities" items="${hotelDes.facilities }">
											<li>${facilities }</li>
										</c:forEach>
									</c:if>
									<c:if test="${not empty hotelDes.infrastructures }">
										<c:forEach var="infrastructure" items="${hotelDes.infrastructures }">
											<li>${infrastructure }</li>
										</c:forEach>
									</c:if>
								</ul>
							</div>
							<p>When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her
								hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane.
								Pityful a rethoric question ran over her cheek, then she continued her way.</p>
						</div>
						<div class="col-md-12 hotel-single ftco-animate mb-5 mt-5">
							<h4 class="mb-4"><a href="#">发现附近</a></h4>
							<div class="row">
								<div class="col-md-4">
									<div class="destination">
										<a href="hotel-single.html" class="img img-2" style="background-image: url(/images/hotel-1.jpg);"></a>
										<div class="text p-3">
											<div class="d-flex">
												<div class="one">
													<h3><a href="hotel-single.html">Hotel, Italy</a></h3>
													<p class="rate">
														<i class="icon-star"></i>
														<i class="icon-star"></i>
														<i class="icon-star"></i>
														<i class="icon-star"></i>
														<i class="icon-star-o"></i>
														<span>8 Rating</span>
													</p>
												</div>
												<div class="two">
													<span class="price per-price">$40<br><small>/night</small></span>
												</div>
											</div>
											<p>Far far away, behind the word mountains, far from the countries</p>
											<hr>
											<p class="bottom-area d-flex">
												<span><i class="icon-map-o"></i> Miami, Fl</span>
												<span class="ml-auto"><a href="#">Book Now</a></span>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="destination">
										<a href="hotel-single.html" class="img img-2" style="background-image: url(/images/hotel-2.jpg);"></a>
										<div class="text p-3">
											<div class="d-flex">
												<div class="one">
													<h3><a href="hotel-single.html">Hotel, Italy</a></h3>
													<p class="rate">
														<i class="icon-star"></i>
														<i class="icon-star"></i>
														<i class="icon-star"></i>
														<i class="icon-star"></i>
														<i class="icon-star-o"></i>
														<span>8 Rating</span>
													</p>
												</div>
												<div class="two">
													<span class="price per-price">$40<br><small>/night</small></span>
												</div>
											</div>
											<p>Far far away, behind the word mountains, far from the countries</p>
											<hr>
											<p class="bottom-area d-flex">
												<span><i class="icon-map-o"></i> Miami, Fl</span>
												<span class="ml-auto"><a href="#">Book Now</a></span>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="destination">
										<a href="hotel-single.html" class="img img-2" style="background-image: url(/images/hotel-3.jpg);"></a>
										<div class="text p-3">
											<div class="d-flex">
												<div class="one">
													<h3><a href="hotel-single.html">Hotel, Italy</a></h3>
													<p class="rate">
														<i class="icon-star"></i>
														<i class="icon-star"></i>
														<i class="icon-star"></i>
														<i class="icon-star"></i>
														<i class="icon-star-o"></i>
														<span>8 Rating</span>
													</p>
												</div>
												<div class="two">
													<span class="price per-price">$40<br><small>/night</small></span>
												</div>
											</div>
											<p>Far far away, behind the word mountains, far from the countries</p>
											<hr>
											<p class="bottom-area d-flex">
												<span><i class="icon-map-o"></i> Miami, Fl</span>
												<span class="ml-auto"><a href="#">Book Now</a></span>
											</p>
										</div>
									</div>
								</div>
							</div>
						</div>

					</div>
				</div> <!-- .col-md-8 -->
			</div>
		</div>
	</section> <!-- .section -->


 <%@ include file="./part/footer.jsp" %>



	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px">
			<circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee" />
			<circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00" /></svg></div>


	<script src="/js/jquery.min.js"></script>
	<script src="/js/jquery-migrate-3.0.1.min.js"></script>
	<script src="/js/popper.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/jquery.easing.1.3.js"></script>
	<script src="/js/jquery.waypoints.min.js"></script>
	<script src="/js/jquery.stellar.min.js"></script>
	<script src="/js/owl.carousel.min.js"></script>
	<script src="/js/jquery.magnific-popup.min.js"></script>
	<script src="/js/aos.js"></script>
	<script src="/js/jquery.animateNumber.min.js"></script>
	<script src="/js/bootstrap-datepicker.js"></script>
	<script src="/js/jquery.timepicker.min.js"></script>
	<script src="/js/scrollax.min.js"></script>

	<script src="/js/google-map.js"></script>
	<script src="/js/main.js"></script>

</body>

</html>