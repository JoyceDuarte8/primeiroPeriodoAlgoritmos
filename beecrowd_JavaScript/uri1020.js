// Idade em dias
// Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
// Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
//  1 ano tem 360 dias.

var input = require('fs').readFileSync('stdin', 'utf8');
var qtdias = parseInt(input.split('\n'));


const qtdAnos = parseInt(qtdias / 365);
var qtdiasParaMes = qtdias % 365;

var qtMeses= 0;
var dias= 0;

if (qtdiasParaMes <= 365) {
    qtMeses = parseInt(qtdiasParaMes / 30);
    dias = qtdiasParaMes % 30;
   
}
console.log(qtdAnos + " ano(s)");
console.log(qtMeses + " mes(es)");
console.log(dias + " dia(s)");

