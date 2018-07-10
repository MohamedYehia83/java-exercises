<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="common/header.jspf" %>

	<c:set var="title" value="Product Detail View" />

<section id="main-content-detail">

	<div class="product-detail-div">
		<div class="product-detail-img-div">
			<c:url var ="productImgUrl" value ="/img/${product.imageName}"/>
				<img id="product-detail-img"
				src="${productImgUrl}"/>
				
		</div>

		<div class="product-detail-info-div">
			<h3>
				<c:out value="${product.name}" />
				<c:if test="${product.topSeller}">
					<span class="best-seller">BEST SELLER!</span>
				</c:if>
			</h3>

			<p>
				by
				<c:out value="${product.manufacturer}"/>
			</p>
			<fmt:formatNumber var="rating" value="${product.averageRating}" pattern="#"/>
			<img class="product-rating-img"
				src="img/${rating }-star.png" />
			<br class="product-br">
			<p class="price">
				Price:
				<fmt:formatNumber value="${product.price}" type="currency" />
			</p>
			<p>
				<strong>Weight </strong>
				<c:out value="${product.weightInLbs} lbs" />
				
			</p>
			<p class="detail-description">
				<strong>Description: </strong>
				<c:out value="${product.description}" />
			</p>

		</div>

	</div>

</section>

<%@ include file="common/footer.jspf"%>