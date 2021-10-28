package ChessLayer;

import ChessPieces.Rook;
import ChessPieces.king;
import tabuleiro.Board;
import tabuleiro.Position;

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

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.BLACK), new Position(0,0));
        board.placePiece(new Rook(board, Color.WHITE), new Position(0,1));
        board.placePiece(new king(board, Color.WHITE), new Position(0,2));


    }

}
