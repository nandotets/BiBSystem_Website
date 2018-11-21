<?php 
include('verify_login.php');
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<meta name="keywords" content="Biblioteca, Sistema, HTML5">
	<meta name="description" content="BiBSystem é um sistema implementado em JAVA destinado ao controle de acervo e empréstimos de uma biblioteca. Possui como prioridade uma boa aparência e facilitar a navegação do usuário.">
	<title>BiBSystem - Dashboard</title>
	<link rel="icon" href="../favicon.ico" type="image/x-icon">
	<link rel="stylesheet" type="text/css" href="../css/indexAdmin.css">
</head>
<body>
	<div class="container">
	<aside>
		<img id="logo" src="../images/BiBSystem.png" alt="BiBSystemHeader.png" >
		<h2>DASHBOARD</h2>
		<h2> Olá, <?php echo $_SESSION['uname']; ?>.</h2>
		<nav>
			<ul>
				<li><h3>Notícias</h3>
					<ul>
						<li><a href="noticias/cadastrar.html">Cadastrar</a></li>
						<li><a href="noticias/visualizar.html">Visualizar</a></li>
						<li><a href="noticias/editar.html">Editar</a></li>
						<li><a href="noticias/deletar.html">Deletar</a></li>
					</ul>
				</li>
				<li><h3>Usuários</h3>
					<ul>
						<li><a href="usuarios/visualizar.php">Visualizar</a></li>
						<li><a href="usuarios/editar.php">Editar</a></li>
						<li><a href="usuarios/deletar.php">Deletar</a></li>
					</ul>
				</li>
				<li><h3>Sobre</h3>
					<ul>
						<li><a href="sobre/editar.html">Editar</a></li>
					</ul>
				</li>
				<li><h3><a href="logout.php">Sair</a></h3></li>
			</ul>
		</nav>
		</aside>
		<main>

			
		</main>
	</div>
	<footer>
		<p id="footerCopyrights">
			&copy;Copyright 2018 <a target="_blank" href="../index.php">BiBSystem</a>. All rights reserved.
		</p>
	</footer>
</body>
</html>
