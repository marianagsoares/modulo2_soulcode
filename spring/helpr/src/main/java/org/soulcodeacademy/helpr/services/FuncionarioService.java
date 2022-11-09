package org.soulcodeacademy.helpr.services;


import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.domain.Funcionario;
import org.soulcodeacademy.helpr.domain.dto.FuncionarioDTO;
import org.soulcodeacademy.helpr.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service //instanciar automaticamente a classe
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository; // essa classe depende de FuncionarioRepository
    @Autowired
    private CargoService cargoService;

    //Listar todos os funcionarios
    public List<Funcionario> listar(){

        return this.funcionarioRepository.findAll();
    }

    //Listar funcionarios pelo id
    public Funcionario getFuncionario(Integer idFuncionario){
        Optional<Funcionario> funcionario= this.funcionarioRepository.findById(idFuncionario);

        if(funcionario.isEmpty()) {

            throw new RuntimeException("O funcionário não foi encontrado!"); // Causa um erro com a mensagem
        } else {
            return  funcionario.get();
        }

    }
    public Funcionario salvar(FuncionarioDTO dto) {
        Cargo cargo = this.cargoService.getCargo(dto.getIdCargo()); // verifica se o cargo existe mesmo.
        //transferindo informações do DTO para nossa entidade
        Funcionario funcionario = new Funcionario(null, dto.getNome(), dto.getEmail(), dto.getCpf(), dto.getSenha(), dto.getFoto(), cargo);
        Funcionario salvo = this.funcionarioRepository.save(funcionario);
        return salvo;
    }

    public Funcionario atualizar(Integer idFuncionario, FuncionarioDTO dto){
        //METODO ATUALIZAR
        //PARAMETROS idFuncionario e dto

        Funcionario funcionarioAtual = this.getFuncionario(idFuncionario); //verifica se funcionario existe

        //Busca os dados do cargo a ser alterado
        Cargo cargo = this.cargoService.getCargo(dto.getIdCargo());

        //Atualiza os dados desse cargo
        funcionarioAtual.setNome(dto.getNome());
        funcionarioAtual.setEmail(dto.getEmail());
        funcionarioAtual.setCpf(dto.getCpf());
        funcionarioAtual.setSenha(dto.getSenha());
        funcionarioAtual.setFoto(dto.getFoto());
        funcionarioAtual.setCargo(cargo);

        //Salvar na entidade os dados atualizados
        Funcionario novoFuncionarioAtualizado = this.funcionarioRepository.save(funcionarioAtual); //salve dentro de funcioario atual essas informacoes
        return novoFuncionarioAtualizado;

        //AGORA EU VOU NO CONTROLLER E COLOCO ESSA VARIAVEL CHAMANDO A CLASSE FUNCIONARIOSERVICE E PASSANDO OS PARAMETROS DOS METODOS
    }
    public void deletar(Integer idFuncionario){
        Funcionario funcionarioADeletar = this.getFuncionario(idFuncionario); //ver se o cargo existe
        this.funcionarioRepository.delete(funcionarioADeletar);
    }
}