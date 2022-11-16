package org.soulcodeacademy.helpr.domain.services;

import ch.qos.logback.core.net.server.Client;
import org.soulcodeacademy.helpr.domain.Chamado;
import org.soulcodeacademy.helpr.domain.Cliente;
import org.soulcodeacademy.helpr.domain.dto.ChamadoDTO;
import org.soulcodeacademy.helpr.repositories.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ChamadoService {
    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired ClienteService clienteService;
    //POIS PARA SALVAR O CHAMADO EU TBM PRECISO SALVAR O CLIENTE

    //LISTAR TODOS OS CHAMADOS // GET
    public List<Chamado> listarChamados(){
        return this.chamadoRepository.findAll();
    }

    //Listar por ID //GET
    public Chamado ChamadoById(Integer idChamado){
        Optional<Chamado> chamado = this.chamadoRepository.findById(idChamado);
        if(chamado.isEmpty()){
            throw new RuntimeException("Chamado nao encontrado");
        }else{
            return chamado.get();
        }
    }
    //INSERIR NOVO CHAMADO //POST
    public Chamado salvarChamado(ChamadoDTO dto){
        //VENDO SE O CLIENTE EXISTE
        Chamado chamadoNovo = new Chamado(null, dto.getTitulo(), dto.getDescrição());
        chamadoNovo.setCliente(this.clienteService.getClienteById(dto.getIdCliente())); //CONECTA O NOVO CHAMADO AO CLIENTE ASSOCIADO
        return this.chamadoRepository.save(chamadoNovo);

       //Dentro da entidade Chamado existe uma propriedade chamada Cliente e tbm existe os metodos especiais get e set dessa propriedade
        // getClienteById é o nome do método criado dentro do ServiceCliente para buscar o cliente com base no ID
        //idCliente é uma propriedade do tipo Integer que está dentro do DTO e que possui seus métodos expeciais get e set
        //por isso dentro do ChamadoDTO chamo o método getIdCliente

    }
}
