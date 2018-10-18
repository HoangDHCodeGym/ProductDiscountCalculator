<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/18/2018
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discournt</title>
  </head>
  <body>
  <h1>Product Discount</h1>
  <form method=post action="/returnDiscount">
    Product Description:<br>
    <input type="text" name="description">
    <br>
    List Price:<br>
    <input type="number" name="listPrice">
    <br>
    Discount Percent <br>
    <input type="number" name="discountPercent">
    <br><br>
    <input type="submit" value="Submit">
  </form>

  </body>
</html>
