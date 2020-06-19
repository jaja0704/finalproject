
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@taglib prefix="my" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--
Design by TEMPLATED
http://templated.co
Released for free under the Creative Commons Attribution License

Name       : Skeleton
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20130902

-->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
    <link href="/css/default.css" rel="stylesheet" type="text/css" media="all" />
    <link href="/css/fonts.css" rel="stylesheet" type="text/css" media="all" />

    <!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->

</head>
<style>
    /* Style the buttons */
    .featured .title .btn {
        border: none;
        outline: none;
        padding: 12px 16px;
        background-color: #f1f1f1;
        cursor: pointer;
    }

    .featured .title .btn:hover {
        background-color: #ddd;
    }

    .featured .title .btn.active {
        background-color: #666;
        color: white;
    }
    .searchBarText input[type=text] {
        padding: 6px;
        margin-top: 8px;
        font-size: 30px;
        border: 2px solid #ccc;
    }

    .searchBarText button {
        float: right;
        padding: 6px 10px;
        margin-top: 8px;
        margin-right: 16px;
        background: #ddd;
        font-size: 30px;
        border: none;
        cursor: pointer;
    }

    .searchBarText button:hover {
        background: #ccc;
    }
    .pic {
        float: left;
        margin-right: 30px;
    }
    .villagerInf{
    }
    .first{
        list-style: none;
        margin-bottom:15px; /* 3px margin plus 1px for the border */
        position:relative;
        background-clip: content-box;
    }
    .first + .first {
        margin-top: 75px; /* total distance between elements */
    }
    .first + .first:before {        /* this is a pseudo element to create the border */
        content:'';
        display:block;
        height:1px;
        position:absolute;
        top:-20px;
        left:0;
        right:0;
    }

</style>

<body>
<div id="page" class="container">
    <div id="header">
        <div id="logo">
            <img src="/images/tomnook111.jpg" alt="" my:src="@{images/tomnook111.jpg}"/>
            <h1><a href="#">TIMMY</a></h1>
            <span>Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a></span>
        </div>
        <div id="menu">
            <ul>
                <li><a href="/web/index" accesskey="1" title="">首頁</a></li>
                <li class="current_page_item"><a href="#" accesskey="2" title="">查詢腳色</a></li>
                <li><a href="#" accesskey="3" title="">種花</a></li>
                <li><a href="/web/fishing" accesskey="4" title="">魚類百科</a></li>
                <li><a href="/web/admin" accesskey="5" title="">管理頁面</a></li>
            </ul>
        </div>
    </div>
    <div id="main">
        <div id="banner">
            <img src="/images/animal-crossing-villagers.jpg" alt="" class="image-full" my:src="@{images/animal-crossing-villagers.jpg}"/>
        </div>
        <div id="welcome">
            <div class="title">
                <h2>Animal Crossing 居民查詢</h2>
                <span class="byline">Villager Searching</span>
            </div>
        </div>
        <div id="featured" class = "featured">
            <div class="title">
                <div id="myBtnContainer">
                    <button class="btn active" onclick="filterSelection('NameTr')"> 姓名(中文)</button>
                    <button class="btn" onclick="filterSelection('NameEn')"> 姓名(英文)</button>
                    <button class="btn" onclick="filterSelection('BirthMonth')"> 生日(月份)</button>
                    <button class="btn" onclick="filterSelection('Birthday')"> 生日(日期)</button>
                    <button class="btn" onclick="filterSelection('Species')"> 種族</button>
                    <button class="btn" onclick="filterSelection('Gender')"> 性別</button>
                    <button class="btn" onclick="filterSelection('Personality')"> 個性</button>
                    <button class="btn" onclick="filterSelection('Motto')"> 口頭禪</button>
                </div>
                <br>
                <div id="SearchBar" class = "SearchBarNav">
                    <form my:action="/" id = "formAction" method="GET"  >
                        <input id = "searchBarText" type="text" placeholder="Search.." name="keyword">
                        <button type="submit">search</button>
                    </form>
                </div>

            </div>
        </div>
        <ul class="style1" id="listStart">
            <my:forEach var="listValue" items="${contactList}">
                <li class="first" >
                    <div class="pic" ><a href="#"><img src="/images/bear.jpg" alt="" /></a></div>
                    <p float="left" class="villagerInf">
                        <a>名子是 ${listValue.villagerNameTr} / ${listValue.villagerNameEn}</a>
                        <a>性別：${listValue.villagerGender}</a>
                        <a>生日：${listValue.villagerBirthMonth}/${listValue.villagerBirthDate}</a>
                        <a>種族：${listValue.villagerSpecies}</a>
                        <a>個性：${listValue.villagerPersonality}</a>
                        <a>口頭禪：${listValue.villagerMotto}</a></p>
                </li>
            </my:forEach>
        </ul>
    </div>
    <div id="copyright">
        <span>&copy; Untitled. All rights reserved. | Photos by <a href="#">Google</a></span>
        <span>Design by <a href="#" rel="nofollow">JAJA</a>.</span>
    </div>
</div>
</div>


<script>
    var x, y;
    function filterSelection(c) {

        if(c == "NameTr"){
            x = "捷克、茶茶丸...";
            y = "/villagers/user/contactSearch/NameTr";

        }
        else if(c == "NameEn"){
            x = "Stitches, Alli...";
            y = "/villagers/user/contactSearch/NameEn";
        }
        else if(c == "BirthMonth"){
            x = "07, 12...";
            y = "/villagers/user/contactSearch/BirthMonth";
        }
        else if(c == "Birthday"){
            x = "08/25, 11/22...";
            y = "/villagers/user/contactSearch/Birthday";
        }
        else if(c == "Species"){
            x = "兔子，小熊...";
            y = "/villagers/user/contactSearch/Species";
        }
        else if(c == "Gender"){
            x = "male or female";
            y = "/villagers/user/contactSearch/Gender";
        }
        else if(c == "Personality"){
            x = "開朗，暴躁...";
            y = "/villagers/user/contactSearch/Personality";
        }
        else{
            x = "大概，玩玩...";
            y = "/villagers/user/contactSearch/Motto";
        }
        document.getElementById("searchBarText").placeholder = x;
        document.getElementById("formAction").action = y;
    }


    // Add active class to the current button (highlight it)
    var btnContainer = document.getElementById("myBtnContainer");
    var btns = btnContainer.getElementsByClassName("btn");
    for (var i = 0; i < btns.length; i++) {
        btns[i].addEventListener("click", function(){
            var current = document.getElementsByClassName("active");
            current[0].className = current[0].className.replace(" active", "");
            this.className += " active";
        });
    }



</script>


</body>
</html>
