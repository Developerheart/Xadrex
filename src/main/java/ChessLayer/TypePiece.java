package ChessLayer;

import lombok.Getter;

public enum TypePiece {
    ROOK("♜"),
    QUEEN("♛"),
    KING("♚"),
    BISP("♝"),
    HORSE("♞"),
    PEAO("♟︎");

    private @Getter
    final String icon;

    TypePiece(String icon) {
        this.icon = icon;
    }


}
