<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				class="row no-gutters slider-text js-fullheight align-items-center justify-content-start"
				data-scrollax-parent="true">
				<div
					class="col-md-9 ftco-animate mb-5 pb-5 text-center text-md-left"
					data-scrollax=" properties: { translateY: '70%' }">
					<h1 class="mb-4"
						data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">
						发现 <br>一个新的地方
					</h1>
					<p data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">寻找当地专家住宿，吃饭，购物或参观的好地方</p>
				</div>
			</div>
		</div>
	</div>

	<section class="ftco-section justify-content-end ftco-search">
		<div class="container-wrap ml-auto">
			<div class="row no-gutters">
				<div class="col-md-12 nav-link-wrap">
					<div class="nav nav-pills justify-content-center text-center"
						id="v-pills-tab" role="tablist" aria-orientation="vertical">
						<a class="nav-link active" id="v-pills-1-tab" data-toggle="pill"
							href="#v-pills-1" role="tab" aria-controls="v-pills-1"
							aria-selected="true" onclick="search_('train')">火车</a> <a class="nav-link"
							id="v-pills-2-tab" data-toggle="pill" href="#v-pills-2"
							role="tab" aria-controls="v-pills-2" aria-selected="false" 
							onclick="search_('hotel')">酒店</a>

						<a class="nav-link" id="v-pills-3-tab" data-toggle="pill"
							href="#v-pills-3" role="tab" aria-controls="v-pills-3"
							aria-selected="false">Car Rent</a>
					</div>
				</div>
				<div class="col-md-12 tab-wrap">

					<div class="tab-content p-4 px-5" id="v-pills-tabContent">

						<div class="tab-pane fade show active" id="v-pills-1"
							role="tabpanel" aria-labelledby="v-pills-nextgen-tab">
							<form name="search_form" action="${pageContext.request.contextPath}/searchTrain" class="search-destination">
								<div class="row">
								<input type="hidden" name="page" value="1"> 
								<input type="hidden" name="limit" value="0">
									<div class="col-md align-items-end">
										<div class="form-group">
											<label for="#">出发地</label>
											<div class="form-field">
												<div class="icon">
													<span class="icon-my_location"></span>
												</div>
												<input name="departureCityName" type="text" class="form-control" placeholder="出发地">
											</div>
										</div>
									</div>
									<div class="col-md align-items-end">
										<div class="form-group">
											<label for="#">目的地</label>
											<div class="form-field">
												<div class="icon">
													<span class="icon-map-marker"></span>
												</div>
												<input name="arrivalCityName" type="text" class="form-control" placeholder="目的地">
											</div>
										</div>
									</div>
									<div class="col-md align-items-end">
										<div class="form-group">
											<label for="#">出发日期</label>
											<div class="form-field">
												<div class="icon">
													<span class="icon-map-marker"></span>
												</div>
												<input name="departureDate" type="text" class="form-control checkin_date"
													placeholder="出发日期">
											</div>
										</div>
									</div>
									<div class="col-md align-self-end">
										<div class="form-group">
											<div class="form-field">
												<input type="submit" value="Search"
													class="form-control btn btn-primary">
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>

						<div class="tab-pane fade" id="v-pills-2" role="tabpanel"
							aria-labelledby="v-pills-performance-tab">
							<form action="${pageContext.request.contextPath}/hotelView" class="search-destination">
								<div class="row">
								<input name="pageToken" type="hidden" value="1">
									<div class="col-md align-items-end">
										<div class="form-group">
											<label for="#">目的地</label>
											<div class="form-field">
												<div class="icon">
													<span class="icon-map-marker"></span>
												</div>
												<input name="cityName" type="text" class="form-control" placeholder="请输入您要所搜的城市">
											</div>
										</div>
									</div>
									<div class="col-md align-items-end">
										<div class="form-group">
											<label for="#">品牌</label>
											<div class="form-field">
												<div class="icon"><span class="icon-map-marker"></span></div>
												<input name="brandName" type="text" class="form-control checkin_date" placeholder="请输入您要所搜的品牌">
											</div>
										</div>
									</div>
									<div class="col-md align-items-end">
										<div class="form-group">
											<label for="#">酒店星级</label>
											<div class="form-field">
												<div class="select-wrap">
													<div class="icon"><span class="ion-ios-arrow-down"></span></div>
													<select name="" id="" class="form-control">
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
										</div>
									</div>
									<div class="col-md align-self-end">
										<div class="form-group">
											<div class="form-field">
												<input type="submit" value="Search"
													class="form-control btn btn-primary">
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>

						<div class="tab-pane fade" id="v-pills-3" role="tabpanel"
							aria-labelledby="v-pills-effect-tab">
							<form action="#" class="search-destination">
								<div class="row">
									<div class="col-md align-items-end">
										<div class="form-group">
											<label for="#">Where</label>
											<div class="form-field">
												<div class="icon">
													<span class="icon-map-marker"></span>
												</div>
												<input type="text" class="form-control" placeholder="Where">
											</div>
										</div>
									</div>
									<div class="col-md align-items-end">
										<div class="form-group">
											<label for="#">Check In</label>
											<div class="form-field">
												<div class="icon">
													<span class="icon-map-marker"></span>
												</div>
												<input type="text" class="form-control checkin_date"
													placeholder="Check In">
											</div>
										</div>
									</div>
									<div class="col-md align-items-end">
										<div class="form-group">
											<label for="#">Check Out</label>
											<div class="form-field">
												<div class="icon">
													<span class="icon-map-marker"></span>
												</div>
												<input type="text" class="form-control checkout_date"
													placeholder="From">
											</div>
										</div>
									</div>
									<div class="col-md align-self-end">
										<div class="form-group">
											<div class="form-field">
												<input type="submit" value="Search"
													class="form-control btn btn-primary">
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center mb-5 pb-3">
				<div class="col-md-7 heading-section text-center ftco-animate">
					<h2 class="mb-4"><a href="${pageContext.request.contextPath}/placesView">热门景点</a></h2>
				</div>
			</div>
		</div>
		<div class="container-fluid">
			<c:forEach var="i" begin="1" end="2">
				<div class="row">
					<c:forEach var="placesItem" begin="${i*4-4 }" end="${i*4-1 }" varStatus="status"
						items="${placesList }">
						<div class="col-sm col-md-6 col-lg ftco-animate">
						<c:choose>
							<c:when test="${status.index%2 == 1 }">
								<div class="destination d-md-flex flex-column-reverse">
							</c:when>
							<c:otherwise>
								<div class="destination">
							</c:otherwise>
						</c:choose>
								<c:forEach var="imageItem" begin="0" end="0"
									items="${placesItem.imageUrls }">
									<a href="#"
										class="img img-2 d-flex justify-content-center align-items-center"
										style="background-image: url(${imageItem });">
										<div
											class="icon d-flex justify-content-center align-items-center">
											<span class="icon-link"></span>
										</div>
									</a>
								</c:forEach>
								<div class="text p-3 info">
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
													<span>${placesItem.rating}/5分</span>
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
									<p>${placesItem.subtitle }</p>
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
			</c:forEach>
			
		</div>
	  
	</section>
	
	<section class="ftco-section ftco-counter img" id="section-counter"
		style="background-image: url(images/bg_1.jpg);"
		data-stellar-background-ratio="0.5">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-10">
					<div class="row">
						<div
							class="col-md-3 d-flex justify-content-center counter-wrap ftco-animate">
							<div class="block-18 text-center">
								<div class="text">
									<strong class="number" data-number="100000">0</strong> <span>Happy
										Customers</span>
								</div>
							</div>
						</div>
						<div
							class="col-md-3 d-flex justify-content-center counter-wrap ftco-animate">
							<div class="block-18 text-center">
								<div class="text">
									<strong class="number" data-number="40000">0</strong> <span>Destination
										Places</span>
								</div>
							</div>
						</div>
						<div
							class="col-md-3 d-flex justify-content-center counter-wrap ftco-animate">
							<div class="block-18 text-center">
								<div class="text">
									<strong class="number" data-number="87000">0</strong> <span>Hotels</span>
								</div>
							</div>
						</div>
						<div
							class="col-md-3 d-flex justify-content-center counter-wrap ftco-animate">
							<div class="block-18 text-center">
								<div class="text">
									<strong class="number" data-number="56400">0</strong> <span>Restaurant</span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>


	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center mb-5 pb-3">
				<div class="col-md-7 heading-section text-center ftco-animate">
					<h2 class="mb-4">热门酒店</h2>
				</div>
			</div>
		</div>
		<div class="container-fluid">
			<c:forEach var="i" begin="1" end="2">
			<div class="row">
				<c:forEach var="hotelItem" begin="${i*4-4 }" end="${i*4-1 }" varStatus="status" 
					items="${hotelList }">
				<div class="col-sm col-md-6 col-lg ftco-animate">
					<c:choose>
						<c:when test="${status.index%2 == 1 }">
							<div class="destination d-md-flex flex-column-reverse">
						</c:when>
						<c:otherwise>
							<div class="destination">
						</c:otherwise>
					</c:choose>
						<a href="#"
							class="img img-2 d-flex justify-content-center align-items-center"
							style="background-image: url(${hotelItem.imageUrls[0] });">
							<div
								class="icon d-flex justify-content-center align-items-center">
								<span class="icon-link"></span>
							</div>
						</a>
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
									<span class="price per-price">￥${hotelItem.price }<br> <small>/晚</small></span>
								</div>
							</div>
							<p class="hotel-des">${hotelItem.description }</p>
							<hr>
							<p class="bottom-area d-flex">
								<span><i class="icon-map-o"></i> ${hotelItem.city },${hotelItem.district }</span> <span
									class="ml-auto"><a href="#">预定</a></span>
							</p>
						</div>
					</div>
				</div>
				</c:forEach>
			</div>
			</c:forEach>
		</div>
	</section>

	<section class="ftco-section testimony-section">
		<div class="container">
			<div class="row justify-content-center mb-5 pb-3">
				<div
					class="col-md-7 text-center heading-section heading-section-white ftco-animate">
					<h2 class="mb-4">Our satisfied customer says</h2>
					<p>Far far away, behind the word mountains, far from the
						countries Vokalia and Consonantia, there live the blind texts.
						Separated they live in</p>
				</div>
			</div>
			<div class="row ftco-animate">
				<div class="col-md-12">
					<div class="carousel-testimony owl-carousel ftco-owl">
						<div class="item">
							<div class="testimony-wrap p-4 pb-5">
								<div class="user-img mb-5"
									style="background-image: url(images/person_1.jpg)">
									<span
										class="quote d-flex align-items-center justify-content-center">
										<i class="icon-quote-left"></i>
									</span>
								</div>
								<div class="text">
									<p class="mb-5">Far far away, behind the word mountains,
										far from the countries Vokalia and Consonantia, there live the
										blind texts.</p>
									<p class="name">Mark Web</p>
									<span class="position">Marketing Manager</span>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="testimony-wrap p-4 pb-5">
								<div class="user-img mb-5"
									style="background-image: url(images/person_2.jpg)">
									<span
										class="quote d-flex align-items-center justify-content-center">
										<i class="icon-quote-left"></i>
									</span>
								</div>
								<div class="text">
									<p class="mb-5">Far far away, behind the word mountains,
										far from the countries Vokalia and Consonantia, there live the
										blind texts.</p>
									<p class="name">Mark Web</p>
									<span class="position">Interface Designer</span>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="testimony-wrap p-4 pb-5">
								<div class="user-img mb-5"
									style="background-image: url(images/person_3.jpg)">
									<span
										class="quote d-flex align-items-center justify-content-center">
										<i class="icon-quote-left"></i>
									</span>
								</div>
								<div class="text">
									<p class="mb-5">Far far away, behind the word mountains,
										far from the countries Vokalia and Consonantia, there live the
										blind texts.</p>
									<p class="name">Mark Web</p>
									<span class="position">UI Designer</span>
								</div>
							</div>
						</div>
						<div class="item">
							<div class="testimony-wrap p-4 pb-5">
								<div class="user-img mb-5"
									style="background-image: url(images/person_1.jpg)">
									<span
										class="quote d-flex align-items-center justify-content-center">
										<i class="icon-quote-left"></i>
									</span>
								</div>
								<div class="text">
									<p class="mb-5">Far far away, behind the word mountains,
										far from the countries Vokalia and Consonantia, there live the
										blind texts.</p>
									<p class="name">Mark Web</p>
									<span class="position">Web Developer</span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- <section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center mb-5 pb-3">
				<div class="col-md-7 heading-section text-center ftco-animate">
					<h2 class="mb-4">Recommended Restaurants</h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-6 col-lg-3 ftco-animate">
					<div class="destination">
						<a href="#" class="img img-2 d-flex justify-content-center align-items-center" style="background-image: url(images/restaurant-1.jpg);">
							<div class="icon d-flex justify-content-center align-items-center">
								<span class="icon-link"></span>
							</div>
						</a>
						<div class="text p-3">
							<h3><a href="#">Luxury Restaurant</a></h3>
							<p class="rate">
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star-o"></i>
								<span>8 Rating</span>
							</p>
							<p>Far far away, behind the word mountains, far from the countries</p>
							<hr>
							<p class="bottom-area d-flex">
								<span><i class="icon-map-o"></i> San Franciso, CA</span>
								<span class="ml-auto"><a href="#">Discover</a></span>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-lg-3 ftco-animate">
					<div class="destination d-md-flex flex-column-reverse">
						<a href="#" class="img img-2 d-flex justify-content-center align-items-center" style="background-image: url(images/restaurant-2.jpg);">
							<div class="icon d-flex justify-content-center align-items-center">
								<span class="icon-link"></span>
							</div>
						</a>
						<div class="text p-3">
							<h3><a href="#">Luxury Restaurant</a></h3>
							<p class="rate">
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star-o"></i>
								<span>8 Rating</span>
							</p>
							<p>Far far away, behind the word mountains, far from the countries</p>
							<hr>
							<p class="bottom-area d-flex">
								<span><i class="icon-map-o"></i> San Franciso, CA</span>
								<span class="ml-auto"><a href="#">Book Now</a></span>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-lg-3 ftco-animate">
					<div class="destination">
						<a href="#" class="img img-2 d-flex justify-content-center align-items-center" style="background-image: url(images/restaurant-3.jpg);">
							<div class="icon d-flex justify-content-center align-items-center">
								<span class="icon-link"></span>
							</div>
						</a>
						<div class="text p-3">
							<h3><a href="#">Luxury Restaurant</a></h3>
							<p class="rate">
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star-o"></i>
								<span>8 Rating</span>
							</p>
							<p>Far far away, behind the word mountains, far from the countries</p>
							<hr>
							<p class="bottom-area d-flex">
								<span><i class="icon-map-o"></i> San Franciso, CA</span>
								<span class="ml-auto"><a href="#">Book Now</a></span>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-6 col-lg-3 ftco-animate">
					<div class="destination d-md-flex flex-column-reverse">
						<a href="#" class="img img-2 d-flex justify-content-center align-items-center" style="background-image: url(images/restaurant-4.jpg);">
							<div class="icon d-flex justify-content-center align-items-center">
								<span class="icon-link"></span>
							</div>
						</a>
						<div class="text p-3">
							<h3><a href="#">Luxury Restaurant</a></h3>
							<p class="rate">
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star"></i>
								<i class="icon-star-o"></i>
								<span>8 Rating</span>
							</p>
							<p>Far far away, behind the word mountains, far from the countries</p>
							<hr>
							<p class="bottom-area d-flex">
								<span><i class="icon-map-o"></i> San Franciso, CA</span>
								<span class="ml-auto"><a href="#">Book Now</a></span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section> -->

	<section class="ftco-section bg-light">
		<div class="container">
			<div class="row justify-content-center mb-5 pb-3">
				<div class="col-md-7 heading-section text-center ftco-animate">
					<h2>
						<strong>旅游日记</strong> &amp; 文章
					</h2>
				</div>
			</div>
			<div class="row d-flex">
				<div class="col-md-4 d-flex ftco-animate">
					<div class="blog-entry align-self-stretch">
						<a href="blog-single.html" class="block-20"
							style="background-image: url('images/image_1.jpg');"> </a>
						<div class="text">
							<span class="tag">广州</span>
							<h3 class="heading mt-3">
								<a href="#">深圳、广州、珠海、香港四地游记</a>
							</h3>
							<div class="meta mb-3">
								<div>
									<a href="#">2013-10-11</a>
								</div>
								<div>
									<a href="#">Admin</a>
								</div>
								<div>
									<a href="#" class="meta-chat"><span class="icon-chat"></span>
										3</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4 d-flex ftco-animate">
					<div class="blog-entry align-self-stretch">
						<a href="blog-single.html" class="block-20"
							style="background-image: url('images/image_2.jpg');"> </a>
						<div class="text">
							<span class="tag">Culture</span>
							<h3 class="heading mt-3">
								<a href="#">Even the all-powerful Pointing has no control
									about the blind texts</a>
							</h3>
							<div class="meta mb-3">
								<div>
									<a href="#">October 3, 2018</a>
								</div>
								<div>
									<a href="#">Admin</a>
								</div>
								<div>
									<a href="#" class="meta-chat"><span class="icon-chat"></span>
										3</a>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4 d-flex ftco-animate">
					<div class="blog-entry align-self-stretch">
						<a href="blog-single.html" class="block-20"
							style="background-image: url('images/image_3.jpg');"> </a>
						<div class="text">
							<span class="tag">Tips, Travel</span>
							<h3 class="heading mt-3">
								<a href="#">Even the all-powerful Pointing has no control
									about the blind texts</a>
							</h3>
							<div class="meta mb-3">
								<div>
									<a href="#">October 3, 2018</a>
								</div>
								<div>
									<a href="#">Admin</a>
								</div>
								<div>
									<a href="#" class="meta-chat"><span class="icon-chat"></span>
										3</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

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
</body>

</html>