// NÃO FOI ACEITA A RESPOSTA NO BEECROWD:

var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(" ");
var x=parseFloat(lines.shift());
var y=parseFloat(lines.shift());

if (x>0 && y>0){
    console.log("Q1");
}
else if (x<0 && y>0){
    console.log("Q2");
}
else if (x<0 && y<0){
    console.log("Q3");
}
else if (x>0 && y<0){
    console.log("Q4");
}

else if (x===0) {
    console.log("Eixo Y");
}
else if(y ===0) {
    console.log("Eixo X");
}
else {
    console.log("Origem");
}
