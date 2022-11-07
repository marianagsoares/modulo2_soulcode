package org.soulcodeacademy.helpr.domain.dto;

//BASTA REPLICAR AS PROPRIEDADES RELEVANTES
//E OS GETTERS E SETTERS
//NAO PRECISA O IDCARGO - INSERIDO PELO PROPRIO ENDPOINT

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CargoDTO {

    //private Integer idCargo;
    @NotBlank (message = "Campo nome é obrigatório")
    private String nome;
    private String descricao;
    @NotNull (message = "Campo nome é obrigatório")
    @Min(value = 500, message="Valor inválido")
    @Max(value = 100000, message="Valor inválido")
    private Double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
