var input = require('fs').readFileSync('stdin', 'utf8');
var valorSrt = input.split('\n');
var valores = valorSrt.map(valorSrt => parseFloat(valorSrt));

var valorPar = 0;
var valorImpar = 0;
var valorPositivo = 0;
var valorNegativo = 0;

for (var i = 0; i < valores.length; i++) {
    var valor = valores[i];
    if (valor % 2 === 0) {
        valorPar = valorPar + 1;
    }
    if (valor % 2 !== 0) {
        valorImpar = valorImpar + 1;
    }
    if (valor > 0) {
        valorPositivo = valorPositivo + 1;
    }
    else if (valor < 0) {
        valorNegativo = valorNegativo + 1;
    }

}

console.log(valorPar + " valor(es) par(es)");
console.log(valorImpar + " valor(es) impar(es)");
console.log(valorPositivo + " valor(es) positivo(s)");
console.log(valorNegativo + " valor(es) negativo(s)");