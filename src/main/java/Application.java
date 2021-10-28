import ChessLayer.ChessMatch;
import UI.Ui;


public class Application {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Ui.printBoard(chessMatch.getPieces());

    }

}
