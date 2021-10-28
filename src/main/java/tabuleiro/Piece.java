package tabuleiro;

import lombok.*;

@Getter(value = AccessLevel.PROTECTED, onMethod = {})
@ToString
public class Piece {

    protected @ToString.Exclude
    Position position;
    private final Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
}
