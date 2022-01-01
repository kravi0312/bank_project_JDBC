<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>LogIn</title>
    <style>
    .navbar {
  overflow: hidden;
  background-color: #333;
  position: sticky;
  position: -webkit-sticky;
  top: 0;
}

/* Style the navigation bar links */
.navbar a {
  float: left;
  display: block;
  color: white;
  text-align: center;
  padding: 14px 20px;
  text-decoration: none;
}


/* Right-aligned link */
.navbar a.right {
  float: right;
}

/* Change color on hover */
.navbar a:hover {
  background-color: #ddd;
  color: black;
}

/* Active/current link */
.navbar a.active {
  background-color: #666;
  color: white;
}
* {
  box-sizing: border-box;
}
       
        body
        {
        background-color:#79C1F6;
        }

    </style>
</head>
<body>
<div class="navbar">
  <a href="index.jsp" class="active">Home</a>
  <a href="about.jsp">About Us</a>
  <a href="contact.jsp">Contact Us</a>
  <a href="login.jsp" class="right">Login</a>
</div>
<h1>Welcome to Hello Bank</h1>
<h1>Your Form has been Successully Submitted </h1>
<h1>Our Manager will connect you For Document Varification</h1>
<h1 align="center">Thank You</h1>
</body>
</html>