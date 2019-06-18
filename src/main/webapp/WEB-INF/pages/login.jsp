<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<head>
    <META HTTP-EQUIV="Content-Style-Type" CONTENT="text/css">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>DataWorkFlow</title>
    
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <style>
       <%@include file="utils/css/bootstrap.min.css" %>
       <%@include file="utils/css/custom.min.css" %>
    </style>
</head>
  
<body class="nav-md">
    <div>

    <div class="login_wrapper">
      <div class="animate form login_form">
        <section class="login_content">
          <form:form  method="POST" commandName="user" action="${pageContext.request.contextPath}/user/login.html" >
            <h1>Formulaire de connection</h1>
            <div>
              <form:input path="id" type="text" class="form-control" placeholder="Username" required="" />
            </div>
            <div>
              <form:input path="password" type="password" class="form-control" placeholder="Password" required="" />
            </div>
            <div>
              <button id="send" type="submit" class="btn btn-success">Log in</button>
              <a class="reset_pass" href="#">Mot de passe oublié ?</a>
            </div>

            <div class="clearfix"></div>

            <div class="separator">
              <p class="change_link">Nouveau ?
                <a href="${pageContext.request.contextPath}/user/add.html" class="to_register"> Créer un compte </a>
              </p>

              <div class="clearfix"></div>
              <br />

              <div>
                <h1><i class="fa fa-paw"></i> Data Work Flow!</h1>
                <p>©2019 All Rights Reserved.</p>
              </div>
            </div>
          </form:form>
        </section>
      </div>
     </div>
   </div>
	<script>
	  <!-- jQuery -->
	  <%@include file="utils/js/jquery.js" %>
	  <%@include file="utils/js/jquery.min.js" %>
	  <!-- Bootstrap -->
	  <%@include file="utils/js/bootstrap.min.js" %>
	  <!-- Custom Theme Scripts -->
	  <%@include file="utils/js/custom.min.js" %>
	  <!-- Charts js -->
	  <%@include file="utils/js/Chart.bundle.min.js" %>
	  <!-- Google Chart -->
	  <%@include file="utils/js/loader.js" %>
	</script>
  
</body>