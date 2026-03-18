<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<body>

<h2>Student List</h2>

<c:forEach items="${students}" var="s">
    ${s.name} - ${s.rollno} <br/>
</c:forEach>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %> <!--  NEED TO IM[ORT THIS FILE TO 
                                  TO TAKE THE OUTPUT USING THE HTML CODE -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%= 9999+1 %>
  <c:out value ="hello world"/> <!--  THIS IS THE OUTPUT -->
   ${student.name} <!--  we get the needed data -->
  <%-- <c:import url="https://www.youtube.com/watch?v=4XTsAAHW_Tc">< --%><!-- /c:import> --><!--  run the website in the
    local host only the writen address for the url -->
</body>
</html>