package ChessLayer;

import lombok.Getter;
import lombok.Setter;
import tabuleiro.Board;
import tabuleiro.Piece;

public class ChessPiece extends Piece {

    private final @Getter Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

}
