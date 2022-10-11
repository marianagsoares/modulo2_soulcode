"use strict";
const p = {
    idade: 12,
    altura: 1.64,
    nome: "Mariana",
    habilidades: ["java"],
    endereco: {
        rua: "rua da felicidade",
        numero: 25,
        estado: "PE",
        complemento: "teste de complemento",
        cep: "88597.003"
    },
    solteiro: false,
    rg: "8562.477",
    cumprimentar() {
        console.log(`Saudações, meu nome é ${this.nome}`);
    }
};
const p2 = {
    nome: "Paula",
    idade: 12,
    altura: 1.64,
    habilidades: ["java"],
    endereco: {
        rua: "rua da felicidade",
        numero: 25,
        estado: "PE",
        complemento: "teste de complemento",
        cep: "88597.003"
    },
    solteiro: true,
    rg: "8562.477",
    cumprimentar() {
        console.log(`Olá, eu tenho ${this.idade} anos`);
    }
};
