package com.company;

import piece.Piece;

import java.util.HashMap;

public class Desk {
    HashMap<Cordinat, Piece> pieceHashMap = new HashMap<>();

    public void setPiece(Cordinat cordinat, Piece piece) {
        piece.cordinat = cordinat;
        pieceHashMap.put(cordinat, piece);
    }

    public void defoldPiecePosishen() {
        for (File tmp : File.values()) {
            setPiece(new Cordinat(tmp, 2),
                    new Pawn(Color.WHITE, new Cordinat(tmp, 2)));
            setPiece(new Cordinat(tmp, 7),
                    new Pawn(Color.BLEAK, new Cordinat(tmp, 7)));
        }
    }

    public static boolean isSqerDarck(Cordinat cordinat) {
        return (((cordinat.file.ordinal() + 1) + cordinat.rang) % 2) == 0;

    }

    public boolean isSqerEmpty(Cordinat cordinat) {
        return !pieceHashMap.containsKey(cordinat);
    }

    public Piece getPiece(Cordinat cordinat) {
        return pieceHashMap.get(cordinat);
    }
}
