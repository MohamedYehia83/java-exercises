<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>

<c:url value="/filmList" var="formAction" /><br>
		<form method="GET" action="${formAction}">
		
            <label for="minLength">Minimum Length:</label> 
            <input type="text" name="minLength" id="minLength" />
       
            <label for="maxLength">Maximum Length:</label> 
            <input type="text" name="maxLength" id="maxLength" />
       
            <label for="filmGenre">Genre:</label> 
            <select name="genre"     id="genre">
                <option value="Action">Action</option>
				<option value="Family">Family</option>
				<option value="Action">Animation</option>
				<option value="Children">Children</option>
				<option value="Action">Classics</option>
				<option value="Action">Comedy</option>
				<option value="Action">Documentary</option>
				<option value="Action">Drama</option>
				<option value="Action">Foreign</option>
				<option value="Action">Games</option>
				<option value="Action">Horror</option>


		</select>
       		<input class="formSubmitButton" type="submit" value="Film Search" />
		</form><br>

<table class="table">

<c:forEach items="${films}" var="film">
<tr>
    <!-- What do we print here for each film? 
    title, description, release_year, length and rating.-->
    
   <td><c:out value="${film.title}"/></td>
   <td><c:out value="${film.description}"/></td>
   <td><c:out value="${film.releaseYear}"/></td>
   <td><c:out value="${film.length}"/></td>
   <td><c:out value="${film.rating}"/></td>
   
   
</tr>
</c:forEach>
</table>


<%@include file="common/footer.jspf"%>