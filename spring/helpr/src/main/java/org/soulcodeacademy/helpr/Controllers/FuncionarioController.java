package org.soulcodeacademy.helpr.Controllers;

import org.soulcodeacademy.helpr.domain.Funcionario;
import org.soulcodeacademy.helpr.domain.dto.FuncionarioDTO;
import org.soulcodeacademy.helpr.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService; //Controller depende do FuncionarioService
//LISTAR TODOS
    @GetMapping("/funcionarios")
    public List<Funcionario> listar(){
        return this.funcionarioService.listar();
    }
//LISTAR PELO ID
    @GetMapping("/funcionarios/{idFuncionario}") //{} só vai em GetById
    public Funcionario getFuncionario(@PathVariable Integer idFuncionario){
        return this.funcionarioService.getFuncionario(idFuncionario);
    }
//ADICIONAR FUNCIONARIO
    @PostMapping ("/funcionarios")
    public Funcionario salvar(@Valid @RequestBody FuncionarioDTO dto){
        Funcionario funcionario = this.funcionarioService.salvar(dto);
        return funcionario;
    }
    //ATUALIZAR FUNCIONARIO
    @PutMapping("/funcionarios/{idFuncionario}") // {} Só vai pra atualizar func existente
    public Funcionario atualizar(@PathVariable Integer idFuncionario, @Valid @RequestBody FuncionarioDTO dto){

        Funcionario novoFuncionarioAtualizado= this.funcionarioService.atualizar(idFuncionario, dto);
        return novoFuncionarioAtualizado;
    }

    @DeleteMapping ("/funcionarios/{idFuncionario}")
    public void deletar(@PathVariable Integer idFuncionario){
        this.funcionarioService.deletar(idFuncionario);
    }
}
