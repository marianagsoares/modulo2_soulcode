package org.soulcodeacademy.helpr.repositories;

import org.soulcodeacademy.helpr.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

    //METODOS DO JpaRepository
    // - findAll() => SELECT * FROM usuarios;
    // - findById(Integer) => SELECT * FROM usuarios WHERE id = ?;
    // - save(Usuario) => INSERT INTO(caso id nulo) ou UPDATE (caso id não nulo)
    // - delete(Usuario) => DELETE FROM usuarios WHERE id = ?;
    //save e delete recebem a entidade como parametro
    //findById recebe o tipo da chave primária como parâmetro
}
