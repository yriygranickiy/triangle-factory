package model;

public class Triangle extends Figure {

    private String name;
    private double area;

    public Triangle(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public Triangle() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public int compareTo(Figure figure) {
        return Double.compare(figure.getArea(), this.getArea());
    }
}
