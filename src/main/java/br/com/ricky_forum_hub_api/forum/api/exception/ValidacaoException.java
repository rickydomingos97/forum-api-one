package br.com.ricky_forum_hub_api.forum.api.exception;

public class ValidacaoException extends RuntimeException{

    public ValidacaoException(String mensagem){
        super(mensagem);
    }
}