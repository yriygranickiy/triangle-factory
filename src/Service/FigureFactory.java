package Service;

import model.Figure;
import model.Triangle;

public class FigureFactory {
    public static Figure makeFigure(String name,double area){
        return new Triangle(name, area);
    }
}
