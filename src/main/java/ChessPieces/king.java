package ChessPieces;

import ChessLayer.ChessPiece;
import ChessLayer.Color;
import tabuleiro.Board;

public class king extends ChessPiece {

    public king(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return Color.BLACK.getKING();
    }


}
