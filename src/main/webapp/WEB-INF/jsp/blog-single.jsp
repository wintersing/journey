<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
  	.icon{
  	margin-left: 5px;
  	}
  </style>
</head>

<body>

	<%@ include file="./part/header.jsp" %>

  <div class="hero-wrap js-fullheight" style="background-image: url('/images/bg_1.jpg');">
    <div class="overlay"></div>
    <div class="container">
      <div class="row no-gutters slider-text js-fullheight align-items-center justify-content-center"
        data-scrollax-parent="true">
        <div class="col-md-9 text-center ftco-animate" data-scrollax=" properties: { translateY: '70%' }">
          <!-- <p class="breadcrumbs" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }"><span class="mr-2"><a
                href="index.html">Home</a></span> <span>Blog</span></p> -->
          <h1 class="mb-3 bread" data-scrollax="properties: { translateY: '30%', opacity: 1.6 }">旅游日记 &amp; 文章</h1>
        </div>
      </div>
    </div>
  </div>

    <section class="ftco-section ftco-degree-bg">
    <div class="container">
      <div class="row">
        <div class="col-md-8 ftco-animate">
          
          <h2 class="mb-3"><strong id="title"></strong></h2>
          <div class="about-author d-flex p-4 bg-light">
            <div class="bio mr-5">
              <img id="avatarUrl" src="" alt="Image placeholder" class="img-fluid mb-4">
            </div>
            <div class="desc">
              <div>
                <div class="tagcloud">
                    <h3><span class="icon-person"></span><span id="posterScreenName"></span></h3>
                    <a class="tag-cloud-link"><span class="icon-favorite"></span><span id="likeCount" class="icon"></span></a>
                    <a class="tag-cloud-link"><span class="icon-chat"></span><span id="commentCount" class="icon"></span></a>
                    <a class="tag-cloud-link"><span class="icon-calendar"></span><span id="publishDateStr" class="icon"></span></a>
                    <a class="tag-cloud-link"><span class="icon-view"></span> <b>阅读量</b>：<span id="viewCount"></span>人</a>
                  </div>
                <span></span>
              </div>
            </div>
          </div>
          
          <div id="content" style="padding-top: 50px;">
          </div>

          <div class="pt-5 mt-5">
            <h3 class="mb-5">精彩评论</h3>
            <ul class="comment-list">
            	
            </ul>
            <!-- END comment-list -->

          </div>

        </div> <!-- .col-md-8 -->
        <div class="col-md-4 sidebar ftco-animate">
          <div class="sidebar-box">
            <form id="search-form" action="/places/search" class="search-form">
              <div class="form-group">
                <a href="javascript:void(0)" onclick="document.getElementById('search-form').submit();"><span class="icon icon-search"></span></a>
                <input type="text" name="cityName" class="form-control" placeholder="搜索景点">
              </div>
            </form>
          </div>
          <!-- <div class="sidebar-box ftco-animate">
            <div class="categories">
              <h3>Categories</h3>
              <li><a href="#">Tour <span>(12)</span></a></li>
              <li><a href="#">Hotel <span>(22)</span></a></li>
              <li><a href="#">Coffee <span>(37)</span></a></li>
              <li><a href="#">Drinks <span>(42)</span></a></li>
              <li><a href="#">Foods <span>(14)</span></a></li>
              <li><a href="#">Travel <span>(140)</span></a></li>
            </div>
          </div> -->

          <div class="sidebar-box ftco-animate">
            <h3>--旅游日记--</h3>
            <c:forEach var="blogItem" items="${blogList }">
				<div class="block-21 mb-4 d-flex">
					<a class="blog-img mr-4" style="background-image: url(${blogItem.avatarUrl });"></a>

					<div class="text">
					<c:choose>
						<c:when test="${reqURI eq '/places' }">
							<h3 class="heading"><a href="/blog/${blogItem.cityid }/${blogItem.id }/${pageToken-1 }?recommend=2">${blogItem.title }</a></h3>
						</c:when>
						<c:otherwise>
							<h3 class="heading"><a href="/blog/${blogItem.cityid }/${blogItem.id }/${pageToken-1 }">${blogItem.title }</a></h3>
						</c:otherwise>
					</c:choose>
						</h3>
						<div class="meta">
							<div><a href="#"><span class="icon-calendar"></span>${fn:substring(blogItem.publishDateStr,0,10) }</a></div>
							<div><a href="#"><span class="icon-map-marker"></span> ${blogItem.city }</a></div>
						</div>
					</div>
				</div>
			</c:forEach>
          </div>

          <!-- <div class="sidebar-box ftco-animate">
            <h3>Tag Cloud</h3>
            <div class="tagcloud">
              <a href="#" class="tag-cloud-link">dish</a>
              <a href="#" class="tag-cloud-link">menu</a>
              <a href="#" class="tag-cloud-link">food</a>
              <a href="#" class="tag-cloud-link">sweet</a>
              <a href="#" class="tag-cloud-link">tasty</a>
              <a href="#" class="tag-cloud-link">delicious</a>
              <a href="#" class="tag-cloud-link">desserts</a>
              <a href="#" class="tag-cloud-link">drinks</a>
            </div>
          </div> -->

          <div class="sidebar-box ftco-animate">
            <h3>旅行记忆</h3>
            <p>偶尔为街头独特的风景驻足，偶尔因高山流水的美丽停留，偶尔被惊鸿一瞥的美丽吸引;或者走进一条深沉深沉的巷道，期待遇上一位撑着油纸伞，结着忧愁丁香一样的姑娘;或者在春暖花开时，看看花儿冲破北疆漫漫寒冬，妖娆绽放;或者在河边放下一盏写着心愿的河灯，祝愿一切安好。</p>
          </div>
        </div>

      </div>
    </div>
  </section> <!-- .section -->

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

  <script src="/js/main.js"></script>
  <script>
    $(document).ready(function () {
    	$.ajax({
			url: "/blog/${id }",
		    method: 'get',  
		    data:{"recommend":"${recommend }","cityid":"${cityid }","pageToken":"${pageToken}"},
		    ContentType: "application/x-www-form-urlencoded;charset=utf-8",
		    dataType: 'json',  
		    success: function (blogDes) {
		    	$("#title").html(blogDes.title);
		    	$("#posterScreenName").html(blogDes.posterScreenName);
		    	$("#likeCount").html(blogDes.likeCount);
		    	$("#commentCount").html(blogDes.commentCount);
		    	$("#publishDateStr").html(blogDes.publishDateStr.substring(0,10));
		    	$("#viewCount").html(blogDes.viewCount);
		    	$("#avatarUrl").attr("src",blogDes.avatarUrl);
		        var str = blogDes.content;
		        var strArr = str.split('');
		        var imageUrls = eval("("+blogDes.imageUrls+")")  ;
		        var contents = "";
		        $.each(strArr, function (i, content) {
		        	
		          content = "<pre style=\"white-space: pre-wrap; word-wrap: break-word;\">" + content + "</pre>";
		          contents = contents + content;
		          if (imageUrls != null && i < imageUrls.length) {
		          	contents = contents + "<img src=\""+imageUrls[i]+"\"></p>";
				  }
		        });
		        $('#content').append(contents);
			}
		});
    	//加载评论
    	getBlogComment();
	});
	var commentPage = 1;
    $(window).scroll(function() {
		var scrollTop = $(this).scrollTop();
		var scrollHeight = $(document).height();
		var windowHeight = $(this).height();
		if (scrollTop + windowHeight == scrollHeight) {
			// 此处是滚动条到底部时候触发的事件，在这里写要加载的数据，或者是拉动滚动条的操作
			if (commentPage > 0) {
				getBlogComment();
			}else{
				return;
			}
		}
	});
	function getBlogComment() {
		//var commentPage = $("#commentPage").val();
		$.ajax({
			url: '/comment/post/${id }?pageToken='+commentPage,  
		    method: 'get',  
		    ContentType: "application/x-www-form-urlencoded;charset=utf-8",
		    dataType: 'json',  
		    success: function (ret) {
				var dataList = "";
				if (ret.retcode == "100002") {
					var str ="<li class=\"comment\">"
						+"<div class=\"comment-body\">"
							+"<h3 style=\"font-size: 25px;text-align:center;color: #f9be37;\">暂无评论</h3>"
						+"</div>"
					+"</li>"
					$('.comment-list').append(str);
					return;
				}
				
				$.each(ret.data, function (i, comment){
					var str ="<li class=\"comment\">"
						+"<div class=\"vcard bio\">"
							+"<img src=\"\/images\/avatar.jpg\" alt=\"avatar\">"
						+"</div>"
						+"<div class=\"comment-body\">"
						if (comment.commenterScreenName != "") {
							var str = str +"<h3>"+comment.commenterScreenName+"</h3>"
						}else{
							var str = str +"<h3>用户名</h3>"
						}
						var str = str +"<p>"+comment.content+"</p>"
							+"<div class=\"meta\">"+comment.publishDateStr.replace("T", " ")+"</div>"
						+"</div>"
					+"</li>"
					dataList = dataList +str
				});
				if (ret.hasNext == true) {
					commentPage+=1;
				}else{
					commentPage = 0;
				}
				$('.comment-list').append(dataList);
			}
		});
	}
  </script>
</body>

</html>