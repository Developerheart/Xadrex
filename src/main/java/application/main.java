package application;

import tabuleiro.Board;
import tabuleiro.Position;

public class main {

    public static void main(String[] args) {

        Position position = new Position(1, 3);
        System.out.println(position);

        Board board = new Board(9, 9);
        System.out.println(board);
    }

}
