package com.company;

import piece.CordinatShift;
import piece.Piece;

import java.util.Set;

public class Bishop extends Piece {
    public Bishop(Color color, Cordinat cordinat) {
        super(color, cordinat);
    }

    @Override
    protected Set<CordinatShift> getPieceMoves() {
        return null;
    }
}
