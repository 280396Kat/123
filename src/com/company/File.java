package com.company;

import java.util.Locale;

public enum File {

    A,B,C,D,E,F,G,H; // доска

    public static File fromChar(char c) {
        return File.valueOf(String.valueOf(c).toUpperCase()); // преобразует символ в строку, а из строки это enum
    }


}
