import { Injectable } from '@angular/core';

/**
 * providedIn informa onde o serviço será fornecido
 */

/**
 * A ideia de um serviço no Angular é encapsular alguma lógica que pode ser utilizada em vários locais da sua aplicação
 */

interface Cliente {
  nome: string;
  sobrenome: string;
  telefone: string;
  id: number;
  email: string;
  cpf: string;
}

/**
 * C → Create
 * R → Read
 * U → Update
 * D → Delete
 */


@Injectable({
  providedIn: 'root' // 'root' faz referência ao AppModule
})
export class ClientesService {
//ClienteService é minha classe
//clientes e o nome do array
//Cliente Cliente e a interface
  private clientes: Cliente[] = [{
    nome: 'Frederico',
    sobrenome: 'Alves',
    cpf: '111111111111',
    email: 'fredao@gmail.com',
    telefone: '998765432',
    id: 1
  },
  {
    nome: 'José',
    sobrenome: 'Almir',
    cpf: '222222222222',
    email: 'jose.almir@soulcodeacademy.org',
    telefone: '998765432',
    id: 2
  },
  {
    nome: 'Renato',
    sobrenome: 'Pereira',
    cpf: '33333333333',
    email: 'renato.pereira@soulcodeacademy.org',
    telefone: '998765432',
    id: 3
  }
  ]

  constructor() { }

  listarClientes(): Cliente[] {
    // toda a lógica para acessar a api e pegar os dados
    return this.clientes;
  }

  listarClientesPeloId (id : number): Cliente | undefined {
     const clienteEncontrado = this.clientes.find ((c) => { 
      //quero saber se o parametro c é igual ao id que eu estou procurando
      //clientes e o meu array
      //find e um metodo e serve para procurar algum valor que esta dentro do meu array
     return c.id == id
    })
    return clienteEncontrado;
  }
}