package org.soulcodeacademy.helpr.domain.services;

import org.soulcodeacademy.helpr.domain.Cliente;
import org.soulcodeacademy.helpr.domain.dto.ClienteDTO;
import org.soulcodeacademy.helpr.domain.dto.FuncionarioDTO;
import org.soulcodeacademy.helpr.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository  clienteRepository;



    //LISTAR TODOS OS CLIENTES
    public List<Cliente> listarTodos(){
        return this.clienteRepository.findAll();
    }

    //LISTAR CLIENTE BY ID
    public Cliente getClienteById(Integer idCliente){
        Optional<Cliente> cliente = this.clienteRepository.findById(idCliente);
        if(cliente.isEmpty()){
            throw new RuntimeException("Usuario nao encontrado");
        }else{
            return cliente.get();
        }
    }

    //ADICIONAR CLIENTE NOVO


    //O que eu passo no RequestBody nao cai diretamente no Cliente, cai no ClienteDTO
    //Quando o RequestBody passa pelas validações do DTO ele vai cair nesse método
    public Cliente salvarNovoCliente(ClienteDTO dto){
        //Transferindo as informações do DTO para a entidade Cliente
        Cliente novoCliente = new Cliente(null, dto.getNome(), dto.getEmail(), dto.getCpf(), dto.getSenha(), dto.getTelefone());
        //Save = INSERT INTO entao ele está inserindo no banco de Dados
        Cliente novoClienteAddBanco = this.clienteRepository.save(novoCliente);
        return novoClienteAddBanco;
    }

    //ATUALIZAR CLIENTE

    public Cliente atualizarCliente(Integer idCliente, ClienteDTO dto){
        //VERIFICA SE O CLIENTE COM BASE NO ID PASSADO EXISTE
        Cliente clienteAtual = this.getClienteById(idCliente);

        //SETA PRA DENTRO DO DTO AS MUDANCAS
        clienteAtual.setNome(dto.getNome());
        clienteAtual.setEmail(dto.getEmail());
        clienteAtual.setCpf(dto.getCpf());
        clienteAtual.setSenha(dto.getSenha());
        clienteAtual.setTelefone(dto.getTelefone());

        Cliente novoClienteAtualizado = this.clienteRepository.save(clienteAtual);
        return novoClienteAtualizado;
    }

    //DELETE
    public void deletarCliente(Integer idCliente){
        Cliente clienteADeletar = this.getClienteById(idCliente);
        this.clienteRepository.delete(clienteADeletar);
    }
}
