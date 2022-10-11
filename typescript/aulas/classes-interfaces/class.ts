class Cachorro {
    private nome: string
    private raca: string
    public cor: string
    public idade: number
    public vacinado: boolean
    public peso: number
    public altura: number

    constructor(/*nome: string,*/ raca: string, cor: string, idade: number, vacinado: boolean, peso: number, altura: number){ //funcao construtor serve para inicializar a classe
        /*this.nome = nome*/
        this.raca = raca
        this.cor = cor
        this.idade = idade
        this.vacinado = vacinado
        this.peso = peso
        this.altura = altura
    }

    getNome() {
        return this.nome
    }

    setNome(nome : string) {
        this.nome = nome
    }
}
let novoCachorro = new Cachorro('pastor alemão', 'preto', 2, true, 20, 1)
novoCachorro.setNome("Bug")
console.log(novoCachorro.getNome())


/*let c = new Cachorro() //variavel c recebe um novo objeto a classe cachorro
let c2 = new Cachorro()
console.log(c.altura)
console.log(c2.nome);
c2.nome = "Jamal"
console.log(c2.nome);*/
/*teste*/

