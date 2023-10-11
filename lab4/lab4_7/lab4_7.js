var elementBoard = document.querySelector('.board');

function createButton(){
    var visited = [];

    var i = 0;
    while(i < 64){
        var valueButton = Math.floor(Math.random() * (65 - 1) + 1);
        if(!visited[valueButton]){
            visited[valueButton] = true;
            var elementBtn = document.createElement("button");
            elementBoard.appendChild(elementBtn);
            elementBtn.innerText = valueButton;
            elementBtn.classList.add("btn--active");
            i++;
        }
    }
}

var pos = 1;
function run(){
    createButton();

    var elementButton = document.querySelectorAll(".btn--active");
    elementButton.forEach(function(value){
        value.onclick = function(){     
            if(value.innerText == pos){
                value.innerText = "";
                value.classList.remove("btn--active");
                value.classList.add("btn--unActive");
                value.onclick = false;
                pos += 1;
            }
            else{
                alert("sai!");
            }
        }
    });
}