<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib	prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" charset="ISO-8859-1">
</head>
<body>
	Bem vindo ao nosso gerenciador de empresas!
	<c:if test="${not empty usuarioLogado }">
		Você está logado como ${usuarioLogado.email}<br/>
	</c:if>
	
	<br />
	<form action="novaEmpresa" method="POST">
		Nome: <input type="text" name="nome" /><br> <br> <input
			type="submit" value="Enviar" />
	</form>
	<br>
	<br>
	<form action="login" method="post">
		Email: <input type="email" name="email" /> <br> <br> Senha:
		<input type="password" name="senha" /> <br>
		<br> <input type="submit" value="Logar" />
	</form>
	<br>
	<form action="logout" method="post">
		<input type="hidden" name="tarefa" value="logout">	
		<input type="submit" value="logout">
	</form>

</body>
</html>