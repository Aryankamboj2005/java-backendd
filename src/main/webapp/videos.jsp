<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


   <%    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); //this code is for that
   //after log out we cannot access the site using the broswer back button
response.setHeader("Pragma","no-cache"); // for older browsers
response.setDateHeader("Expires", 0);    // proxy caching

     if(session.getAttribute("name")==null){
    	 response.sendRedirect("signup.jsp");
     }
    %>
    
    <h1><%="here is your video" %></h1>
    <form action="logout">
    	 <input type="submit" value="logout" size="100"> 
    	 </form>

</body>
</html>