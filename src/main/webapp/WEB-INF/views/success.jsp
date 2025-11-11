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
               <h2>${message}</h2>
               <p>First Name: ${user.firstName}</p>
               <p>Last Name: ${user.lastName}</p>
               <p>Email: ${user.email}</p>
           </div>

</body>
</html>