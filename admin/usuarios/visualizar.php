<?php include_once('../../Connections/bibsysdb.php'); ?>
<?php 
	$consulta = "select * from users";
	$result_consulta = mysqli_query($bibsysdb, $consulta) or die(mysqli_error());
	session_start();
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<meta name="keywords" content="Biblioteca, Sistema, HTML5">
	<meta name="description" content="BiBSystem é um sistema implementado em JAVA destinado ao controle de acervo e empréstimos de uma biblioteca. Possui como prioridade uma boa aparência e facilitar a navegação do usuário.">
	<title>BiBSystem - Visualizar Usuários</title>
	<link rel="icon" href="../../favicon.ico" type="image/x-icon">
	<link rel="stylesheet" type="text/css" href="../../css/indexAdmin.css">
</head>
<body>
	<div class="container">
	<aside>
		<img id="logo" src="../../images/BiBSystem.png" alt="BiBSystemHeader.png" >
		<h2>DASHBOARD</h2>
		<h2> Olá, <?php echo $_SESSION['uname']; ?>.</h2>
	  <nav>
			<ul>
				<li><h3>Notícias</h3>
					<ul>
						<li><a href="../noticias/cadastrar.html">Cadastrar</a></li>
						<li><a href="../noticias/visualizar.html">Visualizar</a></li>
						<li><a href="../noticias/editar.html">Editar</a></li>
						<li><a href="../noticias/deletar.html">Deletar</a></li>
					</ul>
				</li>
				<li><h3>Usuários</h3>
					<ul>
						<li><a href="visualizar.php">Visualizar</a></li>
						<li><a href="editar.html">Editar</a></li>
						<li><a href="deletar.html">Deletar</a></li>
					</ul>
				</li>
				<li><h3>Sobre</h3>
					<ul>
						<li><a href="../sobre/editar.html">Editar</a></li>
					</ul>
				</li>
				<li><h3><a href="../logout.php">Sair</a></h3></li>
			</ul>
		</nav>		
		</aside>
		<main>
			<h1>VISUALIZAR USUÁRIOS</h1>
			<table border="1">
				<tr>
					<th>CPF</th>
					<th>GÊNERO</th>
					<th>DATA DE NASCIMENTO</th>
					<th>NOME</th>
					<th>SOBRENOME</th>
					<th>EMAIL</th>
					<th>TELEFONE FIXO</th>
					<th>CELULAR</th>
					<th colspan="7">ENDEREÇO</th>
				</tr>
		<?php while($dado = mysqli_fetch_array($result_consulta)){ ?>
				<tr>
					<td><?php echo $dado["cpf"]; ?></td>
					<td><?php echo $dado["gender"]; ?></td>
					<td><?php echo $dado["birth"]; ?></td>
					<td><?php echo $dado["fname"]; ?></td>
					<td><?php echo $dado["lname"]; ?></td>
					<td><?php echo $dado["email"]; ?></td>
					<td><?php echo $dado["tel"]; ?></td>
					<td><?php echo $dado["cel"]; ?></td>
						<td><?php echo $dado["cep"]; ?></td>
						<td><?php echo $dado["lograd"]; ?></td>
						<td><?php echo $dado["num"]; ?></td>
						<td><?php echo $dado["compl"]; ?></td>
						<td><?php echo $dado["district"]; ?></td>
						<td><?php echo $dado["city"]; ?></td>
						<td><?php echo $dado["uf"]; ?></td>
				</tr>
		<?php }?>
			</table>
		</main>
	</div>
	<footer>
		<p id="footerCopyrights">
			&copy;Copyright 2018 <a target="_blank" href="../../index.php">BiBSystem</a>. All rights reserved.
		</p>
	</footer>
</body>
</html>
