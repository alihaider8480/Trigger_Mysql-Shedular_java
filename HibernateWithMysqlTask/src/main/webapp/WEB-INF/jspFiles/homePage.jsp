<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Home Page</h1>

<button onclick="myFunction()">Try it</button>
<p id="demo"></p>


<br><br><br><br><br><br>
<a href="/LoginIDandPassword"> Print ID and Password</a>UserInsertPage<br><br>
<a href="/JsonData"> Print Data From JSON</a><br><br>
<a href="/UserInsertPage"> Go Insert Page</a><br><br>
<a href="/QuatzShedularStarting">Go Quatz Shedular Start</a>

</body>

<script>
function myFunction() 
{
  var x = "User-agent header sent: " + navigator.userAgent;
  document.getElementById("demo").innerHTML = x;
}
</script>
</html>