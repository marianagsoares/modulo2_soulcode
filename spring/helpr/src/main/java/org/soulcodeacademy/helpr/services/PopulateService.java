package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PopulateService {
    @Autowired
    private CargoRepository cargoRepository;
    // o segundo é o atributo que guarda o objeto // o primeiro é o tipo

    public void populate(){
        Cargo cargo1 = new Cargo(null, "Diretor Geral", "Gerencia empresa", 2000.00);
        //Vamos persistir as entidades que é que salvar no banco
        this.cargoRepository.save(cargo1);
    }
}
//primeiro dizemos que populateService é um serviço  @service e ele depende do Cargorepository porque é dentro dele que vai haver os métodos.
//@Autowirede pega a instancia do CargoRepository
//O método populate vai criar os objetos mas eles nao ficam salvos no banco
//o que vai garantir que seja salvo no banco é o save
//
