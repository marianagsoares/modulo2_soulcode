package org.soulcodeacademy.helpr.domain;

import org.soulcodeacademy.helpr.domain.enums.Perfil;

import javax.persistence.*;

@Entity
public class Funcionario extends Usuario{
    private String foto;

    @ManyToOne // relacao 1:N entre Cargo e Funcionario
    @JoinColumn (name = "idCargo") //anotação que define a chave estrangeira idCargo da entidade Cargo
    private Cargo cargo;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, String email, String cpf, String senha, String foto, Cargo cargo) { //Perfil perfil nao vai dentro do construtor
        super(id, nome, email, cpf, senha, Perfil.FUNCIONARIO);
        this.foto = foto;
        this.cargo = cargo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}