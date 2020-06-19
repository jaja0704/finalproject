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
                <li><a href="/web/fishing" accesskey="4" title="">魚類百科</a></li>
                <li class="current_page_item"><a href="#" accesskey="5" title="">管理頁面</a></li>
            </ul>
        </div>
    </div>
    <div id="main">
        <div id="banner">
            <img src="/images/issa-pic.jpg" alt="" class="image-full" my:src="@{images/issa.jpg}"/>
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
                <h2>資料管理處</h2>
                <span class="byline">這邊是管理員專用!!</span>
                <div id="myBtnContainer">
                    <button class="btn active" onclick="filterSelection('add')"> 新增或修改</button>
                    <button class="btn" onclick="filterSelection('delete')"> 刪除</button>
                </div>
            </div>
            <ul class="">
                <p>新增或修改</p>
                <form id = "formAction" my:action="/villagers/admin/insert" method="post" >
                    <input id="addId" type="text" placeholder="ammibo Id" name="Id" >
                    <input id="addNameTr" type="text" placeholder="名子(繁體)" name="NameTr">
                    <input id="addNameEn" type="text" placeholder="名子(英文)" name="NameEn">
                    <input id="addGender" type="text" placeholder="性別" name="Gender">
                    <input id="addBirthMonth" type="text" placeholder="生日月分" name="BirthMonth">
                    <input id="addBirthDate" type="text" placeholder="生日日期" name="BirthDate">
                    <input id="addSpecies" type="text" placeholder="種族" name="Species">
                    <input id="addPersonality" type="text" placeholder="個性" name="Personality">
                    <input id="addMotto" type="text" placeholder="口頭禪" name="Motto">
                    <button type="submit">submit</button>
                </form>
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

        if(c == "add"){
            y = "/villagers/admin/insert";
            ChangeDisabled(1);
        }
        else{
            y = "/villagers/admin/delete";

            ChangeDisabled(0);
        }
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


    function ChangeDisabled(value) {
        if (value == '1') {
            document.getElementById("addNameTr").disabled = false;
            document.getElementById("addNameEn").disabled = false;
            document.getElementById("addGender").disabled = false;
            document.getElementById("addBirthMonth").disabled = false;
            document.getElementById("addBirthDate").disabled = false;
            document.getElementById("addSpecies").disabled = false;
            document.getElementById("addPersonality").disabled = false;
            document.getElementById("addMotto").disabled = false;
            // 變更欄位為可用
        } else {
            document.getElementById("addNameTr").disabled = true;
            document.getElementById("addNameEn").disabled = true;
            document.getElementById("addGender").disabled = true;
            document.getElementById("addBirthMonth").disabled = true;
            document.getElementById("addBirthDate").disabled = true;
            document.getElementById("addSpecies").disabled = true;
            document.getElementById("addPersonality").disabled = true;
            document.getElementById("addMotto").disabled = true;
        }
    }

</script>

</body>
</html>
     