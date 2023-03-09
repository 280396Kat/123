package com.company;

import piece.Piece;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Desk desk = new Desk();
        desk.defoldPiecePosishen();
        BordConsol bordConsol = new BordConsol();
        bordConsol.rendor(desk);
        desk.getPiece(new Cordinat(File.B, 1));





    }
}

