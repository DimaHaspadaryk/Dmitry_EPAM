package Flowers.iml.flowers;

import Flowers.iml.entity.Flower;

import java.util.Objects;

public class Bob extends Flower {
   private boolean desiccation;

    public Bob(double cost, double lenght, double weight,int fresh,boolean desiccation) {
        super(cost, lenght, weight,fresh);
    }

    public boolean isDesiccation() {
        return desiccation;
    }

    public void setDesiccation(boolean desiccation) {
        this.desiccation = desiccation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bob bob = (Bob) o;
        return desiccation == bob.desiccation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), desiccation);
    }

    @Override
    public String toString() {
        return "Bob{" +
                "desiccation=" + desiccation +
                '}';
    }
}
