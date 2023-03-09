package com.company;

import piece.CordinatShift;
import piece.Piece;

import java.util.Set;

public class  Horse extends Piece {


    public Horse(Color color, Cordinat cordinat) {
        super(color, cordinat);
    }

    @Override
    protected Set<CordinatShift> getPieceMoves() {
        return null;
    }
}
