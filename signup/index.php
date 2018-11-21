<?php include_once('../Connections/bibsysdb.php'); ?>
<?php
	if(isset($_POST['submit'])){
		$cpf = $_POST['cpf'];
		$gender = $_POST['gender'];
		$birth = $_POST['birth'];
		$fname = $_POST['fnome'];
		$lname = $_POST['lnome'];
		$email = $_POST['email'];
		$tel = $_POST['tel'];
		$cel = $_POST['cel'];
		$cep = $_POST['cep'];
		$lograd = $_POST['logradouro'];
		$num = $_POST['numero'];
		$comp = $_POST['comp'];
		$district = $_POST['bairro'];
		$city = $_POST['cidade'];
		$uf = $_POST['uf'];
		$user = $_POST['usuario'];
		$psw = $_POST['psw'];
		
		$sql = "insert into users (cpf, gender, birth, fname, lname, email, tel, cel, cep, lograd, num, compl, district, city, uf, user, password) values ('$cpf', '$gender', '$birth', '$fname', '$lname', '$email', '$tel', '$cel', '$cep', '$lograd', '$num', '$comp', '$district', '$city', '$uf', '$user', '$psw')";
		$result_mysqli = mysqli_query($bibsysdb, $sql) or die(mysqli_error($bibsysdb));
	}
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<meta name="keywords" content="Formulario, Cliente, HTML5">
	<meta name="description" content="Fomulário de cadastro de cliente.">
	<title>BiBSystem - Formulário de cadastro de cliente</title>
	<link rel="icon" href="../favicon.ico" type="image/x-icon">
	<link rel="stylesheet" type="text/css" href="../css/signup.css">
    <script type="text/javascript" src="../js/signup.js"></script>
    <script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
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
		<a href="index.php" class="sign">Cadastrar-se</a>
	</nav>
      
	<form method="post" action="" autocomplete="on" id="formulario" name="formulario" onSubmit="check_inputs(); return false;">
	  <div class="container">
			<h1>Cadastrar-se</h1>
			<p> Preencha os campos para criar uma conta.</p>
            <p>(*) Campos obrigatórios</p>
			<hr>
			<fieldset>
				<legend>Informações pessoais</legend>
				<br>
				<label for="cpf"><strong>*CPF (digite somente números)</strong></label>
					<input type="text" name="cpf" id="cpf" onkeypress="mascara(this,cpfmask)" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" maxlength="14" title="Digite o CPF no formato: NNN.NNN.NNN-NN" required>
				<strong>Gênero</strong>
					<input type="hidden" id="gender" name="gender" value="N">
					<input type="radio" id="gender" name="gender" value="M">
				<label>Masculino</label>
					<input type="radio" id="gender" name="gender" value="F">
				<label>Feminino</label>
					<input type="radio" id="gender" name="gender" value="U">
				<label>Prefiro não dizer</label>
				<br><br>
				<label for="datebirth"><strong>Data de nascimento</strong></label>
					<input type="date" name="birth" id="birth">
				<label for="fnome"><strong>*Primeiro nome</strong></label>
					<input type="text" placeholder="Digite o primeiro nome" name="fnome" id="fnome" required>
				<label for="lnome"><strong>Último nome</strong></label>
					<input type="text" placeholder="Digite o último nome" name="lnome" id="lnome">
				<label for="email"><strong>*Email (exemplo@email.xom)</strong></label>
					<input type="email" placeholder="Digite o email" name="email" id="email" required>
				<label for="tel"><strong>Telefone fixo</strong></label>
					<input type="tel" id="tel" name="tel" placeholder="(00)0000-0000" onKeyPress="mascara(this,telefonemask)" maxlength="14">
 				<label for="cel"><strong>Celular</strong></label>
					<input type="tel" id="cel" name="cel" placeholder="(00)00000-0000" onKeyPress="mascara(this,cellphonemask)" maxlength="15">
			</fieldset>
			<br>
			<fieldset>
				<legend>Endereço</legend>
				<br>
				<label for="cep"><strong>CEP (Digite somente números)</strong></label>
					<input type="text" placeholder="00000000" name="cep" id="cep" maxlength="8" onKeyPress="mascara(this,onlyNumbers">
				<label for="logradouro"><strong>Logradouro</strong></label>
					<input type="text" name="logradouro" id="logradouro">
				<label for="numero"><strong>Numero</strong></label>
					<input type="number" class="numero" name="numero" id="numero" min="0" maxlength="6" onKeyPress="mascara(this,onlyNumbers)" placeholder="Digite o número">
				<label for="comp"><strong>Complemento</strong></label>
					<input type="text" name="comp" id="comp" placeholder="Digite o complemento (se necessário)">
				<label for="bairro"><strong>Bairro</strong></label>
					<input type="text" name="bairro" id="bairro" >
				<label for="cidade"><strong>Cidade</strong></label>
					<input type="text" name="cidade" id="cidade" >
				<label for="uf"><strong>UF (Estado)</strong></label>
					<select id="uf" name="uf" class="selects">
            <option value="--" selected>--</option>
			<option value="AC">Acre</option>
			<option value="AL">Alagoas</option>
			<option value="AP">Amapá</option>
			<option value="AM">Amazonas</option>
			<option value="BA">Bahia</option>
			<option value="CE">Ceará</option>
			<option value="DF">Distrito Federal</option>
			<option value="ES">Espírito Santo</option>
			<option value="GO">Goiás</option>
			<option value="MA">Maranhão</option>
			<option value="MT">Mato Grosso</option>
			<option value="MS">Mato Grosso do Sul</option>
			<option value="MG">Minas Gerais</option>
			<option value="PA">Pará</option>
			<option value="PB">Paraíba</option>
			<option value="PR">Paraná</option>
			<option value="PE">Pernambuco</option>
			<option value="PI">Piauí</option>
			<option value="RJ">Rio de Janeiro</option>
			<option value="RN">Rio Grande do Norte</option>
			<option value="RS">Rio Grande do Sul</option>
			<option value="RO">Rondônia</option>
			<option value="RR">Roraima</option>
			<option value="SC">Santa Catarina</option>
			<option value="SP">São Paulo</option>
			<option value="SE">Sergipe</option>
			<option value="TO">Tocantins</option>
		</select>
			</fieldset>
			<br>
			<fieldset>
