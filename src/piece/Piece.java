package piece;

import com.company.Color;
import com.company.Cordinat;
import com.company.Desk;

import java.util.HashSet;
import java.util.Set;

public abstract class Piece {
    public final Color color;
    public Cordinat cordinat;

    public Piece(Color color, Cordinat cordinat) {
        this.color = color;
        this.cordinat = cordinat;
    }

    protected abstract Set<CordinatShift> getPieceMoves();

    public Set<Cordinat> getAvailableMovesSqer(Desk desk) {
        Set<Cordinat> result = new HashSet<>();
        for (CordinatShift shift:getPieceMoves()) {
           if (cordinat.canShift(shift)) {
               Cordinat newCoordinate = cordinat.shift(shift);
               if (isSqerAvailableForMoves(newCoordinate, desk)) {
                   result.add(newCoordinate);
               }
           }
        }
        return result;
    }

    private boolean isSqerAvailableForMoves(Cordinat cordinat, Desk desk) {
       return desk.isSqerEmpty(cordinat) || desk.getPiece(cordinat).color != color;
    }
}
