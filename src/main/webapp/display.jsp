<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<title>trial</title>
</head>

<body>
User ID: ${user.getId()}
<br>
Name: ${user.getName()}
<br>
<form>
<button style="margin:5px;font-size:20px;" type="submit" formaction="delete">
    <b>delete</b>
</button>

<button style="margin:5px;font-size:20px;" type="submit" formaction="updatePage">
    <b>update</b>
</button>
</form>
</body>
</html>
