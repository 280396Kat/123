package com.company;

import piece.Piece;

import java.util.Set;

public class Game {
   private final Desk desk;
   private BordConsol bordConsol= new BordConsol();

   public Game(Desk desk) {
      this.desk = desk;
   }

   public void gameLoop() {
      boolean whiteToMoove = true;
      while (true) {
         // рендер
         // считываем ввод их консоли
         // передача хода
         bordConsol.rendor(desk); // передали доску и отобразили её
         if (whiteToMoove) {
            System.out.println("Ходят белые.");
         } else {
            System.out.println("Ходят чёрные.");
         }
         Cordinat fromCordinat = InputCoordinat.inputPieceCordinatesForColor(
                 whiteToMoove ? Color.WHITE : Color.BLEAK, desk); // читаем ввод, понимаем чей ход

         Piece piece = desk.getPiece(fromCordinat); // получаем координаты фигуры, которые ввел пользователь
         Set<Cordinat> availableMovesSqer = piece.getAvailableMovesSqer(desk);

         Cordinat whereCordinate = InputCoordinat.inputAvalybalSuqer(availableMovesSqer); // куда мы можем ходить

         desk.moovePice(fromCordinat, whereCordinate);
         whiteToMoove =!whiteToMoove;


      }

   }
}
