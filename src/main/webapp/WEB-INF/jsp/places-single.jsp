<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
	<style type="text/css">
		.text{
			margin-right: 15px
		}
	</style>
</head>

<body>

	<%@ include file="./part/header.jsp"%>

	<div class="hero-wrap js-fullheight" style="background-image: url('/images/bg_1.jpg');">
		<div class="overlay"></div>
		<div class="container">
			<div class="row no-gutters slider-text js-fullheight align-items-center justify-content-center" data-scrollax-parent="true">
				<div class="col-md-9 text-center ftco-animate" data-scrollax=" properties: { translateY: '70%' }">
					<!-- <p class="breadcrumbs" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }"><span class="mr-2"><a href="index.html">主页</a></span> <span>酒店</span></p> -->
					<h1 class="mb-3 bread" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">景点</h1>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section ftco-degree-bg">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 sidebar">
					<div class="sidebar-wrap ftco-animate">
						<h3 class="heading mb-4">寻找景点</h3>
						<form action="#">
							<div class="fields">
								<div class="form-group">
									<input name="cityName" type="text" class="form-control" value="${resObj.placesParam.cityName }" placeholder="请输入您要所搜的城市">
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

						<div>
							<label class="form-check-label" for="exampleCheck1">
								<p>
									<a target="_blank" class="news"
										href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
										另一老兵众筹"买梯子"</a>
								</p>
							</label>
						</div>
					</div>
				
					<!-- <div class="sidebar-wrap ftco-animate">
        			<h3 class="heading mb-4">Star Rating</h3>
        			<form method="post" class="star-rating">
							  <div class="form-check">
									<input type="checkbox" class="form-check-input" id="exampleCheck1">
									<label class="form-check-label" for="exampleCheck1">
										<p class="rate"><span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i></span></p>
									</label>
							  </div>
							  <div class="form-check">
						      <input type="checkbox" class="form-check-input" id="exampleCheck1">
						      <label class="form-check-label" for="exampleCheck1">
						    	   <p class="rate"><span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star-o"></i></span></p>
						      </label>
							  </div>
							  <div class="form-check">
						      <input type="checkbox" class="form-check-input" id="exampleCheck1">
						      <label class="form-check-label" for="exampleCheck1">
						      	<p class="rate"><span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star-o"></i><i class="icon-star-o"></i></span></p>
						     </label>
							  </div>
							  <div class="form-check">
							    <input type="checkbox" class="form-check-input" id="exampleCheck1">
						      <label class="form-check-label" for="exampleCheck1">
						      	<p class="rate"><span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star-o"></i><i class="icon-star-o"></i><i class="icon-star-o"></i></span></p>
						      </label>
							  </div>
							  <div class="form-check">
						      <input type="checkbox" class="form-check-input" id="exampleCheck1">
						      <label class="form-check-label" for="exampleCheck1">
						      	<p class="rate"><span><i class="icon-star"></i><i class="icon-star-o"></i><i class="icon-star-o"></i><i class="icon-star-o"></i><i class="icon-star-o"></i></span></p>
							    </label>
							  </div>
							</form>
        		</div> -->
				</div>
				
				<c:if test="${not empty resObj }">
					<c:set var="placesDes" value="${resObj.data }"></c:set>
				</c:if>
				<div class="col-lg-9">
					<div class="row">
						<div class="col-md-12 ftco-animate">
							<div class="single-slider owl-carousel">
								<c:choose>
									<c:when test="${fn:length(placesDes.imageUrls) > 15 }">
										<c:set var="end" value="15"></c:set>
									</c:when>
									<c:otherwise>
										<c:set var="end" value="${fn:length(placesDes.imageUrls) }"></c:set>
									</c:otherwise>
								</c:choose>
								<c:forEach begin="1" end="${end }" var="imageUrl" items="${placesDes.imageUrls }">
									<div class="item">
										<div class="hotel-img" style="background-image: url(${imageUrl });"></div>
									</div>
								</c:forEach>
							</div>
						</div>
						<div class="col-md-12 hotel-single mt-4 mb-5 ftco-animate">
							<p>
								<h2>${placesDes.title }</h2>
								<h5>${placesDes.subtitle }</h5>
								评分：<span class="star">
									<fmt:parseNumber var="rating2" type="number" value="${placesDes.rating }" />
									<c:forEach begin="1" end="${rating2 }">
										<i class="icon-star"></i> 
									</c:forEach>
									<c:if test="${placesDes.rating%1 > 0}">
										<i class="icon-star-half"></i> 
									</c:if>
									${placesDes.rating } 分</span>
								</span>
								<div class="two">
									门票：<span class="price">
										<c:choose>
											<c:when test="${placesDes.price > '0' }">
												
												￥${placesDes.price }
												
											</c:when>
											<c:otherwise>
												<span style="font-size: 15px">免费开放</span>
											</c:otherwise>
										</c:choose>
									</span>
								</div>
							</p>
							<span>开放时间: ${placesDes.openingHours }</span>
							<p class="rate mb-5">
								<span class="loc"><i class="icon-map"></i>${placesDes.city }</span>
								<span class="loc"><i class="icon-map-marker"></i>${placesDes.location }</span>
								<span><a href="/hotel/search?lon=${placesDes.geoPoint.lon }&lat=${placesDes.geoPoint.lat }&distance=3km" class="reply">>>附近酒店</a></span>
							</p>
							<h4>景区描述</h4>
							<p>${placesDes.description }</p>
							<h4>小提示</h4>
							<span>
								${placesDes.tipInfo }
							</span>
						</div>
