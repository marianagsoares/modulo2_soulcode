"use strict";
class Cachorro {
    constructor(/*nome: string,*/ raca, cor, idade, vacinado, peso, altura) {
        /*this.nome = nome*/
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.vacinado = vacinado;
        this.peso = peso;
        this.altura = altura;
    }
    getNome() {
        return this.nome;
    }
    setNome(nome) {
        this.nome = nome;
    }
}
let novoCachorro = new Cachorro('pastor alemão', 'preto', 2, true, 20, 1);
novoCachorro.setNome("Bug");
console.log(novoCachorro.getNome());
/*let c = new Cachorro() //variavel c recebe um novo objeto a classe cachorro
let c2 = new Cachorro()
console.log(c.altura)
console.log(c2.nome);
c2.nome = "Jamal"
console.log(c2.nome);*/
/*teste*/
