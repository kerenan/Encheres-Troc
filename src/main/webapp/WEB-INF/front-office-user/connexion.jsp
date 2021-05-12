<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width initial scale=1.0" />
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<title>Connexion</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12 col-sm-12">
				<form method="post" action="<c:url value="/"/>">
					<div class="form-group row">
						<label for="login" class="col-sm-2 col-form-label">Identifiant
							:</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" id="login">
						</div>
					</div>
					<div class="form-group row">
						<label for="password" class="col-sm-2 col-form-label">Mot
							de passe :</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="password"
								placeholder="Password">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-sm-4">
							<button type="submit" class="btn btn-primary">Connexion</button>
						</div>
						<div class="col-sm-6">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" id="gridCheck1">
								<label class="form-check-label" for="gridCheck1">Se
									souvenir de moi</label>
							</div>
							<div>
								<!-- TODO -->
								<a href="">Mot de passe oublié</a>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>