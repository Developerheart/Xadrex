package tabuleiro.Exceptions;

public class BoardException extends RuntimeException{
    private static final long serialVersionUID =1L;

    public BoardException(String msg){
        super(msg);
    }

    public BoardException(String message, Throwable cause) {
        super(message, cause);
    }
}
