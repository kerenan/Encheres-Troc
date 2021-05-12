<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<h1 align="center" >Liste des enchères</h1>
	<div>
		<form action="" method="POST">
			<label>filtres :</label>
			<br>
			<br>
			<br>
			<div>
				<input type="search" name="recherche" placeholder="le nom de l'article contient " size=50 spellcheck=false >
				<br>
			    <select name="categorie" id="categorie">
					<c:forEach items="${ categories }" var="categorie" varStatus="status">
				    	<option value=${ categorie.noCategorie } >${categorie.libelle }</option>
					</c:forEach>
			    </select>
		    </div>
		    <c:if test="${!empty sessionId}">
		    	<div  >
		    		<input type="radio" name="achatVente" value="achats">
		    		<label>Mes achats</label>
		    		<div align="left">
		    			<input type="checkbox" name="enchereOuverte" value="enchereOuverte">
		    			<label>Enchères ouvertes</label><br>
		    			<input type="checkbox" name="enchereUtilisateur" value="enchereUtilisateur">
		    			<label>Mes enchères</label><br>
		    			<input type="checkbox" name="enchereRemporte" value="enchereRemporte">
		    			<label>Enchères remportées</label><br>
		    		</div>
		    	</div>
		    	<div  >
		    		<input type="radio" name="achatVente" value="ventes">
		    		<label>Mes ventes</label><br>
		    		<div >
			    		<input type="checkbox" name="ventesEnCours" value="ventesEnCours">
		    			<label>Mes ventes en cours</label><br>
		    			<input type="checkbox" name="ventesNonDebute" value="ventesNonDebute">
		    			<label>Ventes non debuté</label><br>
		    			<input type="checkbox" name="ventesTermine" value="ventesTermine">
		    			<label>Ventes terminé</label>
	    			</div>
		    	</div>
		    </c:if>
		    <div align="center">
		    	<input type="submit" value="rechercher">
		    </div>
		</form>
	</div>
	<div>
		<c:forEach items="${ articles }" var="article" varStatus="status">
				<div>					
					<div>
						<img src="https://via.placeholder.com/150">
					</div>
					<div>
						<a href="#">${article.getNomArticle()}</a><br>
						<p>Prix : ${article.getPrixArticle()}</p><br>
						<p>Fin de l'enchère ${article.getDateFinEncheres()}</p><br>
						<p>Vendeur : <a href="#">${article.getUtilisateur().getPseudo}</a><br>
					</div>					
				</div>    	
		</c:forEach>
	</div>

</body>
</html>