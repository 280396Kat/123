package piece;

import com.company.Color;
import com.company.Cordinat;

public abstract class Piece {
    public final Color color;
    public Cordinat cordinat;

    public Piece(Color color, Cordinat cordinat) {
        this.color = color;
        this.cordinat = cordinat;
    }
}
