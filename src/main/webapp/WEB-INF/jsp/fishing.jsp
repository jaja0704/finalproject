<%--
  Created by IntelliJ IDEA.
  User: JAJA
  Date: 2020/6/18
  Time: 下午 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="my" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" >
<!--
Design by TEMPLATED
http://templated.co
Released for free under the Creative Commons Attribution License

Name       : Skeleton
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20130902

-->
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
    <link href="/css/default.css" rel="stylesheet" type="text/css" media="all" />
    <link href="/css/fonts.css" rel="stylesheet" type="text/css" media="all" />

    <!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->


    <style>
        /* Style the buttons */
        .btn {
            border: none;
            outline: none;
            padding: 12px 16px;
            background-color: #f1f1f1;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #ddd;
        }

        .btn.active {
            background-color: #666;
            color: white;
        }
        .formAction input[type=text] {
            padding: 6px;
            margin-top: 8px;
            font-size: 30px;
            border: 2px solid #ccc;
        }

        .formAction button {
            float: right;
            padding: 6px 10px;
            margin-top: 8px;
            margin-right: 16px;
            background: #ddd;
            font-size: 30px;
            border: none;
            cursor: pointer;
        }

        .formAction button:hover {
            background: #ccc;
        }
    </style>

</head>
<body >
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDj4aUMkM6ZSgljfgycOgkClzmn_K_Wh_Y&callback=initMap">
</script>

<script type="text/javascript">

    var map;
    function initMap() {
        map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: 25.1507023, lng: 121.7816478},
            zoom: 18
        });
    }


</script>


<div id="page" class="container">
    <div id="header">
        <div id="logo">
            <img src="/images/tomnook111.jpg" alt="" />
            <h1><a href="#">TIMMY</a></h1>
            <span>Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a></span>
        </div>
        <div id="menu">
            <ul>
                <li ><a href="/web/index"  accesskey="1" title="">首頁</a></li>
                <li><a href="/web/searchChr" accesskey="2" title="">查詢腳色</a></li>
                <li><a href="#" accesskey="3" title="">種花</a></li>
                <li class="current_page_item"><a href="#" accesskey="4" title="">魚類百科</a></li>
                <li><a href="/web/admin" accesskey="5" title="">管理頁面</a></li>
            </ul>
        </div>
    </div>
    <div id="main">
        <div id="banner">
            <img src="/images/animalcrossing_main.jpg" alt="" class="image-full" />
        </div>
        <div id="welcome">
            <div class="title">
                <h2>Animal Crossing - New Horizon 大百科</h2>
                <span class="byline">search for all the information you want <33</span>
            </div>
            <p>這是專為<strong>動物森友會 New Horizon</strong>設計的網站，歡迎大家在上面搜尋到自己需要的資訊。這個網站還在施工中，歡迎大家提供相關資訊。</p>
            <ul class="actions">
                <li><a href="#" class="button">Etiam posuere</a></li>
            </ul>
        </div>
        <div id="featured">
            <div class="title">
                <h2>ㄟ都施工中</h2>
                <span class="byline">API/////</span>
                <div id="map" style="height:500px; width:800px"></div>
            </div>
        <div id="copyright">
            <span>&copy; Untitled. All rights reserved. | Photos by <a href="#">Google</a></span>
            <span>Design by <a href="#" rel="nofollow">JAJA</a>.</span>
        </div>
    </div>
</div>

<script>




</script>

</body>
</html>
