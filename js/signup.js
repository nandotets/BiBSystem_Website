
function mascara(o,f){
    v_obj=o
    v_fun=f
    setTimeout("execmascara()",1)
}

function execmascara(){
    v_obj.value=v_fun(v_obj.value)
}

function onlyNumbers(v){ //Mascara somente numeros
    return v.replace(/\D/g,"")
}

function cpfmask(v){
    v=v.replace(/\D/g,"") //Remove tudo o que não é dígito
    v=v.replace(/(\d{3})(\d)/,"$1.$2") //Coloca um ponto entre o terceiro e o quarto dígitos
    v=v.replace(/(\d{3})(\d)/,"$1.$2") //Coloca um ponto entre o terceiro e o quarto dígitos
//de novo (para o segundo bloco de números)
    v=v.replace(/(\d{3})(\d{1,2})$/,"$1-$2") //Coloca um hífen entre o terceiro e o quarto dígitos
    return v
}

function telefonemask(v){ //Mascara de telefone fixo (xx) xxxx-xxxx
    v=v.replace(/\D/g,"")                 //Remove tudo o que não é dígito
    v=v.replace(/^(\d\d)(\d)/g,"($1) $2") //Coloca parênteses em volta dos dois primeiros dígitos
    v=v.replace(/(\d{4})(\d)/,"$1-$2")    //Coloca hífen entre o quarto e o quinto dígitos
    return v
}

function cellphonemask(v){ //Mascara de numero de celular (xx) xxxxx-xxxx
    v=v.replace(/\D/g,"")                 //Remove tudo o que não é dígito
    v=v.replace(/^(\d\d)(\d)/g,"($1) $2") //Coloca parênteses em volta dos dois primeiros dígitos
    v=v.replace(/(\d{5})(\d)/,"$1-$2")    //Coloca hífen entre o quinto e o sexto dígitos
    return v
}

function check_cpf(strCPF) { //Valida CPF
	cpf = strCPF.replace('.','');
	cpf = cpf.replace('.','');
	cpf = cpf.replace('-','');
    var Soma;
    var Resto;
    Soma = 0;
	//Se CPF sequencia de numeros iguais, falso
  if (cpf === "00000000000" | cpf === "11111111111"
  | cpf === "22222222222" | cpf === "33333333333"
  | cpf === "44444444444" | cpf === "55555555555"
  | cpf === "66666666666" | cpf === "77777777777"
  | cpf === "77777777777" | cpf === "99999999999"
  ) {
  	document.getElementById("cpf").focus();
  }
  for (i=1; i<=9; i++) Soma = Soma + parseInt(cpf.substring(i-1, i)) * (11 - i);
  Resto = (Soma * 10) % 11;
   
    if ((Resto === 10) || (Resto === 11))  Resto = 0;
    if (Resto != parseInt(cpf.substring(9, 10)) ) return false;
   
  Soma = 0;
    for (i = 1; i <= 10; i++) Soma = Soma + parseInt(cpf.substring(i-1, i)) * (12 - i);
    Resto = (Soma * 10) % 11;
   
    if ((Resto === 10) || (Resto === 11))  Resto = 0;
    if (Resto != parseInt(cpf.substring(10, 11) ) ) return false;
    return true;
}

function checkPass(){ //Verificação de repetição de senha correta
	if(document.getElementById("psw").value == document.getElementById("psw-repeat").value) 
		return true;
	else
		return false;
}

function check_inputs(){
	var input_cpf = document.getElementById("cpf");
	var input_usuario = document.getElementById("usuario");
	
	if(!check_cpf(input_cpf.value)){ //CPF inválido
		alert("Digite um CPF válido.");
		document.getElementById("cpf").focus();
		return false;
	}
	if(!checkPass()){ //Senhas diferentes
		alert("As senhas não conferem.");
		document.getElementById("psw").focus();
		return false
	}
	if(((input_usuario.value).length) < 4){ //Usuario menos que 4 caracteres
		alert("O usuário deve conter entre 4 e 16 caracteres.");
		document.getElementById("usuario").focus();
		return false;
	}
	submit();
}

function cancelBtn(){
	if(confirm("Deseja realmente cancelar o cadastro? Você será redirecionado à página inicial.")){ //Se confirmar cancelar o cadastro
		window.location.assign("../index.html");
	}
}

function bannerGifOn(){
	document.getElementById("logo").src = "../images/BiBSystemHeader.gif";
}

function bannerGifOff(){
	document.getElementById("logo").src = "../images/BiBSystemHeader.png";
}