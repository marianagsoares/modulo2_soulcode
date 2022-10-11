"use strict";
//tipagem implicita
let teste = 'exemplo de string';
teste = "olá";
//erro porque acima essa variável recebe um valor do tipo string e embaixo atribuo um valor numérico a essa variável.
//tipagem explicita
let pi = 855.4;
let teste1 = "gfdd";
let logado = false;
let exemplo1 = [{}, "fgfd", 222, true];
//union types
let rg = "85.2";
//rg = '52874122114' //nao da erro porque eu disse que a variável a rg era do tipo number e do tipo string
let nome = ["oi", "testar", "testando"];
nome = "aaa";
nome = [9];
let observe = {
    nome: "Mariana",
    idade: 23,
    sexo: "F"
};
let observe1 = {
    nome: "Tales",
    idade: 24,
    sexo: "F"
};
let observe3 = [
    {
        nome: "Mariana",
        idade: 23,
        sexo: "F"
    }
];
let observe4 = [
    {
        nome: "teste",
        idade: 28,
        sexo: "F"
    },
    {
        nome: "mariana",
        idade: 30,
        sexo: "teste"
    },
    {
        nome: "observe",
        idade: 2412,
        sexo: "texto"
    }
];
//arrays que recebem um valor ou outro
let teste2 = [{
        a: 358,
        b: "teste",
        c: true,
    },
    {
        d: true,
        e: false
    },
    {
        a: 2555,
        b: 8545
    }];
let exemplo2 = [];
exemplo2 = [85, 5, 2, 5];
//let exemplo2: boolean[] = 
//[ true, false, false]
//sem erro porque adicionou uma string a um array do tipo string
const exemploArrayString = ["Joao Pedro", "Ricardo", "Fernando"];
exemploArrayString.push("Roberta");
//com erro porque adicionei uma string a um array do tipo numérico
const exemploArrayNumerico = [1, 2, 3, 4];
exemploArrayNumerico.push(85);
//arrays que recebem varios tipos de valores
const exemploArrayGuardaMaisDeUmValor = [true, false, false, "Mariana"];
//Diferentes formas de declarar um array de tipo único
const observeDiferenca = [false, true, false];
const observeDiferenca2 = [true, false, true, true];
const veja = ["olá", "teste"];
const veja2 = ["olá", "teste"];
const veja3 = [{ nome: "", idade: 855, sexo: "F" }];
const veja4 = [{ nome: "", idade: 855, sexo: "F" }];
