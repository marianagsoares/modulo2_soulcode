package org.soulcodeacademy.helpr.domain.dto;

public class FuncionarioDTO extends UsuarioDTO{

    private Integer idCargo;

    private String foto;

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
