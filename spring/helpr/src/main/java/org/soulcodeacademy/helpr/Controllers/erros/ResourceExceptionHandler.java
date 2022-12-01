package org.soulcodeacademy.helpr.Controllers.erros;

import org.soulcodeacademy.helpr.domain.services.errors.RecursoNaoEncontradoError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(RecursoNaoEncontradoError.class)
    public ResponseEntity<CustomErrorResponse> recursoNaoEncontradoError(RecursoNaoEncontradoError erro, HttpServletRequest request){
        CustomErrorResponse response = new CustomErrorResponse();
        response.setTimestamp(LocalDateTime.now()); //define a data e a hora em que o erro ocorreu
        response.setStatus(HttpStatus.NOT_FOUND.value()); //define como 404 o codigo de status
        response.setMessage(erro.getMessage()); //define a mensagem de erro vinda do service
        response.setPath(request.getRequestURI()); //pega o endpoint da requisicao

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
