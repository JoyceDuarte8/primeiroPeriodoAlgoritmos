var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');
var horaInicial=parseInt(lines.shift());
var horaFinal=parseInt(lines.shift());

let result = 0

if(horaInicial<horaFinal){
    result= horaFinal-horaInicial;
}
else{
    result=(24-horaInicial)+horaFinal;
}

console.log(`O JOGO DUROU ${result} HORA(S)`);