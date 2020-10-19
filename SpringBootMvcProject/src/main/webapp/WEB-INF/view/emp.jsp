<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
 
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Input page...</h1>
<form:form action="addemp" method="post">
Empid <form:input path="eId"/><br/>
Emp Name<form:input path="name"/><br/>
Emp Dept <form:input path="dept"/><br/>
<input type="submit" value="submit">
</form:form>
</body>
</html>