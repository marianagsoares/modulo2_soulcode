package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.domain.Funcionario;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.soulcodeacademy.helpr.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PopulateService {
    @Autowired
    private CargoRepository cargoRepository; // SEMPRE IMPORTAR A INTERFACE CRIADA
    // o segundo é o atributo que guarda o objeto // o primeiro é o tipo
    @Autowired
    private FuncionarioRepository funcionarioRepository; //SEMPRE IMPORTAR A INTERFACE CRIADA

    public void populate(){
        Cargo cargo1 = new Cargo(null, "Diretor Geral", "Gerencia empresa", 2000.00);
        //Vamos persistir as entidades que é que salvar no banco
        this.cargoRepository.save(cargo1);
        Cargo cargo2 = new Cargo(null, "Executivo", "Os executivos dirigem, planejam e coordenam as atividades operacionais", 10000.00);
        //Vamos persistir as entidades que é que salvar no banco
        this.cargoRepository.save(cargo2);
        Cargo cargo3 = new Cargo(null, "Secretario", "organizar reuniões e enviar relatórios", 2000.00);
        //Vamos persistir as entidades que é que salvar no banco
        this.cargoRepository.save(cargo3);

        Funcionario func1 = new Funcionario(null, "Renato Pereira", "renato.pereira@gmail.com", "68258098144", "12345", null, cargo1);
        System.out.println(func1);
        this.funcionarioRepository.save(func1);
        Funcionario func2 = new Funcionario(null, "Victor Icoma", "victor.icoma@gmail.com", "51127383671", "12345", null, cargo2);
        System.out.println(func2);
        this.funcionarioRepository.save(func2);

    }
}
//primeiro dizemos que populateService é um serviço  @service e ele depende do Cargorepository porque é dentro dele que vai haver os métodos.
//@Autowirede pega a instancia do CargoRepository
//O método populate vai criar os objetos mas eles nao ficam salvos no banco
//o que vai garantir que seja salvo no banco é o save

