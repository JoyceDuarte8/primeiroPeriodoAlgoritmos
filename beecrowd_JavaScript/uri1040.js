var input = require('fs').readFileSync('stdin', 'utf8');
var lines= input.split('\n');

const lines1= lines[0].split(" ");
const n1=parseFloat(lines1[0]);
const n2=parseFloat(lines1[1]);
const n3=parseFloat(lines1[2]);
const n4=parseFloat(lines1[3]);
const notaExame=parseFloat(lines[1]);

function media() {
    return (n1 *2)+ (n2*3) + (n3*4) + n4/ 10;
}
function mediaFinal (){
    return media + notaExame / 2;
}


if (media >= 7.0) {
    console.log("Media: " + media);
    console.log("Aluno aprovado.");
}
else if (media < 5.0) {
    console.log("Media: " + media);
    console.log("Aluno reprovado.");
}
else if (notaExame >= 5.0) {
        console.log("Media: " + media);
        console.log("Aluno em exame.");
        console.log("Nota do exame: " + notaExame);
        console.log("Aluno aprovado.");
        console.log("Media final: " + mediaFinal);
    }

else{
        console.log("Media: " + media);
        console.log("Aluno em exame.");
        console.log("Nota do exame: " + notaExame);
        console.log("Aluno reprovado.");
        console.log("Media final: " + mediaFinal);

    }

