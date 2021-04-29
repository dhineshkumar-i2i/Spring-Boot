<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

<head>
<title>trial</title>
</head>

<body>
<a href="create.jsp">Create nw user</a>
<form>
    Enter User Id:<input type="text" name="userId">
    <button style="margin:5px;font-size:20px;" type="submit" formaction="display">
        <b>View</b>
    </button>
</form>


    <c:forEach items="${userList}" var="user">
        ${user.getId()} : ${user.getName()}
        <br>
    </c:forEach>

</body>

</html>
