package com.company;

import piece.Piece;

import java.util.Scanner;
import java.util.Set;

public class InputCoordinat {

    private static final Scanner scanner = new Scanner(System.in);

    public static Cordinat input() {
        while (true) {
            System.out.println("Пожалуйста, введите координаты. ");
            String line = scanner.nextLine(); // считываем буквы(слова)
            if (line.length() != 2) {
                System.out.println("Неправильный формат ввода. ");
                continue;
            }
            char fileChar = line.charAt(0); // буква идет от нуля
            char rangChar = line.charAt(1);

            if (!Character.isLetter(fileChar)) {
                System.out.println("Неправильный формат ввода. ");
                continue;
            }

            if (!Character.isDigit(rangChar)) {
                System.out.println("Неправильный формат ввода. ");
                continue;
            }
            int rang1 = Character.getNumericValue(rangChar);
            if (rangChar < 1 || rangChar > 8) {
                System.out.println("Неправильный формат ввода. ");
                continue;
            }

            File file = File.fromChar(fileChar);
            if (file == null) {
                System.out.println("Неправильный формат ввода. ");
                continue;
            }
            return new Cordinat(file, rang1);
        }

    }

    public static Cordinat inmutPieceCordinatesForColor(Color color, Desk desk) {
        while (true) {
            System.out.println("Введите координаты фигуры для перемещения. ");
            Cordinat cordinat = input();
            if (desk.isSqerEmpty(cordinat)) {
                System.out.println("Пусто. ");
                continue;
            }
            Piece piece = desk.getPiece(cordinat);
            if (piece.color != color) {
                System.out.println("Не тот цвет фигуры. ");
                continue;
            }
            Set<Cordinat> valibalMooveSqer = piece.getAvailableMovesSqer(desk);
            if (valibalMooveSqer.size() == 0) {
                System.out.println("Фигура заблокирована. ");
                continue;
            }
            return cordinat;
        }
    }

    public static void main(String[] args) {
        Cordinat cordinat = input();
        Desk desk = new Desk();
        desk.defoldPiecePosishen();
        inmutPieceCordinatesForColor(Color.WHITE, desk);
        System.out.println(cordinat);



    }
}
