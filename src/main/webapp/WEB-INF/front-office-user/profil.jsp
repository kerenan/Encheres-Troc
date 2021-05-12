<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profil</title>
</head>
<body>
	<div align= "center">
		<c:if test="${empty modifier }" ><h1>Profil</h1></c:if>
		<c:if test="${!empty modifier }" ><h1>Mon Profil</h1></c:if>
	</div>
	<div align="center">
		<table>
			<tr>
				<td>Pseudo : </td>
				<td>${ utilisateur.getPseudo() }</td>
			</tr>
			<tr>
				<td>Nom : </td>
				<td>${ utilisateur.getNom() }</td>
			</tr>
			<tr>
				<td>Prenom : </td>
				<td>${ utilisateur.getPrenom() }</td>
			</tr>
			<tr>
				<td>Email : </td>
				<td>${ utilisateur.getEmail() }</td>
			</tr>
			<tr>
				<td>Telephone : </td>
				<td>${ utilisateur.getTelephone() }</td>
			</tr>
			<tr>
				<td>Rue : </td>
				<td>${ utilisateur.getRue() }</td>
			</tr>
			<tr>
				<td>Code Postal : </td>
				<td>${ utilisateur.getCodePostal() }</td>
			</tr>
			<tr>
				<td>Ville : </td>
				<td>${ utilisateur.getVille() }</td>
			</tr>				
		</table>
	</div>
	<div align=center >
		<c:if test="${!empty modifier }" >
			<form action="Modifier-Profil">
			<input type="hidden" name="numeroUtilisateur" value="${utilisateur.getNumeroUtilisateur() }">
			<input type="submit" name="modifier" value="Modifier">
			</form>
		</c:if>
	</div>
	
</body>
</html>