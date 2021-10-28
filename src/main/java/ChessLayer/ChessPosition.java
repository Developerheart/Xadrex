package ChessLayer;

import lombok.Getter;
import lombok.Setter;
import tabuleiro.Position;

import javax.swing.*;

public class ChessPosition {

    private final @Getter char column;
    private final @Getter int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8 ){
            throw new ChessException("Error instantiating chess position. Valid values are from a1 to h8", new IllegalArgumentException());
        }
        this.column = column;
        this.row = row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());

    }

    @Override
    public String toString(){
        return String.valueOf(column + row);
    }
}
