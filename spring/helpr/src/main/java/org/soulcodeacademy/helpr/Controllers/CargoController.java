package org.soulcodeacademy.helpr.Controllers;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.domain.dto.CargoDTO;
import org.soulcodeacademy.helpr.domain.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
//retorno de dados
public class CargoController {
    @GetMapping("/oi")
    public String dizOla() {
        return "Olá, mundo";
    }
    @GetMapping("/valor")
    public Integer valor(){
        return 1000; //resposta da requisição
    }

    @Autowired
    private CargoService cargoService;


    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_FUNCIONARIO')")
    @GetMapping("/cargos")
    public List<Cargo> listar(){
        return this.cargoService.listar() ; //resposta da requisição
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_FUNCIONARIO')")
    @GetMapping("/cargos/{idCargo}") //{} indica que esse é um parâmetro dinâmico
    public Cargo getCargo(@PathVariable Integer idCargo){
        return this.cargoService.getCargo(idCargo); //idCargo deve ser igual ao que ta dentro de {idCargo}
    }


    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/cargos")
    public Cargo salvar( @Valid @RequestBody CargoDTO cargo){
        Cargo cargoSalvo = this.cargoService.salvar(cargo);
        return cargoSalvo;
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/cargos/{idCargo}")
    public Cargo atualizar(@PathVariable Integer idCargo, @Valid @RequestBody CargoDTO cargo){
        //os dados do que eu quero atualizar X os dados que eu quero substituir
        //System.out.println(idCargo);
        //System.out.println(cargo.getSalario());
        System.out.println(idCargo);
        System.out.println(cargo.getNome());
        Cargo cargoAtualizado = this.cargoService.atualizar(idCargo, cargo);
        return cargoAtualizado;
    }


    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/cargos/{idCargo}")
    public void deletar(@PathVariable Integer idCargo){
        this.cargoService.deletar(idCargo);
        //Perceba que aqui nao tem uma variavel como o que há em cargoAtualizado
        //Porque aqui eu nao precisa retornar nada
    }
}
//server.port=8081 inserir no application.properties para abrir em outra porta
//no CargoController todos os métodos sao publicos