package org.soulcodeacademy.helpr.Controllers;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/cargos")
    public List<Cargo> listar(){
        return this.cargoService.listar() ; //resposta da requisição
    }

    //@GetMapping("/cargos/1")
   // public Cargo getCargo(){
       // return this.cargoService.getCargo(1);
   // }

    @GetMapping("/cargos/{idCargo}") //{} indica que esse é um parâmetro dinâmico
    public Cargo getCargo(@PathVariable Integer idCargo){
        return this.cargoService.getCargo(idCargo); //idCargo deve ser igual ao que ta dentro de {idCargo}
    }

   // @PostMapping("/cargos")
   // public String salvarCargo(@RequestBody Cargo cargo){
      //  return "Teste Post";
   // }

    @PostMapping("/cargos")
    public Cargo salvar(@RequestBody Cargo cargo){
        Cargo cargoSalvo = this.cargoService.salvar(cargo);
        return cargoSalvo;
    }
}
//server.port=8081 inserir no application.properties para abrir em outra porta
//no CargoController todos os métodos sao publicos