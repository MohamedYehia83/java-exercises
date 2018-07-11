<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Customers List" />

<%@include file="common/header.jspf"%>


<c:url value="/customerList" var="formAction" />

<div>
<form method="GET" action="${formAction}">
		
		<label for="name">search: </label> 
		<input type="text" id="search" name="search" />  
			
		<label for="name">Sort: </label> 
	<select name="sort" >
			<option value="First_name"> First Name</option>
			<option value="Last_name"> Last Name</option>
	</select>
		<input type="submit" value="Get_customer" />
		
</form>
</div>
<table class="table">
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Active</th>
	</tr>
	<c:forEach items="${customers}" var="customer">
		<tr>
			<!-- What do we print here for each customer? -->
			<td><c:out value="${customer.firstName}" /> 
			    <c:out value="${customer.lastName}" />
			 </td>
			  
			  <td>  
			    <c:out value="${customer.email}" />
			 </td>	
			    
			    <td>
			    <c:out value="${customer.active}" />
			 </td>
		</tr>
	</c:forEach>
</table>

<%@include file="common/footer.jspf"%>
