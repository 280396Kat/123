package com.company;

import piece.Piece;

public class PieceFactory {

    public Piece fromFenChar(char fenChar, Cordinat cordinat) {
        switch (fenChar) {
            case 'p':
                return new Pawn(Color.BLEAK, cordinat);
            case 'P' :
                return new Pawn(Color.WHITE, cordinat);
            case 'b':
                return new Bishop(Color.BLEAK, cordinat);
            case 'B' :
                return new Bishop(Color.WHITE, cordinat);
            case 'h':
                return new Horse(Color.BLEAK, cordinat);
            case 'H' :
                return new Horse(Color.WHITE, cordinat);
            case 'k':
                return new King(Color.BLEAK, cordinat);
            case 'K' :
                return new King(Color.WHITE, cordinat);
            case 'q':
                return new Queen(Color.BLEAK, cordinat);
            case 'Q' :
                return new Queen(Color.WHITE, cordinat);
            case 'r':
                return new Rook(Color.BLEAK, cordinat);
            case 'R' :
                return new Rook(Color.WHITE, cordinat);
            default: throw new RuntimeException("Неправильный формат символа.");

        }

    }
}
