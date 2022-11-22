package org.soulcodeacademy.helpr.repositories;

import org.soulcodeacademy.helpr.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email); // WHERE email = email
    Optional<Usuario> findByCpf(String cpf); // WHERE cpf = cpf
    List<Usuario> findByNome(String nome); // WHERE nome = nome
    List<Usuario> findByNomeContaining(String busca); // Filtrar pelo nome
    //METODOS DO JpaRepository
    // - findAll() => SELECT * FROM usuarios;
    // - findById(Integer) => SELECT * FROM usuarios WHERE id = ?;
    // - save(Usuario) => INSERT INTO(caso id nulo) ou UPDATE (caso id não nulo)
    // - delete(Usuario) => DELETE FROM usuarios WHERE id = ?;
    //save e delete recebem a entidade como parametro
    //findById recebe o tipo da chave primária como parâmetro

    // Entidade -> Repository -> DTO -> Service + Controller
}
