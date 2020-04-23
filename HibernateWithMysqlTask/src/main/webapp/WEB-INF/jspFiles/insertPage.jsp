<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Insert</h3>

<div>
  <form action="/InsertRecords" method="get">
    <label for="fname">ID</label>
    <input type="text" id="fname" name="id" placeholder="Your name..">

    <label for="lname">Name</label>
    <input type="text" id="lname" name="name" placeholder="Your last name..">

    <label for="lname">address</label>
    <input type="text" id="lname" name="address" placeholder="Your last name..">

    <label for="lname">contact</label>
    <input type="text" id="lname" name="contact" placeholder="Your last name..">
    
    <label for="country">Country</label>
    <select id="country" name="city">
      <option name="city" value="australia">Australia</option>
      <option name="city" value="canada">Canada</option>
      <option name="city" value="usa">USA</option>
    </select>
  
    <input type="submit" value="Submit">
  </form>
</div>
</body>
</html>