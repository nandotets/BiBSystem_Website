<?php include_once('../Connections/bibsysdb.php'); ?>
<?php 
	session_start();
	if(isset($_POST['login_button'])){
		$user = mysqli_real_escape_string($bibsysdb, $_POST['uname']);
		$psw = mysqli_real_escape_string($bibsysdb, $_POST['psw']);
		
		$sql = "select * from users where user='$user' and password='$psw'";
		$result_select = mysqli_query($bibsysdb, $sql);
		if(mysqli_num_rows($result_select) > 0){ //Se encontrar registro 
			while($r = mysqli_fetch_array($result_select)){
				$admin = $r['admin'];
				if($admin == 1){
					$_SESSION['uname'] = $r['fname'];
					header('Location: ../admin/index.php');
				} else {
					header('Location: ../user/index.php');
				}
			}
			exit();
		}else{ //Nao encontrou registro
			$_SESSION['no_auth'] = true;
			header('Location: index.php');
			exit();
		}
	}
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<meta name="keywords" content="Formulario, Login, HTML5">
	<meta name="description" content="Login de cliente.">
	<title>BiBSystem - Formulário de login de cliente</title>
	<link rel="icon" href="../favicon.ico" type="image/x-icon">
	<link rel="stylesheet" type="text/css" href="../css/login.css">
    <script type="text/javascript" src="../js/login.js"></script>
</head>
<body>
	<header>
		<img id="logo" src="../images/BiBSystemHeader.png" alt="BiBSystemHeader.png" onMouseOver="bannerGifOn()" onMouseOut="bannerGifOff()">
	</header>
	<nav>
		<a href="../index.php">Início</a>
		<a href="../noticias/index.html">Notícias</a>
		<a href="../forum">Fórum</a>
		<a href="../contact/index.html">Contato</a>
		<a href="../sobre/index.html">Sobre</a>
		<a href="../login/index.php" class="sign">Entrar</a>
		<a href="../signup/index.php" class="sign">Cadastrar-se</a>
	</nav>
    <form method="post" action="#" id="login" name="login">
		<h1>Entrar</h1>
		<p> Preencha os campos para entrar na conta.</p>
		<hr>
		<?php
			if(isset($_SESSION['no_auth'])):
		?>
		<div class="no_auth">
			<p>ERRO: Usuário e/ou senha inválidos.</p>
		</div>
		<?php
			endif;
			unset($_SESSION['no_auth']);
		?>
		<br>
        <label for="uname"><b>Usuário</b></label>
            <input type="text" placeholder="Digite seu usuário" id="uname" name="uname" required>
        <label for="psw"><b>Senha</b></label>
            <input type="password" placeholder="Digite sua senha" id="psw" name="psw" required>
		<label>
            <input type="checkbox" name="remember"> Lembrar senha
        </label>
        <button name="login_button" type="submit">Entrar</button>
	  <div class="container" style="background-color:#f1f1f1">
		<button type="button" class="cancelbtn" onClick="cancelBtn()">Cancelar</button>
		<span class="psw"><a href="#">Esqueceu sua senha?</a></span>
	  </div>
	</form>
    <footer>
		<p>&copy;Copyright 2018 <a target="_blank" href="../index.php">BiBSystem</a>. All rights reserved.</p>
	</footer>
</body>
</html>
