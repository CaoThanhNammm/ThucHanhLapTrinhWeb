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
        value.onclick = function(e){
            elementSeviceChoose.innerHTML = value.innerText;
            elementSeviceChoose.style.color = "black";
        }
    })
}

var elementSubmit = document.querySelector(".form__footer button");

function valueInput(elementId){
    return document.querySelector(elementId).value;
}

function validationOnInput(elementId){
    
    var elementInput = document.querySelector(elementId);
    var elementWarning = elementInput.parentElement.querySelector(".warning");
    elementInput.oninput = function(){
        showWarningInput({id: elementId, "type":elementInput.type, value: valueInput(elementId), warning: elementWarning});
    }
}

function validationOnChange(elementId){
    var elementInput = document.querySelector(elementId);
    var elementWarning = elementInput.parentElement.querySelector(".warning");
    
    elementInput.onchange = function(){
        showWarningChange({id: elementId, "type":elementInput.type, value: valueInput(elementId), warning: elementWarning});
    }
}

function submit(idButton){
    var elementSubmit = document.querySelector(".form__footer");
    
    elementSubmit.onclick = function(){
        if(valueInput("#fullname") === ""){
            var elementWarning = document.querySelector("#fullname").parentElement.querySelector(".warning");
            elementWarning.innerHTML = "Vui lòng nhập trường này";
        }

        if(valueInput("#email") === ""){
            var elementWarning = document.querySelector("#email").parentElement.querySelector(".warning");
            elementWarning.innerHTML = "Vui lòng nhập trường này";
        }

        var elementService = document.querySelector('#services');
        var elementWarning = document.querySelector("#services").parentElement.querySelector(".warning");
        if(elementService.innerText === "Please chooses"){
            elementWarning.innerHTML = "Vui lòng chọn dịch vụ";
        }
    }
}

function showWarningInput(object){

    if(object["value"] === ""){
        object["warning"].innerHTML = "Vui lòng nhập trường này";
    }
    else{
        object["warning"].innerHTML = ""; 
    }
}

function showWarningChange(object){
    const regex =
    /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    
    if(object["type"] === "email"){

        if(object["value"] === ""){
            object["warning"].innerHTML = "Vui lòng nhập trường này";
        }
        else if(!(object["value"]).match(regex)){
            object["warning"].innerHTML = "Trường này là email";
        }
    }
}





