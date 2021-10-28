package ChessLayer;

public enum Color {
    BLACK(TypePiece.BISP),
    WHITE(TypePiece.HORSE);


    private TypePiece typePiece;

    Color(TypePiece typePiece) {
        this.typePiece = typePiece;
    }

}