<div class="pt-5 mt-5">
							<div class="comment-form-wrap pt-5">
								<h3 class="mb-5">发表评论</h3>
								<form action="#" class="p-5 bg-light">
									<div class="form-group">
										<textarea name="comment" id="message" cols="30" rows="4" class="form-control"></textarea>
									</div>
									<div class="form-group">
										<input type="submit" value="发表" class="btn py-3 px-4 btn-primary">
									</div>

								</form>
							</div>

							<div style="padding-top: 100px;">
								<h3 class="mb-5">精彩评论</h3>
								<ul class="comment-list">

									<li class="comment">
										<div class="vcard bio">
											<img src="https://images4.c-ctrip.com/target/Z8020b0000005nydv0C7A_C_180_180.jpg" alt="Image placeholder">
										</div>
										<div class="comment-body">
											<h3>晴天守望</h3>
											<div style="padding-bottom: 10px;">
												<span class="text">景色5</span>
												<span class="text">趣味5</span>
												<span class="text">性价比5</span>
											</div>
											<p>北京最美就是蓝天白云时，这时候你如果一早来到北京颐和园，那蓝天映照着湖水，金黄闪烁的佛香阁，倒影婆娑的西堤古柳，总不沉没的石舫，铜牛守望的十七孔桥……颐和园处处都是美景，足让你神情陶醉，心旷神怡……&#x0A;颐和园一个中国清朝时期皇家园林，曾经的清漪园，坐落在北京西郊，距城区十五公里，占地约二百九十公顷，与圆明园毗邻。它是以昆明湖、万寿山为基址，以杭州西湖为蓝本，汲取江南园林的设计手法而建成的一座大型山水园林，也是保存最完整的一座皇家行宫御苑，被誉为“皇家园林博物馆”真的当之无愧。&#x0A;如果你再乘一条小船，荡漾在硕大的昆明湖中，你一定会沉醉在蓝天碧水、绿柳白桥、远山近楼，这如梦境般的美画中。那移步异景，一孔一画，颐和园定会让你流连忘返，不论你来过多少次，你依旧会喜欢，而且，你总会想再来，再来……</p>
											<div class="meta">2017-07-03T11:50:27</div>
										</div>

									</li>


								</ul>
							</div>
							<!-- END comment-list -->

						</div>
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
	<script src="/js/scrollax.min.js"></script>

	<script src="/js/google-map.js"></script>
	<script src="/js/main.js"></script>

</body>

</html>