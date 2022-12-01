package org.soulcodeacademy.helpr.domain.services.errors;

public class RecursoNaoEncontradoError  extends  RuntimeException{
    public RecursoNaoEncontradoError(String message){
        super(message);
        //QUANDO O ID DO FUNCIONARIO NAO E ENCONTRADO LANÇAMOS ESSE ERRO
    }
}
