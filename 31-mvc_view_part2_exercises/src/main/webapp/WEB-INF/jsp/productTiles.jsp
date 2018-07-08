<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Product Tiles View</title>
<c:url value="/css/site.css" var="cssUrl" />
<link rel="stylesheet" href="${cssUrl}" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 2: Models</h1>
	</header>
	<nav>
		<ul>
			<li><a href="#">Link 1</a></li>
			<li><a href="#">Link 2</a></li>
		</ul>

	</nav>
	<section id="main-content-tiles">
		<h1>Toy Department</h1>
		<c:forEach var="product" items="${requestScope.productList}">

			<div class="product-tile-div">
				<img class="product-img"
					src="img/<c:out value="${product.imageName}"/>"
					alt="<c:out value="${product.imageName}"/>">
				<h4>
					<c:out value="${product.name}" />
					<c:if test="${product.topSeller}">
						<span class="best-seller">BEST SELLER!</span>
					</c:if>
				</h4>
				<p>
					by
					<c:out value="${product.manufacturer}"></c:out>
				</p>
				<p>
					<c:if test="${product.remainingStock < 3}">
						<span class="low-stock">Only <c:out
								value="${product.remainingStock}" /> left!
						</span>
					</c:if>
				</p>
				<span class="price"><fmt:formatNumber
						value="${product.price}" type="currency" /></span>
				<p>
					<strong>Weight </strong>
					<c:out value="${product.weightInLbs}" />
					lbs
				</p>
				<img class="product-table-rating-img"
					src="img/<fmt:formatNumber value="${product.averageRating}" pattern="#"/>-star.png" />
			</div>
		</c:forEach>


	</section>
</body>
</html>