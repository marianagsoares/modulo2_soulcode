"use strict";
function palavraMaiuscula1(palavra1) {
    return palavra1.replace("Mariana", "Tales");
}
function palavraMaiuscula2(palavra2) {
    //Quando eu coloco o tipo(string) no parâmetro da função(palavra2) 
    //ele me dá um preview das funções disponíveis para o meu parâmetro.
    return palavra2.replace("Roberta", "José");
}
console.log(palavraMaiuscula1("Mariana, Débora"));
//console.log(palavraMaiuscula1(10))
//não há erro de sintaxe mas há erro de lógica porque o tipo string não foi respeitado
//console.log(palavraMaiuscula1(true))
//não há erro de sintaxe mas há erro de lógica porque o tipo string não foi respeitado
console.log(palavraMaiuscula2("Mariana, Julia, Ricardo, Roberta, Fernando"));
palavraMaiuscula2(10);
palavraMaiuscula2(true);
