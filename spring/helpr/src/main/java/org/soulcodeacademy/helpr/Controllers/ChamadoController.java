package org.soulcodeacademy.helpr.Controllers;

import org.soulcodeacademy.helpr.domain.Chamado;
import org.soulcodeacademy.helpr.domain.dto.ChamadoDTO;
import org.soulcodeacademy.helpr.domain.services.ChamadoService;
import org.soulcodeacademy.helpr.domain.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

public class ChamadoController {

    @Autowired
    private ChamadoService chamadoService;

    @Autowired
    private ClienteController clienteController;
    private ClienteService clienteService;

    //Listar todos os chamados
    @GetMapping("/chamados")
    public List<Chamado> listar(){
        return this.chamadoService.listarChamados();
    }

    //Listar por id
    @GetMapping("/chamados/{idChamado}")
    public Chamado getById(@PathVariable Integer idChamado){
        return this.chamadoService.ChamadoById(idChamado);
    }


    @PostMapping("/chamados/{idCliente}")
    public  Chamado inserirChamado(@Valid @PathVariable ChamadoDTO dto){
        Chamado chamado =  this.chamadoService.salvarChamado(dto);
        return chamado;
    }
}
