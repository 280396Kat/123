package com.company;

public enum Color {
    WHITE, BLEAK;

    public Color posishon() {
        return this == WHITE ? BLEAK : WHITE;
    }
}
