import ChessLayer.ChessMatch;
import UI.Ui;
import tabuleiro.Board;
import tabuleiro.Position;

public class Application {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        Ui.printBoard(chessMatch.getPieces());

    }

}
