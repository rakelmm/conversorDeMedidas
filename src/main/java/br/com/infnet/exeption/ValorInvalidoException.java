package br.com.infnet.exeption;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String message) {
        super(message);
    }
}
