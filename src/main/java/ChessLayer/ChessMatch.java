package ChessLayer;

import ChessPieces.Rook;
import ChessPieces.king;
import lombok.ToString;
import tabuleiro.Board;
import tabuleiro.Position;

import java.awt.image.Kernel;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board=new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getColumns()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++){
            for (int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }

        }
        return mat;
    }
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }



    private void initialSetup(){
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('a', 1, new Rook(board, Color.WHITE));
        placeNewPiece('e', 4, new king(board, Color.BLACK));
    }

}
