package org.soulcodeacademy.helpr.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TokenUtil {

    //Pegou as informacoes que estao nos arquivos properties e injetou na classe porque vai precisar utiliza-las aqui
    //usou Long porque é um numero mt grande e o integer nao conseguiria representar
    @Value("${senhaJwt}")
    private String senhaJwt;

    @Value("${validadeJwt}")
    private  Long validadeJwt;

    //Para gerar o token e necessario o perfil do usuario (enum: admin, cliente, funcionario) e o email

    public String gerarToken (String email, String perfil){
        return JWT.create()
                .withSubject(email) //de quem pertence o token
                .withClaim("perfil", perfil) //propriedade customizada e passou o mesmo valor perfil
                .withExpiresAt(new Date(System.currentTimeMillis() + this.validadeJwt)) //tempo que vai expirar o token  (tempo atual + vida util do token em milisegundo que ta la no properties)
                .sign(Algorithm.HMAC512(this.senhaJwt)); //gerar o token
    }

    public String extrairEmail (String token){

          return  JWT.require(Algorithm.HMAC512(this.senhaJwt)) //qual o algoritmo usado e a senha que foi definida lá no aplication.properties. A gente precisou trazer para dentro da classe TokenUtil para usar ela aqui
                    .build()//construir a verificacao
                    .verify(token) //verifica se o token gerado  fui eu quem gerei mesmo atraves da senha
                    .getSubject(); //quem e o dono do token ve atraves do email
    }

    //caso ocorra erro na validação do token, ou seja, caso ele seja invalido (porque nao foi gerado ou expirou)
    //catch vai retornar falso caso tenha ocorrido um erro
    public boolean validarToken(String token){
        try{
           JWT.require(Algorithm.HMAC512(this.senhaJwt)) //
                   .build()
                   .verify(token);
           return  true;
        }
        catch (JWTVerificationException ex){
            return  false;
        }
    }

}
//public static void main(String[] args){
// String senha = "senhatop";
// String token = JWT.create()
// .withSubject("top@gmail.com") //de quem pertence o token
// .withClaim("nome", "batata") //transmitir mais informacoes, alem do dono do token, coloca outras info por ex. id
// .sign(Algorithm.HMAC512(senha)); //HMAC512 pega as informacoes, codifica usando os algorithmos
// String email = JWT.require(Algorithm.HMAC512(senha)).build().verify(token).getSubject();
//  }