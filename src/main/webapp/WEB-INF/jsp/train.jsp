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
    <style type="text/css">
        .list,
        .tab-header {
            width: 14%;
            text-align: center;
        }

        h3,
        .space {
            margin-top: 14px;
        }

        .space {
            padding-top: 2px;
        }

        .header {
            height: 10px;
        }

        .list-body {
            border: 1px solid #e2e2e2;
        }

        .list-head {
            background: #efe9e9;
            margin-bottom: 20px;
        }
    </style>
</head>

<body>


	<%@ include file="./part/header.jsp" %>

    <div class="hero-wrap js-fullheight" style="background-image: url('images/bg_1.jpg');">
        <div class="overlay"></div>
        <div class="container">
            <div class="row no-gutters slider-text js-fullheight align-items-center justify-content-center"
                data-scrollax-parent="true">
                <div class="col-md-9 text-center ftco-animate" data-scrollax=" properties: { translateY: '70%' }">
                    <!-- <p class="breadcrumbs" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }"><span class="mr-2"><a href="index.html">Home</a></span> <span>Hotel</span></p> -->
                    <h1 class="mb-3 bread" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">火车票</h1>
                </div>
            </div>
        </div>
    </div>

    <section class="ftco-section">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 sidebar order-md-last ftco-animate">
                    <div class="sidebar-wrap ftco-animate">
                        <h3 class="heading mb-4">查询火车余票</h3>
                        <form action="#">
                            <div class="fields">
                                <div class="form-group">
                                    <div class="form-field">
                                        <input type="text" class="form-control" placeholder="出发地">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="form-field">
                                        <input type="text" class="form-control" placeholder="目的地">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="select-wrap one-third">
                                        <div class="icon"><span class="ion-ios-arrow-down"></span></div>
                                        <div class="form-group">
                                            <div class="form-field">
                                                <div class="icon"><span class="icon-map-marker"></span></div>
                                                <input type="text" class="form-control checkin_date" placeholder="出发日期">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- <div class="form-group">
									<div class="range-slider">
										<span>
											<input type="number" value="25000" min="0" max="120000" /> -
											<input type="number" value="50000" min="0" max="120000" />
										</span>
										<input value="1000" min="0" max="120000" step="500" type="range" />
										<input value="50000" min="0" max="120000" step="500" type="range" />
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
                        <div>
                            <label class="form-check-label" for="exampleCheck1">
                                <p><a target="_blank" class="news" href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
                                        另一老兵众筹"买梯子"</a></p>
                            </label>
                        </div>
                        <div>
                            <label class="form-check-label" for="exampleCheck1">
                                <p><a target="_blank" class="news" href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
                                        另一老兵众筹"买梯子"</a></p>
                            </label>
                        </div>
                        <div>
                            <label class="form-check-label" for="exampleCheck1">
                                <p><a target="_blank" class="news" href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
                                        另一老兵众筹"买梯子"</a></p>
                            </label>
                        </div>
                        <div>
                            <label class="form-check-label" for="exampleCheck1">
                                <p><a target="_blank" class="news" href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
                                        另一老兵众筹"买梯子"</a></p>
                            </label>
                        </div>
                        <div>
                            <label class="form-check-label" for="exampleCheck1">
                                <p><a target="_blank" class="news" href="http:\/\/mini.eastday.com\/mobile\/181221171918949.html">美国老兵筹款要建边境墙后
                                        另一老兵众筹"买梯子"</a></p>
                            </label>
                        </div>
                    </div>
                </div>
                <!-- END-->
                <div class="col-lg-9">
                    <div class="row list-head">
                        <div class="tab-header">
                            <div class="destination header">
                                <div class="text p-7">
                                    <h3>车次</h3>
                                </div>
                            </div>
                        </div>
                        <div class="tab-header">
                            <div class="destination header">
                                <div class="text p-7">
                                    <h3>发时/到时</h3>
                                </div>
                            </div>
                        </div>

                        <div class="tab-header">
                            <div class="destination header">
                                <div class="text p-7">
                                    <h3>出站/到站</h3>
                                </div>
                            </div>
                        </div>

                        <div class="tab-header">
                            <div class="destination header">
                                <div class="text p-7">
                                    <h3>运行时间</h3>
                                </div>
                            </div>
                        </div>
                        <div class="tab-header">
                            <div class="destination header">
                                <div class="text p-7">
                                    <h3>参考票价</h3>
                                </div>
                            </div>
                        </div>
                        <div class="tab-header">
                            <div class="destination header">
                                <div class="text p-7">
                                    <h3>剩余票数</h3>
                                </div>
                            </div>
                        </div>
                        <div class="tab-header">
                            <div class="destination header">
                                <div class="text p-7">

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row list-body">
                        <div class="list">
                            <div class="destination">
                                <div class="text p-7">
                                    <h3>G107</h3>
                                </div>
                            </div>
                        </div>
                        <div class="list">
                            <div class="destination">
                                <div class="text p-7">
                                    <h3>08:05</h3>
                                    <h3>13:46</h3>
                                </div>
                            </div>
                        </div>

                        <div class="list">
                            <div class="destination">
                                <div class="text p-7">
                                    <h3>北京南</h3>
                                    <h3>上海虹桥</h3>
                                </div>
                            </div>
                        </div>

                        <div class="list">
                            <div class="destination">
                                <div class="text p-7">
                                    <h3>5小时41分钟</h3>
                                </div>
                            </div>
                        </div>
                        <div class="list">
                            <div class="destination">
                                <div class="text p-7">
                                    <h3>商务座 ¥1748</h3>
                                    <h3>特等座 ¥1053</h3>
                                    <h3>一等座 ¥933</h3>
                                    <h3>二等座 ¥553</h3>
                                </div>
                            </div>
                        </div>
                        <div class="list">
                            <div class="destination">
                                <div class="text p-7">
                                    <h3>余0 张</h3>
                                    <h3>余0 张</h3>
                                    <h3>余0 张</h3>
                                    <h3>余0 张</h3>
                                </div>
                            </div>
                        </div>
                        <div class="list">
                            <div class="destination">
                                <div class="text p-7">
                                    <p class="bottom-area d-flex space">
                                        <span class="ml-auto"><a href="#">现在预定</a></span>
                                    </p>
                                    <p class="bottom-area d-flex space">
                                        <span class="ml-auto"><a href="#">现在预定</a></span>
                                    </p>
                                    <p class="bottom-area d-flex space">
                                        <span class="ml-auto"><a href="#">现在预定</a></span>
                                    </p>
                                    <p class="bottom-area d-flex space">
                                        <span class="ml-auto"><a href="#">现在预定</a></span>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- <div class="list col-md-6 col-lg-4 ftco-animate">
						<div class="destination">
							<div class="text p-3">
								<div class="d-flex">
									<div class="one">
										<h3>New Orleans, LA</h3>
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
					</div> -->

                    <div class="row mt-5">
                        <div class="col text-center">
                            <div class="block-27">
                                <ul>
                                    <li><a href="#">&lt;</a></li>
                                    <li class="active"><span>1</span></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li><a href="#">&gt;</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </section> <!-- .section -->

    <!-- .section -->

    <section class="ftco-section-parallax">
        <div class="parallax-img d-flex align-items-center">
            <div class="container">
                <div class="row d-flex justify-content-center">
                    <div class="col-md-7 text-center heading-section heading-section-white ftco-animate">
                        <h2>Subcribe to our Newsletter</h2>
                        <p>Far far away, behind the word mountains, far from the
                            countries Vokalia and Consonantia, there live the blind texts.
                            Separated they live in</p>
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

   
  <%@ include file="./part/footer.jsp" %>


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