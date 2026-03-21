<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%    

response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); // this code is for that
                           //after log out we cannot access the site using the broswer back button

     if(session.getAttribute("name")==null  ||session.getAttribute("id")==null ){
    	 response.sendRedirect("signup.jsp");
     }
    %>
    	 <%= "you are inside the welcome page" %> 
    	 
    	 welcome ${name}
    	 <a href="videos.jsp"> click here to get the video</a>
    	 
    	 
    	 <form action="logout">
    	 <input type="submit" value="logout" size="100"> 
    	 </form>
</body>
</html>