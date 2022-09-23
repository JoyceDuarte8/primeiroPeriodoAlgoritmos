// 1002- Area do círculo
// A fórmula para calcular a área de uma circunferência é: area = π . raio2.
// Considerando para este problema que π = 3.14159:
// Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var raio=parseFloat(lines);
var PI = 3.14159;
var area= PI*Math.pow(raio,2);

console.log("A="+ area.toFixed(4));
