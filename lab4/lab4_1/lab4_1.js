var elementBtn = document.querySelectorAll(".btn__item");
var body = document.querySelector("body");

elementBtn.forEach(function(value, index){
    value.onclick = function(){
        body.style.backgroundColor = value.style.backgroundColor;
    }
})
