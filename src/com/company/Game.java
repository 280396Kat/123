package com.company;

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
      }
   }
}
