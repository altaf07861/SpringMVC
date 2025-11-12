<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div align="center">
        <form:form method="post" action="submit" modelAttribute="user">
                <form:label path="firstName">First Name:</form:label>
                <form:input path="firstName" />
                    <br>
                     <br>
                <form:label path="lastName">Last Name:</form:label>
                <form:input path="lastName" />
                     <br>
                      <br>
                <form:label path="email">Email:</form:label>
                <form:input path="email" />
                      <br>
                       <br>
                <input type="submit" value="Submit" />
            </form:form>

    </div>
</body>
</html>