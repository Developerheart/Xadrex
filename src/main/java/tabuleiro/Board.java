package tabuleiro;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tabuleiro.Exceptions.BoardException;

import javax.swing.*;

@ToString
public class Board {

    private final @Getter  int rows;
    private final @Getter  int columns;
    private  Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 ||  columns < 1){
            throw new BoardException("Error creating board: min rows = 1+ and min comlums = 1+");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int column){
        if (!positionExits(row, column)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position){
        if (!positionExits(position.getRow(), position.getColumn())) {
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){

        if (thereIsAPiece(position)) {
            throw new BoardException("there is alreadu a piece on position " + position, new IllegalArgumentException());
        }

        pieces[position.getRow()][position.getColumn()]=piece;
        piece.position = position;
    }

    private boolean positionExits(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExits(Position position){
        return positionExits(position.getRow(), position.getColumn());
    }


    public boolean thereIsAPiece(Position position){
        if (!positionExits(position)) {
            throw new BoardException("Position not exist", new IllegalArgumentException());
        }
        return piece(position) != null;
    }
}
