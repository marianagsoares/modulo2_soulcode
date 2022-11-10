package org.soulcodeacademy.helpr.domain;

import org.soulcodeacademy.helpr.domain.enums.Perfil;

import javax.persistence.*;

@Entity
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   protected Integer id; //ATRIBUTO

   @Column(nullable = false, length = 50)
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

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getCpf() {
      return cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

   public Perfil getPerfil() {
      return perfil;
   }

   public void setPerfil(Perfil perfil) {
      this.perfil = perfil;
   }
}

