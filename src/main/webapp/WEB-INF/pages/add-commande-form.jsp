<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<%@include file="utils/jsp/head.jsp" %>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<!-- page content -->
<div class="right_col" role="main">
  	<div class="">
		<div class="clearfix"></div>			
		<div class="x_content">   
			<h1>Add Commande</h1>
			<p>Here you can add a new commande.</p>
			<form:form method="POST" commandName="commande" action="${pageContext.request.contextPath}/commande/add.html">
			<table>
			<tbody>
				<tr>
					<td>Name:</td>
					<td><form:input path="libelle" /></td>
				</tr>
				<tr>
					<td>Date:</td>
					<td><form:input path="dateCommande" /></td>
				</tr>
				<tr>
					<td>societe:</td>
					<td><form:input path="societe.nomSociete" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Add" /></td>
				<td></td>
				</tr>
			</tbody>
			</table>
			</form:form>
			
			<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
		</div>
	</div>
</div>	
<%@include file="utils/jsp/feet.jsp" %>		
</html>