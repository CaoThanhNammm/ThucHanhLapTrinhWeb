var elementQuadraticEquation = document.querySelector("span");
var elementResult = document.querySelector(".result");

function quadraticEquation(a, b, c){
    var delta = Math.pow(b, 2) - 4 * a * c; 
    if(delta == 0){
        var x = -b/(2*a);
        return `Phương trình có nghiệm kép: ${x}`;
    }  
    else if(delta > 0){
        var x1 = (-b + Math.sqrt(delta)) / (2*a);
        var x2 = (-b - Math.sqrt(delta)) / (2*a);
        return `Phương trình có 2 nghiệm: ${x1} và ${x2}`;
    }
    else{
        return `Phương trình vô nghiệm`;
    }
}

function run(a, b, c){
    elementQuadraticEquation.innerHTML = `${a}*x^2 + ${b}*x + ${c} = 0`;
    if(a != 0){
        elementResult.innerHTML = quadraticEquation(a, b, c); 
    }
    else{
        alert("Không phải phương trình bậc 2");
    }
}