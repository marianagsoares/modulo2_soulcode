package org.soulcodeacademy.helpr.domain.services.errors;

public class ParametrosInsuficientesError extends RuntimeException {
    public ParametrosInsuficientesError(String message){
        super(message);
        //QUANDO FALTAM DADOS A SER PASSADOS, POR EXEMPLO, QUANDO DEIXAMOS O DE PASSAR O ID NA HORA DE ATUALIZAR FUNCIONARIO
    }
}
