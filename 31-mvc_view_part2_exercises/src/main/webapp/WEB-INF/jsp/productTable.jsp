
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="Product Table View" />
<%@include file="common/header.jspf"%>

<h1>Toy Department</h1>
<table class="product-table">
	<tr>
		<td></td>
		<c:forEach var="product" items="${requestScope.productList}">

			<td><c:url var="productDetail" value="/productDetail">
					<c:param name="productId" value="${product.productId}" />
				</c:url> <a href="${productDetail}"> <img class="product-table-img"
					src="img/<c:out value="${product.imageName}"/>"
					alt="<c:out value="${product.imageName}"/>"></a> 
				<c:if
					test="${product.topSeller}">
					<p class="best-seller">BEST SELLER!</p>
				</c:if></td>
		</c:forEach>
	</tr>
	<tr class="gray-row">
		<th>Name</th>
		<c:forEach var="product" items="${requestScope.productList}">
			<td>
				<p>
					<c:out value="${product.name}" />
				</p>
			</td>
		</c:forEach>
	</tr>
	<tr>
		<th>Rating</th>
		<c:forEach var="product" items="${requestScope.productList}">
			<td><img class="product-rating-img"
				src="img/<fmt:formatNumber value="${product.averageRating}" pattern="#"/>-star.png" />
			</td>
		</c:forEach>
	</tr>
	<tr class="gray-row">
		<th>Mfr</th>
		<c:forEach var="product" items="${requestScope.productList}">
			<td>
				<p>
					<c:out value="${product.manufacturer}" />
				</p>
			</td>
		</c:forEach>
	</tr>
	<tr>
		<th>Price</th>
		<c:forEach var="product" items="${requestScope.productList}">
			<td><span><fmt:formatNumber value="${product.price}"
						type="currency" /></span></td>
		</c:forEach>
	</tr>
	<tr class="gray-row">
		<th>Wt. (lbs)</th>
		<c:forEach var="product" items="${requestScope.productList}">
			<td><c:out value="${product.weightInLbs}" /></td>
		</c:forEach>
	</tr>
</table>

<%@include file="common/footer.jspf"%>