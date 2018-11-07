function cancelBtn(){
	if(confirm("Deseja realmente cancelar? Você será redirecionado à página inicial.")){ //Se confirmar cancelar o cadastro
		window.location.assign("../index.html");
	}
}

function bannerGifOn(){
	document.getElementById("logo").src = "../images/BiBSystemHeader.gif";
}

function bannerGifOff(){
	document.getElementById("logo").src = "../images/BiBSystemHeader.png";
}