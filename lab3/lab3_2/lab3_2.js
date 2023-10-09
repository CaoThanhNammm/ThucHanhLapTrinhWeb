var elementService = document.querySelector('.servive');

var elementServiceList = document.querySelector(".service__list");


function clickService(){
    elementService.onclick = function(e){
        elementServiceList.classList.toggle("active");
    }
    chooseService();
}

var elementSeviceChoose = document.querySelector(".services__default");
var elementServiceItem = document.querySelectorAll(".service__list li");

function chooseService(){
    elementServiceItem.forEach(function(value, index){
        elementServiceItem[index].onclick = function(e){
            elementSeviceChoose.innerHTML = value.innerText;
            elementSeviceChoose.style.color = "black";
        }
    })
}