<script> //Preencher campos de endereço automaticamente pelo CEP - Utiliza ViaCEP
	$("#cep").focusout(function(){
			//Início do Comando AJAX
		$.ajax({
			//O campo URL diz o caminho de onde virá os dados
			//É importante concatenar o valor digitado no CEP
		url: 'https://viacep.com.br/ws/'+$(this).val()+'/json/unicode/',
			//Aqui você deve preencher o tipo de dados que será lido,
			//no caso, estamos lendo JSON.
		dataType: 'json',
			//SUCESS é referente a função que será executada caso
			//ele consiga ler a fonte de dados com sucesso.
			//O parâmetro dentro da função se refere ao nome da variável
			//que você vai dar para ler esse objeto.
		success: function(resposta){
			//Agora basta definir os valores que você deseja preencher
			//automaticamente nos campos acima.
				$("#logradouro").val(resposta.logradouro);
				$("#bairro").val(resposta.bairro);
				$("#cidade").val(resposta.localidade);
				$("#uf").val(resposta.uf);
			//Vamos incluir para que o Número seja focado automaticamente
			//melhorando a experiência do usuário
				$("#numero").focus();
			}
		});
	})
</script>
				<legend>Acesso</legend>
				<label for="usuario"><strong>*Usuário (4 a 16 caracteres)</strong></label>
				<input type="text" placeholder="Digite um usuário de 4 a 16 caracteres" name="usuario" id="usuario" maxlength="16" required> 
				<label for="psw"><strong>*Senha (6 caracteres)</strong></label>
				<input type="password" placeholder="Digite uma senha de 6 dígitos" id="psw" name="psw" maxlength="6" required>
				<label for="psw-repeat"><strong>*Repetir senha</strong></label>
				<input type="password" placeholder="Digite a senha novamente" id="psw-repeat" name="psw-repeat" required>
		  </fieldset>
			<label><br>
				<input type="checkbox" name="terms" style="margin-bottom:15px" required>
				Eu aceito os <a href="#" style="color:dodgerblue">Termos de Privacidade</a> ao criar a conta.
			</label>
			<div class="clearfix">
				<button type="button" onClick="cancelBtn()" class="cancelbtn">Cancelar</button>
				<button name="submit" type="submit" class="signupbtn">Registrar-se</button>
			</div>
	  </div>
	  <input type="hidden" name="MM_insert" value="formulario">
	</form>
	<footer>
		<p id="footerCopyrights">
			&copy;Copyright 2018 <a target="_blank" href="../index.php">BiBSystem</a>. All rights reserved.
		</p>
	</footer>
</body>
</html>
