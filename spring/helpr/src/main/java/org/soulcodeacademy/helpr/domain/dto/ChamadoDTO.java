package org.soulcodeacademy.helpr.domain.dto;

import org.soulcodeacademy.helpr.domain.Cliente;
import org.soulcodeacademy.helpr.domain.Funcionario;
import org.soulcodeacademy.helpr.domain.enums.StatusChamado;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ChamadoDTO {

    @NotBlank (message = "titulo e obrigatorio")
    private String titulo;

    @NotBlank (message = "descrição é obrigatória")
    private String descrição;

    @NotNull(message = "idCliente é obrigatorio")
    private Integer idCliente;

    private Integer idFuncionario;

    private StatusChamado status;

    //idChamado é inserido diretamente pelo banco
    //DataInicial inicia ja com a data do momento em que o chamado foi aberto
    //DataFinal nao precisa ser colocada nao e obrigatoria

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }


    public StatusChamado getStatus() {
        return status;
    }

    public void setStatus(StatusChamado status) {
        this.status = status;
    }
}
