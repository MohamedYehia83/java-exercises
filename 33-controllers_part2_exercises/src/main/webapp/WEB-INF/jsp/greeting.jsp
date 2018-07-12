<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
		<link rel="stylesheet" href="css/site.css"></link>
	</head>
	<body>
		<h1>Hello, <c:out value="${param.name}" />!</h1>
	</body>
</html>