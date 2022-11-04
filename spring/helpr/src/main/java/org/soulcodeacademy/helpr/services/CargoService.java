package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {
    @Autowired
    private CargoRepository cargoRepository;

    // Listar todos
    public List<Cargo> listar() {
        // Retorna os dados da tabela em forma de lista
        // SELECT * FROM cargo;
        return this.cargoRepository.findAll();
    }

    // Listar um pelo ID
    public Cargo getCargo(Integer idCargo) {
        // SELECT * FROM cargo WHERE idCargo = ?
        // Optional = Pode haver cargo ou não
        Optional<Cargo> cargo = this.cargoRepository.findById(idCargo);

        if(cargo.isEmpty()) { // Não encontrou o cargo?
            // Não encontrou o cargo com id solicitado
            throw new RuntimeException("O cargo não foi encontrado!"); // Causa um erro com a mensagem
        } else {
            return cargo.get(); // Extrair o cargo de dentro do optional
        }
    }
    // Salvar Cargo no Banco
    public Cargo salvar(Cargo novoCargo){
        novoCargo.setIdCargo(null);
        Cargo cargoSalvo = this.cargoRepository.save(novoCargo);
        return cargoSalvo;
    }

    // Atualizar
    public Cargo atualizar (Integer idCargo, Cargo novoCargoAtualizado){

        Cargo cargoAtual = this.getCargo(idCargo);
        //vai me trazer o cargo exatamente como ele é atualmente e saber se existe ou nao

        cargoAtual.setNome(novoCargoAtualizado.getNome());
        cargoAtual.setDescricao(novoCargoAtualizado.getDescricao());
        cargoAtual.setSalario(novoCargoAtualizado.getSalario());

        //Atualiza a entidade pois ela possui um id diferente de nulo
        //o id que ele pesquisou foi encontrado e não foi nulo
        Cargo cargoAtualizado = this.cargoRepository.save(cargoAtual);
        return cargoAtualizado;
    }
    // Deletar
    public void deletar(Integer idCargo){
       Cargo cargoADeletar = this.getCargo(idCargo);
        this.cargoRepository.delete(cargoADeletar);
    }
}
