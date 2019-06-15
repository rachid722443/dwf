<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<%@include file="utils/jsp/head.jsp" %>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<!-- page content -->
<div class="right_col" role="main">
  	<div class="">
		<div class="clearfix"></div>			
		<div class="x_content">
			<h1>Ajouter une commande</h1>
			
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Formulaire</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">

                    <form:form method="POST" commandName="commande" action="${pageContext.request.contextPath}/commande/add.html" class="form-horizontal form-label-left">

                      <span class="section">Information</span>

                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Libelle : <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <form:input  path="libelle"  class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" required="required" type="text"/>
                        </div>
                      </div>
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Date : <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <form:input  path="dateCommande"  class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" required="required" type="text"/>
                        </div>
                      </div>
                      <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name">Société: <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <form:input  path="societe.nomSociete"  class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" required="required" type="text"/>
                        </div>
                      </div>
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-md-offset-3">
                          <a><button type="submit" onclick="history.go(-1)" class="btn btn-primary">Annuler</button></a>
                          <button id="send" type="submit" class="btn btn-success">Valider</button>
                        </div>
                      </div>
                    </form:form>
                  </div>
                </div>
              </div>
            </div>


		</div>
	</div>
</div>	
<%@include file="utils/jsp/feet.jsp" %>		
</html>