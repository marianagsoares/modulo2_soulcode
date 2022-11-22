package org.soulcodeacademy.helpr.domain.services;

import ch.qos.logback.core.net.server.Client;
import org.soulcodeacademy.helpr.domain.Chamado;
import org.soulcodeacademy.helpr.domain.Cliente;
import org.soulcodeacademy.helpr.domain.Funcionario;
import org.soulcodeacademy.helpr.domain.dto.ChamadoDTO;
import org.soulcodeacademy.helpr.domain.enums.StatusChamado;
import org.soulcodeacademy.helpr.repositories.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ChamadoService {
    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired ClienteService clienteService;
    //POIS PARA SALVAR O CHAMADO EU TBM PRECISO SALVAR O CLIENTE

    @Autowired FuncionarioService funcionarioService;

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

    public Chamado atualizar(Integer idChamado, ChamadoDTO dto) {
        Chamado chamadoAtual = this.ChamadoById(idChamado);
        Cliente cliente = this.clienteService.getClienteById(dto.getIdCliente());
        chamadoAtual.setTitulo(dto.getTitulo());
        chamadoAtual.setDescricao(dto.getDescrição());
        chamadoAtual.setCliente(cliente);

        if (dto.getIdFuncionario() == null) {
            throw new RuntimeException("idFuncionario obrigatório");
        } else {
            Funcionario funcionario = this.funcionarioService.getFuncionario(dto.getIdFuncionario());

            switch (dto.getStatus()) { // Escolha o valor de getStatus()
                case RECEBIDO -> {
                    chamadoAtual.setStatus(StatusChamado.RECEBIDO);
                    chamadoAtual.setFuncionario(null);
                    chamadoAtual.setDataFinal(null);
                }
                case ATRIBUIDO -> {
                    chamadoAtual.setStatus(StatusChamado.ATRIBUIDO);
                    chamadoAtual.setFuncionario(funcionario);
                    chamadoAtual.setDataFinal(null);
                }
                case CONCLUIDO -> {
                    chamadoAtual.setStatus(StatusChamado.CONCLUIDO);
                    chamadoAtual.setFuncionario(funcionario);
                    chamadoAtual.setDataFinal(LocalDate.now());
                }
            }
        }

        return this.chamadoRepository.save(chamadoAtual);
    }

    public List<Chamado> listarPorStatus(StatusChamado status) {
        return this.chamadoRepository.findByStatus(status);
    }

    public List<Chamado> listarPorFuncionario(Integer idFuncionario) {
        Funcionario funcionario = this.funcionarioService.getFuncionario(idFuncionario);
        return this.chamadoRepository.findByFuncionario(funcionario);
    }

    public List<Chamado> listarPorCliente(Integer idCliente) {
        Cliente cliente = this.clienteService.getClienteById(idCliente);
        return this.chamadoRepository.findByCliente(cliente);
    }

    public List<Chamado> listarPorIntervaloDatas(LocalDate data1, LocalDate data2) {
        return this.chamadoRepository.buscarEntreDatas(data1, data2);
    }
}
