package Flowers.iml.flowers;

import Flowers.iml.entity.Flower;

import java.util.Objects;

public class Astrov extends Flower {
    private char color;
    public Astrov(int cost, double lenght, double weight,int fresh,char color)
    {
        super(cost, lenght, weight,fresh);
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Astrov astrov = (Astrov) o;
        return color == astrov.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Astrov{" +
                "color=" + color +
                '}';
    }
}
