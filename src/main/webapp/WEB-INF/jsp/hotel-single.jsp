<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
	<title>旅游攻略,自由行 - 人在旅途</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Abril+Fatface" rel="stylesheet">

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

	<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
		<div class="container">
			<a class="navbar-brand" href="index.html">人在旅途</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav"
			 aria-expanded="false" aria-label="Toggle navigation">
				<span class="oi oi-menu"></span> Menu
			</button>

			<div class="collapse navbar-collapse" id="ftco-nav">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a href="${pageContext.request.contextPath}" class="nav-link">主页</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/placesView" class="nav-link">目的地</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/hotelView" class="nav-link">酒店</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/tavelNotesView" class="nav-link">游记</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/placesView" class="nav-link">火车</a></li>
					<li class="nav-item"><a href="${pageContext.request.contextPath}/contactView" class="nav-link">联系</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- END nav -->

	<div class="hero-wrap js-fullheight" style="background-image: url('images/bg_1.jpg');">
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
								<div class="form-group">
									<input name="businessDistrict" type="text" id="checkin_date" class="form-control" placeholder="请输入您要搜索的酒店商圈">
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
				<div class="col-lg-9">
					<div class="row">
						<div class="col-md-12 ftco-animate">
							<div class="single-slider owl-carousel">
								<div class="item">
									<div class="hotel-img" style="background-image: url(http://p0.meituan.net/0.0/hotelbiz/1ccf58acbcf57584a953404a5463a10096804.jpg);"></div>
								</div>
								<div class="item">
									<div class="hotel-img" style="background-image: url(http://p0.meituan.net/0.0/hotel/e74b5ceed7940066dc2ca1ba996cd843212178.jpg);"></div>
								</div>
								<div class="item">
									<div class="hotel-img" style="background-image: url(http://p0.meituan.net/0.0/tdchotel/24412002a380057c4518b8047162a5d4289276.png);"></div>
								</div>
								<div class="item">
									<div class="hotel-img" style="background-image: url(http://p1.meituan.net/0.0/hotel/455d838409c0e4279a00bf89619825ee429690.jpg);"></div>
								</div>
								<div class="item">
									<div class="hotel-img" style="background-image: url(http://p0.meituan.net/0.0/hotel/703a3247fde8d0e2a3633994486d5e70351813.jpg);"></div>
								</div>
							</div>
						</div>
						<div class="col-md-12 hotel-single mt-4 mb-5 ftco-animate">
							<h2>茂源旅馆</h2>
							<span>入住时间: 14:00以后 离店时间: 12:00之前</span>
							<p class="rate mb-5">
								<span class="loc"><a href="#"><i class="icon-map"></i>珠山区新厂西路与陶阳南路交汇处西南角（中国邮政隔壁）</a></span>
								<span class="star">
									<i class="icon-star"></i>
									<i class="icon-star"></i>
									<i class="icon-star"></i>
									<i class="icon-star"></i>
									<i class="icon-star-o"></i>
									4 分</span>
							</p>
							<p>该店客房整洁，宽敞明亮，环境卫生，配套设施齐全，服务周到，方便入住。</p>
							<div class="d-md-flex mt-5 mb-5">
								<ul>
									<h4>服务</h4>
									<li>无线上网</li>
									<li>热水洗浴</li>
									<li>叫醒服务</li>
									<li>洗漱用具</li>
									<li>有线上网</li>
									<li>停车场</li>
									<li>行李寄存</li>
								</ul>
								<ul class="ml-md-5">
									<h4>好评数</h4>
									<li>干净卫生 * 43</li>
									<li>交通便利 * 23</li>
									<li>房间大 * 4</li>
									<li>位置好 * 56</li>
									<li>性价比高 * 43</li>
									<li>环境优雅 * 23</li>
									<li>服务热情 * 22</li>
									<li>价格实惠 * 1</li>
									<li>设施好 * 2</li>
								</ul>
								<ul class="ml-md-5">
									<h4>其他服务</h4>
									<li>娱乐场/棋牌室</li>
									<li>会议室</li>
									<li>商务中心</li>
									<li>酒吧</li>
									<li>免费停车场</li>
									<li>中餐</li>
								</ul>
							</div>
							<p>When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her
								hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane.
								Pityful a rethoric question ran over her cheek, then she continued her way.</p>
						</div>
						<div class="col-md-12 hotel-single ftco-animate mb-5 mt-4">
							<h4 class="mb-4">Take A Tour</h4>
							<div class="block-16">
								<figure>
									<img src="images/hotel-6.jpg" alt="Image placeholder" class="img-fluid">
									<a href="https://vimeo.com/45830194" class="play-button popup-vimeo"><span class="icon-play"></span></a>
								</figure>
							</div>
						</div>
						<div class="col-md-12 hotel-single ftco-animate mb-5 mt-4">
							<h4 class="mb-4">Our Rooms</h4>
							<div class="row">
								<div class="col-md-4">
									<div class="destination">
										<a href="hotel-single.html" class="img img-2" style="background-image: url(images/room-4.jpg);"></a>
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
										<a href="hotel-single.html" class="img img-2" style="background-image: url(images/room-5.jpg);"></a>
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
										<a href="hotel-single.html" class="img img-2" style="background-image: url(images/room-6.jpg);"></a>
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
						<div class="col-md-12 hotel-single ftco-animate mb-5 mt-4">
							<h4 class="mb-5">Check Availability &amp; Booking</h4>
							<div class="fields">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<input type="text" class="form-control" placeholder="Name">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<input type="text" class="form-control" placeholder="Email">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<input type="text" class="form-control checkin_date" placeholder="Date from">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<input type="text" class="form-control checkout_date" placeholder="Date to">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<div class="select-wrap one-third">
												<div class="icon"><span class="ion-ios-arrow-down"></span></div>
												<select name="" id="" class="form-control" placeholder="Guest">
													<option value="0">Guest</option>
													<option value="1">1</option>
													<option value="2">2</option>
													<option value="3">3</option>
													<option value="4">4</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<div class="select-wrap one-third">
												<div class="icon"><span class="ion-ios-arrow-down"></span></div>
												<select name="" id="" class="form-control" placeholder="Children">
													<option value="0">Children</option>
													<option value="1">1</option>
													<option value="2">2</option>
													<option value="3">3</option>
													<option value="4">4</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<input type="submit" value="Check Availability" class="btn btn-primary py-3">
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12 hotel-single ftco-animate mb-5 mt-4">
							<h4 class="mb-4">Review &amp; Ratings</h4>
							<div class="row">
								<div class="col-md-6">
									<form method="post" class="star-rating">
										<div class="form-check">
											<input type="checkbox" class="form-check-input" id="exampleCheck1">
											<label class="form-check-label" for="exampleCheck1">
												<p class="rate"><span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i
														 class="icon-star"></i> 100 Ratings</span></p>
											</label>
										</div>
										<div class="form-check">
											<input type="checkbox" class="form-check-input" id="exampleCheck1">
											<label class="form-check-label" for="exampleCheck1">
												<p class="rate"><span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i
														 class="icon-star-o"></i> 30 Ratings</span></p>
											</label>
										</div>
										<div class="form-check">
											<input type="checkbox" class="form-check-input" id="exampleCheck1">
											<label class="form-check-label" for="exampleCheck1">
												<p class="rate"><span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star-o"></i><i
														 class="icon-star-o"></i> 5 Ratings</span></p>
											</label>
										</div>
										<div class="form-check">
											<input type="checkbox" class="form-check-input" id="exampleCheck1">
											<label class="form-check-label" for="exampleCheck1">
												<p class="rate"><span><i class="icon-star"></i><i class="icon-star"></i><i class="icon-star-o"></i><i class="icon-star-o"></i><i
														 class="icon-star-o"></i> 0 Ratings</span></p>
											</label>
										</div>
										<div class="form-check">
											<input type="checkbox" class="form-check-input" id="exampleCheck1">
											<label class="form-check-label" for="exampleCheck1">
												<p class="rate"><span><i class="icon-star"></i><i class="icon-star-o"></i><i class="icon-star-o"></i><i
														 class="icon-star-o"></i><i class="icon-star-o"></i> 0 Ratings</span></p>
											</label>
										</div>
									</form>
								</div>
							</div>
						</div>
						<div class="col-md-12 hotel-single ftco-animate mb-5 mt-5">
							<h4 class="mb-4">Related Hotels</h4>
							<div class="row">
								<div class="col-md-4">
									<div class="destination">
										<a href="hotel-single.html" class="img img-2" style="background-image: url(images/hotel-1.jpg);"></a>
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
										<a href="hotel-single.html" class="img img-2" style="background-image: url(images/hotel-2.jpg);"></a>
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
										<a href="hotel-single.html" class="img img-2" style="background-image: url(images/hotel-3.jpg);"></a>
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

	<section class="ftco-section-parallax">
		<div class="parallax-img d-flex align-items-center">
			<div class="container">
				<div class="row d-flex justify-content-center">
					<div class="col-md-7 text-center heading-section heading-section-white ftco-animate">
						<h2>Subcribe to our Newsletter</h2>
						<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind
							texts. Separated they live in</p>
						<div class="row d-flex justify-content-center mt-5">
							<div class="col-md-8">
								<form action="#" class="subscribe-form">
									<div class="form-group d-flex">
										<input type="text" class="form-control" placeholder="Enter email address">
										<input type="submit" value="Subscribe" class="submit px-3">
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<footer class="ftco-footer ftco-bg-dark ftco-section">
		<div class="container">
			<div class="row mb-5">
				<div class="col-md">
					<div class="ftco-footer-widget mb-4">
						<h2 class="ftco-heading-2">Adventure</h2>
						<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind
							texts.</p>
						<ul class="ftco-footer-social list-unstyled float-md-left float-lft mt-3">
							<li class="ftco-animate"><a href="#"><span class="icon-twitter"></span></a></li>
							<li class="ftco-animate"><a href="#"><span class="icon-facebook"></span></a></li>
							<li class="ftco-animate"><a href="#"><span class="icon-instagram"></span></a></li>
						</ul>
					</div>
				</div>
				<div class="col-md">
					<div class="ftco-footer-widget mb-4 ml-md-4">
						<h2 class="ftco-heading-2">Information</h2>
						<ul class="list-unstyled">
							<li><a href="#" class="py-2 d-block">About Us</a></li>
							<li><a href="#" class="py-2 d-block">Online enquiry</a></li>
							<li><a href="#" class="py-2 d-block">Call Us</a></li>
							<li><a href="#" class="py-2 d-block">General enquiries</a></li>
							<li><a href="#" class="py-2 d-block">Booking Conditions</a></li>
							<li><a href="#" class="py-2 d-block">Privacy and Policy</a></li>
							<li><a href="#" class="py-2 d-block">Refund policy</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md">
					<div class="ftco-footer-widget mb-4">
						<h2 class="ftco-heading-2">Experience</h2>
						<ul class="list-unstyled">
							<li><a href="#" class="py-2 d-block">Beach</a></li>
							<li><a href="#" class="py-2 d-block">Adventure</a></li>
							<li><a href="#" class="py-2 d-block">Wildlife</a></li>
							<li><a href="#" class="py-2 d-block">Honeymoon</a></li>
							<li><a href="#" class="py-2 d-block">Nature</a></li>
							<li><a href="#" class="py-2 d-block">Party</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md">
					<div class="ftco-footer-widget mb-4">
						<h2 class="ftco-heading-2">Have a Questions?</h2>
						<div class="block-23 mb-3">
							<ul>
								<li><span class="icon icon-map-marker"></span><span class="text">203 Fake St. Mountain View, San Francisco,
										California, USA</span></li>
								<li><a href="#"><span class="icon icon-phone"></span><span class="text">+2 392 3929 210</span></a></li>
								<li><a href="#"><span class="icon icon-envelope"></span><span class="text">info@yourdomain.com</span></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 text-center">

					<p>
						Copyright &copy;<script>
							document.write(new Date().getFullYear());
						</script> Colorlib All rights reserved | More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>
						- Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
					</p>
				</div>
			</div>
		</div>
	</footer>



	<!-- loader -->
	<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px">
			<circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee" />
			<circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00" /></svg></div>


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
	<script src="js/jquery.timepicker.min.js"></script>
	<script src="js/scrollax.min.js"></script>

	<script src="js/google-map.js"></script>
	<script src="js/main.js"></script>

</body>

</html>