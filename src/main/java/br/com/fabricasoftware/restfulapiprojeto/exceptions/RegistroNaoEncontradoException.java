package br.com.fabricasoftware.restfulapiprojeto.exceptions;

public class RegistroNaoEncontradoException extends RuntimeException{

    public RegistroNaoEncontradoException() {
        super("erro.naoEncontrado");
    }

    public RegistroNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}