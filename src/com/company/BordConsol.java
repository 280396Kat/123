package com.company;

import piece.Piece;

public class BordConsol {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE_PIECE_COLOR = "\u001B[97m";
    public static final String ANSI_BLACK_PIECE_COLOR = "\u001B[30m";
    public static final String ANSI_WHITE_SQUARE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_BLACK_SQUARE_BACKGROUND = "\u001B[0;100m";
    public static final String ANSI_HIGHLIGHTED_SQUARE_BACKGROUND = "\u001B[45m";

    private String getSpriteForEmptySqer(Cordinat cordinat) {

        return coolorDesk("   ", Color.WHITE, Desk.isSqerDarck(cordinat));
    }

    private String getPieceSprite(Piece piece) {
        return coolorDesk(selectPiece(piece), piece.color, Desk.isSqerDarck(piece.cordinat));
    }

    private String selectPiece(Piece piece) {
        switch (piece.getClass().getSimpleName()) {
            case "Pawn":
                return " ♙ ";
            case "Hourse":
                return " ♘ ";
            case "King":
                return " ♔ ";
            case "Queen":
                return " ♛ ";
            case "Bishop" :
                return " ♗ ";
            case "Rook" :
                return " ♖ ";

        }
        return "";
    }


    public void rendor(Desk desk) {

        for (int i = 8; i >= 1; i--) {
            String line = "";
            for (File j : File.values()) {
                Cordinat cordinat = new Cordinat(j, i);
                if (desk.isSqerEmpty(cordinat)) {
                    line += getSpriteForEmptySqer(cordinat);
                } else {
                    line += getPieceSprite(desk.getPiece(cordinat));
                }
            }
            line += ANSI_RESET;
            System.out.println(line);
        }
    }

    private String coolorDesk(String sprite, Color pieceCollor, boolean isSqerDarck) {
        String result = sprite;
        if (pieceCollor == Color.WHITE) {
            result = ANSI_WHITE_PIECE_COLOR + result;
        } else {
            result = ANSI_BLACK_PIECE_COLOR + result;
        }
        if (isSqerDarck) {
            result = ANSI_BLACK_SQUARE_BACKGROUND + result;
        } else {
            result = ANSI_WHITE_SQUARE_BACKGROUND + result;
        }

        return result;
    }
}
