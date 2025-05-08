const btn = document.getElementById("btn1")
const ctn = document.getElementById("ctn")


function trocarAImagem(){
 ctn.style.backgroundImage = "url(https://media.giphy.com/media/3ohhwfAa9rbXaZe86c/giphy.gif?cid=ecf05e47dgvay6am96jnlxxgufzhatr3eerke7cyf5mewygw&ep=v1_gifs_related&rid=giphy.gif&ct=g)"
  

}
btn.addEventListener("clink", trocarAImagem)