<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Product List View</title>
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
	<section id="main-content-list">
		<h1>Toy Department</h1>

		<c:forEach var="product" items="${requestScope.productList}">

			<div class="product-div">
				<div class="product-img-div">
					<c:url var="productDetail" value="/productDetail">
						<c:param name="productId" value="${product.productId}" />
					</c:url>
					<a href="${productDetail}"><img class="product-img"
						src="img/<c:out value="${product.imageName}"/>"
						alt="<c:out value="${product.imageName}"/>"></a>
				</div>

				<div class="product-info-div">
					<h3>
						<c:out value="${product.name}" />
						<c:if test="${product.topSeller}">
							<span class="best-seller">BEST SELLER!</span>
						</c:if>
					</h3>

					<p>
						by
						<c:out value="${product.manufacturer}"></c:out>
					</p>
					<span class="price"><fmt:formatNumber
							value="${product.price}" type="currency" /></span>
					<p>
						<strong>Weight </strong>
						<c:out value="${product.weightInLbs}" />
						lbs
					</p>
					<img class="product-rating-img"
						src="img/<fmt:formatNumber value="${product.averageRating}" pattern="#"/>-star.png" />
					<br class="product-br">
				</div>

			</div>

		</c:forEach>


	</section>
</body>
</html>