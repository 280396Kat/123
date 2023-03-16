package com.company;

public class DeskFactory {
   private PieceFactory pieceFactory = new PieceFactory();

   public Desk fromFen(String fen) {
       Desk desk = new Desk();
       String[] partsPiece = fen.split(" "); // вызвали сплит чтобы разить на части
       String startPiecePosition = partsPiece[0]; // находится первая буква
       String[] fenRows = startPiecePosition.split("/"); // здесь содержится  нфо от слеша до слеша
       for (int i = 0; i < fenRows.length; i++) { // проходим по всем значениям
           String rows = fenRows[i]; // достаем значения
           int rang = 8 - i; //идём сверху вниз
           int fileIndex = 0; //
           for (int j = 0; j < rows.length(); j++) {
               char fenChar = rows.charAt(j); // проходит по каждому элементу и записывает числа
               if (Character.isDigit(fenChar)) {
                   fileIndex+=Character.getNumericValue(fenChar);
               } else { // достаем все буквы
                   File file = File.values()[fileIndex];
                   Cordinat cordinat = new Cordinat(file, rang);
                   desk.setPiece(cordinat, pieceFactory.fromFenChar(fenChar, cordinat)); // генерация новой фигуры
               }

           }
       }
       return desk;
   }
}
