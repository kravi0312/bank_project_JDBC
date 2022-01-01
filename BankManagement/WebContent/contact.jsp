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
        .topnav input[type=text] {
  padding: 6px;
  border: none;
  margin-top: 8px;
  margin-right: 16px;
  font-size: 17px;
}
  table, th, td {
  border:1px solid black;
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
<h1>Contact Us</h1>
<table>
  <tr>
    <td>Address in detail</td>
    <td>Hello Bank Bhavan, 239, Vidhan Bhavan Marg, Nariman Point, Mumbai –
400 021, Maharashtra, India</td>
  </tr>
    <tr>
    <td>Phone number</td>
    <td>+91 22-22892000</td>
  </tr>
    <tr>
    <td>Bank Website</td>
    <td>www.hellobank.com</td>
  </tr>
      <tr>
    <td>Internet Banking site</td>
    <td>www.hellobankonline.com</td>
  </tr>
    <tr>
    <td>Call Centre 24x7</td>
    <td>All-India Toll Free numbers : 1800 22 22 44 / 1800 208 2244 /
                                                      18004251515
Charged Numbers              :      080-25300175 
Dedicated number for NRI :   +918061817110</td>
  </tr>
</table>
<h1>Branch Search</h1>
<p>

Hello Bank has a very wide network of Branches and ATMs around the Globe. Our customer can reach us very easily.
 
Use our branch locator tool to find a Union Branch near you.
</p>
<h2>Search Our Branch</h2>
<div class="topnav">
<input type="text" placeholder="Search..">
</div>
</body>
</html>