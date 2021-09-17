package model;

public abstract class Figure implements Comparable<Figure> {
    public abstract String getName();
    public abstract double getArea();
    public abstract void setName(String name);
    public abstract void setArea(double area);

    @Override
    public String toString() {
        return "Name: " +this.getName()+" Area: "+ this.getArea();
    }
}
