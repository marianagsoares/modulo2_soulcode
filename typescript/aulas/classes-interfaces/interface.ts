/*let pessoa1 = {
    nome: 'Pietro',
    idade: 22,
    cpf: '111.222.333.444',
    solteiro: false,
    habilidades: ['Java', 'Angular', 'JavScript'],
    endereco: {
        rua: "Rua feliz",
        numero: 567,
        estado: "Pernambuco",
        complemento: "sem complemento",
        cep: "58360.020"
    }
}

let pessoa2 = {
    nome: 'Pietro',
    idade: 22,
    cpf: '111.222.333.444',
    solteiro: false,
    habilidades: ['Java', 'Angular', 'JavScript'],
    endereco: {
        rua: "Rua feliz",
        numero: 567,
        estado: "Pernambuco",
        complemento: "sem complemento",
        cep: "58360.020"
    },
    rg: "112.002.577.83"
}*/
interface Endereco {
    rua: string
    numero: number
    estado: string
    complemento: string
    cep: string
}

interface Pessoa { //primeira letra maiúscula
    nome: string
    idade: number
    altura: number
    solteiro: boolean
    habilidades: string[]
    endereco: Endereco
    rg: string
    cumprimentar(): void
}

const p: Pessoa = {
    idade: 12,
    altura: 1.64,
    nome: "Mariana",
    habilidades: ["java"],
    endereco:
    {
    rua: "rua da felicidade",
    numero: 25,
    estado: "PE",
    complemento: "teste de complemento",
    cep: "88597.003"
    },
    solteiro: false,
    rg: "8562.477",
    cumprimentar(){
        console.log(`Saudações, meu nome é ${this.nome}`)
    }
}

const p2: Pessoa = {
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
    cumprimentar(){
        console.log(`Olá, eu tenho ${this.idade} anos`)
    }
}