package tabuleiro;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Board {

    private @Getter @Setter int rows;
    private @Getter @Setter int columns;
    private  Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int column){
        return pieces[row][column];
    }

    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }
}
