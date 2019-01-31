<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
.hotel-des {
    width: 230px;
    height: 108px;
    overflow: hidden;
    display: -webkit-box;
    -webkit-box-orient: vertical;
    -webkit-line-clamp: 4;
}
</style>
</head>

<body>

	<%@ include file="./part/header.jsp"%>

	<div class="hero-wrap js-fullheight"
		style="background-image: url('/images/bg_1.jpg');">
		<div class="overlay"></div>
		<div class="container">
			<div
				class="row no-gutters slider-text js-fullheight align-items-center justify-content-center"
				data-scrollax-parent="true">
				<div class="col-md-9 text-center ftco-animate"
					data-scrollax=" properties: { translateY: '70%' }">
					<!-- <p class="breadcrumbs" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }"><span class="mr-2"><a href="index.html">Home</a></span> <span>Hotel</span></p> -->
					<h1 class="mb-3 bread"
						data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">酒店</h1>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 sidebar order-md-last ftco-animate">
					<div class="sidebar-wrap ftco-animate">
						<h3 class="heading mb-4">寻找酒店</h3>
						<form action="/hotel/search">
							<div class="fields">
								<div class="form-group">
									<input name="city" type="text" class="form-control"
										placeholder="请输入您要所搜的城市">
								</div>
								<div class="form-group">
									<input name="brandName" type="text" class="form-control"
										placeholder="请输入您要所搜的品牌">
								</div>
								<div class="form-group">
									<div class="select-wrap one-third">
										<div class="icon">
											<span class="ion-ios-arrow-down"></span>
										</div>
										<select name="level" class="form-control">
											<option value>请选择酒店星级</option>
											<option value="五星级/豪华">五星级/豪华</option>
											<option value="四星级/高档">四星级/高档</option>
											<option value="三星级/舒适">三星级/舒适</option>
											<option value="二星级/经济">二星级/经济</option>
											<option value="客栈/公寓">客栈/公寓</option>
											<option value="其他">其他</option>
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
				</div>
				<!-- END-->
				<div class="col-lg-9">
					<div class="row">
					<c:forEach var="hotelItem" items="${resObj.dataList }">
						<div class="col-sm col-md-6 col-lg-4 ftco-animate">
							<div class="destination">
							<c:choose>
								<c:when test="${resObj.reqURI == '/hotel'}">
									<a href="/hotel/${hotelItem.id }?recommend=2"
										class="img img-2 d-flex justify-content-center align-items-center"
										style="background-image: url(${hotelItem.imageUrls[0] });">
										<div
											class="icon d-flex justify-content-center align-items-center">
											<span class="icon-link"></span>
										</div>
									</a>
								</c:when>
								<c:otherwise>
									<a href="/hotel/${hotelItem.id }"
										class="img img-2 d-flex justify-content-center align-items-center"
										style="background-image: url(${hotelItem.imageUrls[0] });">
										<div
											class="icon d-flex justify-content-center align-items-center">
											<span class="icon-link"></span>
										</div>
									</a>
								</c:otherwise>
							</c:choose>
								
								<div class="text p-3">
									<div class="d-flex">
										<div class="one">
											<h3>
												<a href="#">${hotelItem.title }</a>
											</h3>
											<p class="rate">
											<fmt:parseNumber var="rating2" type="number" value="${hotelItem.rating}" />
												<c:forEach begin="1" end="${rating2 }">
													<i class="icon-star"></i> 
												</c:forEach>
												<c:if test="${hotelItem.rating%1 > 0}">
													<i class="icon-star-half"></i> 
												</c:if>
												 <span>${hotelItem.rating }/5 分</span>
											</p>
										</div>
										<div class="two">
											<span class="price per-price">￥${hotelItem.price }<br>
											<small>/晚</small></span>
										</div>
									</div>
									<p class="hotel-des">${hotelItem.description }</p>
									<hr>
									<p class="bottom-area d-flex">
										<span><i class="icon-map-o"></i>${hotelItem.city },${hotelItem.district }</span> <span
											class="ml-auto"><a href="#">预定</a></span>
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
						<c:choose>
							<c:when test="${resObj.reqURI == '/hotel'}">
								<ul>
									<li id="toLeft"><a href="${resObj.reqURI }?pageToken=${resObj.hotelParam.pageToken - 1 }">&lt;</a></li>
									
									<c:forEach var="j" begin="${begin_ }" end="${resObj.pageToken }">
										<li id="li-${j }"><a href="${resObj.reqURI}?pageToken=${j }">${j }</a></li>
									</c:forEach>
									
									<c:if test="${resObj.hasNext == '1' }">
										<li id="li-${resObj.pageToken + 1 }"><a href="${resObj.reqURI}?pageToken=${resObj.pageToken+1 }">${resObj.pageToken+1 }</a></li>
									</c:if>
									
									<li id="toRight"><a href="${resObj.reqURI}?pageToken=${resObj.pageToken + 1 }">&gt;</a></li>
								</ul>
							</c:when>
							<c:otherwise>
								<ul>
									<!--<li id="toLeft"><a href="${resObj.reqURI }?city=${resObj.hotelParam.city}&pageToken=${resObj.hotelParam.pageToken-2 }&hasNext=${resObj.hasNext}&checkInDate=${resObj.hotelParam.checkInDate }&checkOutDate=${resObj.hotelParam.checkOutDate }">&lt;</a></li>
									
									<c:forEach var="j" begin="${begin_ }" end="${resObj.pageToken-1 }">
										<li id="li-${j }"><a href="${resObj.reqURI}?city=${resObj.hotelParam.city}&pageToken=${j }&hasNext=${resObj.hasNext}&checkInDate=${resObj.hotelParam.checkInDate }&checkOutDate=${resObj.hotelParam.checkOutDate }">${j }</a></li>
									</c:forEach>
									
									<c:if test="${resObj.hasNext == '1' }">
										<li id="li-${resObj.pageToken }"><a href="${resObj.reqURI}?city=${resObj.hotelParam.city}&pageToken=${resObj.hotelParam.pageToken }&hasNext=${resObj.hasNext}&checkInDate=${resObj.hotelParam.checkInDate }&checkOutDate=${resObj.hotelParam.checkOutDate }">${resObj.pageToken }</a></li>
									</c:if>-->
									
									<li id="toRight"><a href="${resObj.reqURI}?${resObj.param }">&gt;</a></li>
								</ul>
							</c:otherwise>
						</c:choose>
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
	<script type="text/javascript">
		$(document).ready(function(){ 
		   $("#li-${resObj.pageToken }").prop("class","active");
			if ("${resObj.pageToken }" == "1") {
				$("#li-1 > a").prop("class","entry");
				$("#toLeft > a").prop("class","entry");
			}
			if ("${resObj.hasNext }" == "0") {
				$("#toRight > a").prop("class","entry");
				$("#li-${resObj.pageToken } > a").prop("class","entry");
			}
		}); 
		
	</script>
</body>

</html>