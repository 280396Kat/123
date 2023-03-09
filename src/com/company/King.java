package com.company;

import piece.CordinatShift;
import piece.Piece;

import java.util.Set;

public class King extends Piece {
    public King(Color color, Cordinat cordinat) {
        super(color, cordinat);
    }

    @Override
    protected Set<CordinatShift> getPieceMoves() {
        return null;
    }
}
