var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var salario = parseFloat(lines.shift());
var reajusteGanho = 0;
var novoSalario = 0;

if (salario >= 0 && salario <= 400.00) {
    reajusteGanho = (salario * 0.15);
    novoSalario = salario + reajusteGanho;

    console.log("Novo salario: "+novoSalario.toFixed(2));
    console.log("Reajuste ganho: "+reajusteGanho.toFixed(2));
    console.log("Em percentual: 15 %");
}
else if (salario >= 400.01 && salario <= 800) {
    reajusteGanho = (salario * 0.12);
    novoSalario = salario + reajusteGanho;
    console.log("Novo salario: "+novoSalario.toFixed(2));
    console.log("Reajuste ganho: "+reajusteGanho.toFixed(2));
    console.log("Em percentual: 15 %");
}
else if (salario >= 800.01 && salario <= 1200) {
    reajusteGanho = (salario * 0.1);
    novoSalario = salario + reajusteGanho;
    console.log("Novo salario: "+novoSalario.toFixed(2));
    console.log("Reajuste ganho: "+reajusteGanho.toFixed(2));
    console.log("Em percentual: 10 %");
}
else if (salario >= 1200.01 && salario <= 2000) {
    reajusteGanho = (salario * 0.07);
    novoSalario = salario + reajusteGanho;
    console.log("Novo salario: "+novoSalario.toFixed(2));
    console.log("Reajuste ganho: "+reajusteGanho.toFixed(2));
    console.log("Em percentual: 7 %");
} else{

    reajusteGanho = (salario * 0.04);
    novoSalario = salario + reajusteGanho;
    console.log("Novo salario: "+novoSalario.toFixed(2));
    console.log("Reajuste ganho: "+reajusteGanho.toFixed(2));
    console.log("Em percentual: 4 %");
}

