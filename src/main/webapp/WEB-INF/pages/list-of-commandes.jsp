<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <%@include file="utils/jsp/head.jsp" %>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <!-- page content -->
    <!-- page content -->
    <div class="right_col" role="main">
        <div class="">
            <div class="clearfix"></div>	
            <div class="x_content">
                <h1>Liste des commandes</h1>

                <div class="row">

                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>Tableau</h2>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">

                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>Libellé</th>
                                            <th>Date</th>
                                            <th>Société</th>
                                         
                                            <th>#</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="commande" items="${commandes}">
                                            <tr>
                                                <td>${commande.libelle}</td>
                                                <td>${commande.dateCommande}</td>
                                                <td>${commande.societe.nomSociete}</td>
                                                <td>
                                                    <a type="button" class="btn btn-round btn-info" href="${pageContext.request.contextPath}/societe/edit/${societe.idSociete}.html">Modifier</a>
                                                    <a type="button" class="btn btn-round btn-danger"  href="${pageContext.request.contextPath}/societe/delete/${societe.idSociete}.html">Supprimer</a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>

                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>	
        <%@include file="utils/jsp/feet.jsp" %>	
</html>