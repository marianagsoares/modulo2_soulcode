package org.soulcodeacademy.helpr.domain;

import org.soulcodeacademy.helpr.domain.enums.Perfil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Cliente extends Usuario {

    //ATRIBUTO PRIVADO DA CLASSE CLIENTE
    private String telefone;

    // CONSTRUTOR VAZIO
    public Cliente(){

    }

    //CONSTRUTOR DA CLASSE COM PARAMETROS
    public Cliente(Integer id, String nome, String email, String cpf, String senha, String telefone){
        super(id, nome, email, cpf, senha, Perfil.CLIENTE); //lEMBRE-SE O ENUM NAO SERA INSERIDO COMO PARAMETRO DO CONSTRUTOR POIS ELE JA ESTA DEFINIDO
        this.telefone = telefone;
    }

    //METODOS ESPECIAIS
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
