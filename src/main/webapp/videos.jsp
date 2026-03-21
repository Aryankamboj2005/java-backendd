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


     if(session.getAttribute("name")==null  ||session.getAttribute("id")==null ){
    	 response.sendRedirect("signup.jsp");
     }
    %>
    
    <h1><%="here is your video" %></h1>
    <form action="logout">
    	 <input type="submit" value="logout" size="100"> 
    	 </form>

</body>
</html>