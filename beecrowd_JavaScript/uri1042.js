var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split(' ');

var x = parseInt(lines.shift());
var y = parseInt(lines.shift());
var z = parseInt(lines.shift());

var a = x;
var b= y;
var c= z;

var aux=0;
if (b<a){
    aux=a;
    a=b; 
    b=aux;
}

if(c < a){
    aux = a;
    a = c;
    c = aux;
}
if(c<b){
    aux=b;
    b=c;
    c=aux;
}

console.log(a);
console.log(b);
console.log(c);
console.log(" ");
console.log(x);
console.log(y);
console.log(z);
