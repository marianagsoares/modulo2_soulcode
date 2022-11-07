package org.soulcodeacademy.helpr.domain;

import org.soulcodeacademy.helpr.domain.enums.Perfil;

import javax.persistence.*;

@Entity
@Table (name = "usuarios")
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   protected Integer id; //ATRIBUTO

   @Column(nullable = false, unique = true, length = 50)
   protected String nome; //ATRIBUTO

   @Column(nullable = false, unique = true, length = 50)
   protected String email; //ATRIBUTO

   @Column(nullable = false, unique = true, length = 11)
   protected String cpf; //ATRIBUTO

   @Column(nullable = false, length = 20)
   protected String senha; //ATRIBUTO

   @Enumerated(EnumType.STRING)
   @Column(nullable = false)
   protected Perfil perfil; //Perfil é o enum //ATRIBUTO

   public Usuario(){}

   public Usuario(Integer id, String nome, String email, String cpf, String senha, Perfil perfilEnum){
      this.id = id;
      this.nome = nome;
      this.email = email;
      this.cpf = cpf;
      this.senha = senha;
      this.perfil = perfilEnum;
   }
}

