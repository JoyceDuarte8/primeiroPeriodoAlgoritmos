// Leia um valor de ponto flutuante com duas casas decimais. 
// A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
//  As notas consideradas são de 100, 50, 20, 10, 5, 2. 
//  As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
//  A seguir mostre a relação de notas necessárias.

//toFixed(2) arredonda com duas casas depois da virgula

var input = require('fs').readFileSync('stdin', 'utf8');
var valor= parseInt(input);

console.log("NOTAS:");

var qtdNotas = 0;

qtdNotas = parseInt(valor/100 );
console.log(`${qtdNotas} nota(s) de R$ ${100},00`);
valor = valor % 100 ;

qtdNotas = parseInt(valor/50);
console.log(`${qtdNotas} nota(s) de R$ ${50},00`);
valor = valor % 50 ;

qtdNotas = parseInt(valor/20 );
console.log(`${qtdNotas} nota(s) de R$ ${20},00`);
valor = valor % 20;

qtdNotas = parseInt(valor/10);
console.log(`${qtdNotas} nota(s) de R$ ${10},00`);
valor = valor % 10;

qtdNotas = parseInt(valor/5);
console.log(`${qtdNotas} nota(s) de R$ ${5},00`);
valor = valor % 5;

qtdNotas = parseInt(valor/2 );
console.log(`${qtdNotas} nota(s) de R$ ${2},00`);
valor = valor % 2;

console.log("MOEDAS:");
qtdNotas = parseInt(valor/1);
console.log(`${qtdNotas} moeda (s) de R$ ${1},00`);
valor = valor % 1;

qtdNotas=parseFloat(valor/0.50);
console.log(`${qtdNotas} moeda (s) de R$ 0,${5}0`);
valor = valor % 0.50;

qtdNotas=parseFloat(valor/0.25);
console.log(`${qtdNotas} moeda (s) de R$ 0,${25}`);
valor = valor % 0.25;

qtdNotas=parseFloat(valor/0.10);
console.log(`${qtdNotas} moeda (s) de R$ 0,0${1}`);
valor = valor % 0.10;

qtdNotas=parseFloat(valor/0.05);
console.log(`${qtdNotas} moeda (s) de R$ 0,0${5}`);
valor = valor % 1;

qtdNotas=parseFloat(valor/0.01);
console.log(`${qtdNotas} moeda (s) de R$ 0,0${1}`);
valor = valor % 0.01;