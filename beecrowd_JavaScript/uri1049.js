var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');
let filo = lines.shift();
let classe = lines.shift();
let ordem = lines.shift();

if (filo === "vertebrado") {
    if (classe == "ave") {
        if (ordem == "carnivoro") {
            console.log("aguia");
        } else if (ordem == "onivoro") {
            console.log("pomba");
        }
    } else if (classe == "mamífero") {
        if (ordem == "onivoro") {
            console.log("homem");
        } else if (ordem == "herbivoro") {
            console.log("vaca");
        }

    }
} else if (filo == "invertebrado") {
    if (classe == "inseto") {
        if (ordem == "hematofago") {
            console.log("pulga");
        } else if (ordem == "herbivoro") {
            console.log("largata");
        }
    } else if (classe == "anelideo") {
        if (ordem == "hematofago") {
            console.log("sanguessuga");
        } else if (ordem == "onivoro") {
            console.log("minhoca");
        }
    }
}
