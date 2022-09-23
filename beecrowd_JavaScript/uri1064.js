
var input = require('fs').readFileSync('stdin', 'utf8');
var notasStr = input.split('\n');
var notas=notasStr.map(notaStr => parseFloat(notaStr));

var notasPositivas=0;

var numerosPositivos=0;

for (var i = 0; i <notas.length; i++) {
    var nota = notas[i]

    if (nota >=1) {
        numerosPositivos=numerosPositivos+1;
        notasPositivas = notasPositivas + nota;
    }

}

var media = notasPositivas / numerosPositivos;


console.log(numerosPositivos + " valores positivos");
console.log(media.toFixed(1));