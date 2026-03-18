<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<body>

<h2>Student List</h2>

<c:forEach items="${students}" var="s">
    ${s.name} - ${s.rollno} <br/>
</c:forEach>

</body>
</html>