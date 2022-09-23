var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');

var codigo =parseInt(lines.shift());
var quantidade =parseInt(lines.shift());
var valorTotal=0;

switch(codigo){
    case 1:
        valorTotal=quantidade * 4.00;
        console.log("Total: R$ "+valorTotal.toFixed(2));
    break;

    case 2:
        valorTotal=quantidade * 4.50;
        console.log("Total: R$ "+valorTotal.toFixed(2));
    break;

    case 3:
        valorTotal=quantidade * 5.00;
        console.log("Total: R$ "+valorTotal.toFixed(2));
    break;
    case 4:
        valorTotal=quantidade * 2.00;
        console.log("Total: R$ "+valorTotal.toFixed(2));
    break;

    case 5:
        valorTotal=quantidade * 1.50;
        console.log("Total: R$ "+valorTotal.toFixed(2));
    break;

}