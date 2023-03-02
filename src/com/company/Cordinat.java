package com.company;

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
}