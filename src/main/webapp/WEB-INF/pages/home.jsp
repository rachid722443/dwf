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
			<p>${message}<br/>
			<a href="${pageContext.request.contextPath}/societe/add.html">Add new societe</a><br/>
			<a href="${pageContext.request.contextPath}/commande/add.html">Add new commande</a><br/>
			<a href="${pageContext.request.contextPath}/team/add.html">Add new team</a><br/>
			<a href="${pageContext.request.contextPath}/team/list.html">Team list</a><br/>
			</p>
		</div>
	</div>
</div>	
<%@include file="utils/jsp/feet.jsp" %>		
</html>