package org.soulcodeacademy.helpr.services;


import org.soulcodeacademy.helpr.domain.Funcionario;
import org.soulcodeacademy.helpr.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service //instanciar automaticamente a classe
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository; // essa classe depende de FuncionarioRepository

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
}
