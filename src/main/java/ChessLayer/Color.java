package ChessLayer;

public enum Color {
    BLACK(TypePiece.BISP, TypePiece.HORSE, TypePiece.KING, TypePiece.QUEEN, TypePiece.ROOK,TypePiece.PEAO),
    WHITE(TypePiece.BISP, TypePiece.HORSE, TypePiece.KING, TypePiece.QUEEN, TypePiece.ROOK,TypePiece.PEAO);



    private TypePiece BISP;
    private TypePiece HORSE;
    private TypePiece KING;
    private TypePiece QUEEN;
    private TypePiece ROOK;
    private TypePiece PEAO;

    public String getBISP() {
        return BISP.getIcon();
    }

    public String getHORSE() {
        return HORSE.getIcon();
    }

    public String getKING() {
        return KING.getIcon();
    }

    public String getQUEEN() {
        return QUEEN.getIcon();
    }

    public String getROOK() {
        return ROOK.getIcon();
    }

    public String getPEAO() {
        return PEAO.getIcon();
    }

    Color(TypePiece bisp, TypePiece horse, TypePiece king, TypePiece queen, TypePiece rook, TypePiece peao) {
        this.BISP=bisp;
        this.HORSE=horse;
        this.KING=king;
        this.PEAO=peao;
        this.QUEEN=queen;
        this.ROOK=rook;
    }
}
