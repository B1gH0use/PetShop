<%
	String nomeEmpresa = "Alura";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Petshop</title>
<link rel="stylesheet" href="style.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
</head>
<body>
	<h1 class="title">Petshop</h1>
	<h3><%=nomeEmpresa %></h3>
	<nav class="navContainer">
		<a href="CadastrarCliente.html">Adicionar Novo Cliente</a>
		<a href="DeletarCliente.html">Deletar Cliente</a>
		<a href="EditarCliente.html">Editar Cliente</a>
		<a href="CadastrarProduto.html">Adicionar Novo Produto</a>
		<a href="DeletarProduto.html">Deletar Produto</a>
		<a href="EditarProduto.html">Editar Produto</a>
		<a href="listarInfo">Listar Informações Cadastradas</a>	
	</nav>
</body>
</html>