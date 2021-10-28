package ChessPieces;

import ChessLayer.ChessPiece;
import ChessLayer.Color;
import tabuleiro.Board;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return Color.BLACK.getROOK();
    }
}
