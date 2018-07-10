<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<c:set var="pageTitle" value="Product Tiles View"/>
	<%@include file="common/header.jspf" %>

		<h1>Toy Department</h1>
		<c:forEach var="product" items="${requestScope.productList}">

			<div class="product-tile-div">
				<c:url var="productDetail" value="/productDetail">
					<c:param name="productId" value="${product.productId}" />
				</c:url> <a href="${productDetail}"> <img class="product-table-img"
					src="img/<c:out value="${product.imageName}"/>"
					alt="<c:out value="${product.imageName}"/>"></a> 
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

<%@include file="common/footer.jspf" %>
	