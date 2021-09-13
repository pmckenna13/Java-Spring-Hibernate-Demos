<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student Confirmation</title>
</head>

<body>
	
	The student is confirmed: ${student.firstName} ${student.lastName} 
<br><br>
Student's Country: ${student.country}
<br><br> 
Student's Favorite Language: ${student.favoriteLanguage}

<br><br>
Operating Systems:
<ul>
	<c:forEach items="${student.operatingSystems}" var="temp">
       
       	<li> <c:out value = "${temp}"/><p> </li>
	
	</c:forEach>
</ul>
</body>

</html>