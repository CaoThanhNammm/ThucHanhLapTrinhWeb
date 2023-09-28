var elementBtnLeftSlider = document.querySelector('.left');

var elementListSlider = document.querySelector('.slide-list');

var elementBtnRightSlider = document.querySelector('.right');

var elementDots = document.querySelectorAll('.dots li');

var elementSlideItem = document.querySelectorAll('.slide-item');

function slideRightOperation(i, lengthItem){
    elementBtnRightSlider.onclick = function(){
        removeClass('active', elementSlideItem, i);
        removeClass('active', elementDots, i);
        if(i == lengthItem){
            i = 0;
        }
        else{
            i++;
        }
    
        addClass('active', elementDots, i);
        console.log(elementSlideItem[i].offsetLeft);
        addClass('active', elementSlideItem, i);
    }
}

function slideLeftOperation(i, lengthItem){
    elementBtnLeftSlider.onclick = function(){
        removeClass('active', elementSlideItem, i);
        removeClass('active', elementDots, i);
        if(i == 0){
            i = lengthItem;
        }
        else{
            i--;
        }
    
        addClass('active', elementDots, i);
        addClass('active', elementSlideItem, i);
    }
}


function addClass(className, array, i){
    array[i].classList.add(className);
}

function removeClass(className, array, i){
    array[i].classList.remove(className);
}

function slideOperation(){
    var i = 0;
    var lengthItem = elementSlideItem.length - 1;
    slideRightOperation(i, lengthItem);
    slideLeftOperation(i, lengthItem);
} 



