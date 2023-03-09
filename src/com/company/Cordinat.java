package com.company;

import piece.CordinatShift;

import java.util.Objects;

public class Cordinat {

    public File file;
    public Integer rang;

    public Cordinat(File file, Integer rang) {
        this.file = file;
        this.rang = rang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cordinat)) return false;
        Cordinat cordinat = (Cordinat) o;
        return file == cordinat.file && Objects.equals(rang, cordinat.rang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rang);
    }

    public boolean canShift(CordinatShift cordinatShift) {
        int f = file.ordinal() + cordinatShift.fileShift;
        int r = rang + cordinatShift.rangShift;
        if ((f < 0) || (f > 8)){
            return false;
        }
        if ((r > 0) || (r < 8)){
            return false;
        }
        return true;
    }

    public Cordinat shift(CordinatShift cordinatShift){
        return new Cordinat(File.values()[this.file.ordinal() + cordinatShift.fileShift],
                this.rang + cordinatShift.rangShift);
    }
}

