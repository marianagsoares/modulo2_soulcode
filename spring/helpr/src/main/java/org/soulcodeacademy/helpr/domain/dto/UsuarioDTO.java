package org.soulcodeacademy.helpr.domain.dto;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UsuarioDTO {
    @NotBlank (message = "Nome é obrigatório")
    protected String nome;

    @Email
    @NotBlank (message = "email é obrigatório" )
    protected String email;
    @CPF
    @NotBlank (message = "cpf é obrigatório")
    protected String cpf;

    @NotBlank(message = "senha é obrigatório")
    protected String senha;

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
}
