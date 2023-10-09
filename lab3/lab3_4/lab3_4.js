var elementGenderBox = document.querySelectorAll(".form__container__2--right .form__group")

function chooseGender(){
    elementGenderBox.forEach(function(value, index){
        value.onclick =  function(){
            if(index == 0){
                elementGenderBox[index+1].classList.remove("active");
            }
            else{
                elementGenderBox[index-1].classList.remove("active");
            }
            value.classList.toggle('active');
        }
    })
}

var elementMethodPaymentBox = document.querySelectorAll(".method__payment .form__group");

function chooseMethodPayment(){
    elementMethodPaymentBox.forEach(function(value, index){
        value.onclick =  function(){
            if(index == 0){
                elementMethodPaymentBox[index+1].classList.remove("active");
            }
            else{
                elementMethodPaymentBox[index-1].classList.remove("active");
            }
            value.classList.toggle('active');
        }
    })
}













