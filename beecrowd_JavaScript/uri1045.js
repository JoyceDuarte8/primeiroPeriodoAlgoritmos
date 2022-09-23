var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');

var A = parseFloat(lines.shift());
var B = parseFloat(lines.shift());
var C = parseFloat(lines.shift());

if (C > B) {
    var aux = B;
    B = C;
    C = aux;
}

if (B > A) {
    aux = A;
    A = B;
    B = aux;
}
if (C > A) {
    aux = A;
    A = C;
    C = aux;
}

    if (A >= B + C) {
        console.log("NAO FORMA TRIANGULO");
    }
    if ((A * A) === (B * B) + (C *C)) {
        console.log("TRIANGULO RETANGULO");
    }
    if ((A * A) > (B * B) + (C *C)) {
        console.log("TRIANGULO OBTUSANGULO");
    }
    if ((A * A) < (B * B) + (C * C)) {
        console.log("TRIANGULO ACUTANGULO");
    }
    if (A === B && B === C) {
        console.log("TRIANGULO EQUILATERO");
    }
    else{

    if (A === B && C != A || C === B && C != A || A === C && C != B) 
        console.log("TRIANGULO ISOSCELES");
    }


    //erro


