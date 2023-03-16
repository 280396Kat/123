package com.company;

import piece.Piece;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Desk desk = new Desk();
        desk.defoldPiecePosishen();
        Game game = new Game(desk);
        game.gameLoop();

    }
}

