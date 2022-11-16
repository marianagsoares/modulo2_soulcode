package org.soulcodeacademy.helpr.Controllers;

import org.soulcodeacademy.helpr.domain.Cliente;
import org.soulcodeacademy.helpr.domain.dto.ClienteDTO;
import org.soulcodeacademy.helpr.domain.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    public ClienteService clienteService;

    //LISTAR TODOS OS CLIENTES
     @GetMapping("/clientes")
    public List<Cliente> listar() {
         return this.clienteService.listarTodos();
     }

     //Listar CLIENTE BY ID
    @GetMapping("/clientes/{idCliente}")
    public  Cliente getCliente( @PathVariable Integer idCliente){
         return this.clienteService.getClienteById(idCliente);
    }

    //INSERIR NOVO CARGO
    @PostMapping("/clientes")
    //
    public Cliente salvar(@Valid @RequestBody ClienteDTO dto){
         Cliente cliente = this.clienteService.salvarNovoCliente(dto);
         return cliente;
    }

    //ATUALIZAR CARGO EXISTENTE
    @PutMapping("/clientes/{idCliente}")
    public  Cliente atualizar(@PathVariable Integer idCliente, @Valid @RequestBody ClienteDTO dto){ //CAPTURA OS VALORES
         Cliente novoClienteAtualizado = this.clienteService.atualizarCliente(idCliente, dto); //PASSA PARA O SERVICE
         return novoClienteAtualizado; //DADOS SAO RETORNADOS
    }

    //DELETE
   @DeleteMapping("/clientes/{idCliente}")
    public void deletar(@PathVariable Integer idCliente){
         this.clienteService.deletarCliente(idCliente);
   }
}
