var input = require('fs').readFileSync('stdin', 'utf8');
var lines= input.split('\n');
var renda =parseFloat(lines.shift());

if(renda<=2000){
    console.log("Isento");
}
else if(renda>=2000.01&&renda<3000){
   
     var imposto8 = (renda - 2000) * 8 / 100;
    // return imposto8;

}
else if(renda>=3000.01&&renda<=4500){
     var imposto18 = (renda - 3000) * 18 / 100+(1000*0.08);
    // return imposto18;
    
}
else{
    var imposto28 = (renda - 4500) * 28 / 100+ (1500*0.18)+ (1000*0.08);
    // return imposto28;
    
}
 var taxa = imposto8 + imposto18 + imposto28;

console.log(`R$ ${taxa}.00`);