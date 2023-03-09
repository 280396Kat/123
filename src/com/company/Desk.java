package com.company;

import piece.Piece;

import java.util.HashMap;

public class Desk {
    private HashMap<Cordinat, Piece> pieceHashMap = new HashMap<>();

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

            setPiece(new Cordinat(File.A, 1),
                    new Rook(Color.WHITE, new Cordinat(File.A, 1)));
            setPiece(new Cordinat(File.H, 1),
                    new Rook(Color.WHITE, new Cordinat(File.H, 1)));

            setPiece(new Cordinat(File.A, 8),
                    new Rook(Color.BLEAK, new Cordinat(File.A, 8)));
            setPiece(new Cordinat(File.H, 8),
                    new Rook(Color.BLEAK, new Cordinat(File.H, 8)));

            setPiece(new Cordinat(File.B, 1),
                    new Horse(Color.WHITE, new Cordinat(File.B, 1)));
            setPiece(new Cordinat(File.G, 1),
                    new Horse(Color.WHITE, new Cordinat(File.G, 1)));

            setPiece(new Cordinat(File.B, 8),
                    new Horse(Color.BLEAK, new Cordinat(File.B, 8)));
            setPiece(new Cordinat(File.G, 8),
                    new Horse(Color.BLEAK, new Cordinat(File.G, 8)));

            setPiece(new Cordinat(File.C, 1),
                    new Bishop(Color.WHITE, new Cordinat(File.C, 1)));
            setPiece(new Cordinat(File.F, 1),
                    new Bishop(Color.WHITE, new Cordinat(File.F, 1)));

            setPiece(new Cordinat(File.C, 8),
                    new Bishop(Color.BLEAK, new Cordinat(File.C, 8)));
            setPiece(new Cordinat(File.F, 8),
                    new Bishop(Color.BLEAK, new Cordinat(File.F, 8)));

            setPiece(new Cordinat(File.D, 1),
                    new Queen(Color.WHITE, new Cordinat(File.D, 1)));
            setPiece(new Cordinat(File.D, 8),
                    new Queen(Color.BLEAK, new Cordinat(File.D, 8)));

            setPiece(new Cordinat(File.E, 1),
                    new King(Color.WHITE, new Cordinat(File.E, 1)));
            setPiece(new Cordinat(File.E, 8),
                    new King(Color.BLEAK, new Cordinat(File.E, 8)));
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

    public void removePiece(Cordinat cordinat) {
        pieceHashMap.remove(cordinat);
    }

    public void moovePice(Cordinat from, Cordinat too) { // сдвигаем фигуру на основании координаты в данный момент, далее на основании последующих
        Piece piece = getPiece(from); // получение фигуры по коодинате
        removePiece(from); // удалили предыдущюю координату
        setPiece(too, piece); // меняем координату
    }
}
