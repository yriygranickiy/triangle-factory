package Service;


import model.Figure;
import model.Triangle;

public class ImplementTriangleService  implements TriangleService{
    Figure figure;


    @Override
    public Figure createTriangle(String input) {
        figure = parsingString(input);
        return figure;
    }



    public Figure parsingString(String input){
        Figure figure = new Triangle();
        String[] split = input.split(",");
        double firstSide = Double.parseDouble(split[1].trim());
        double secondSide = Double.parseDouble(split[2].trim());
        double thirdSide = Double.parseDouble(split[3].trim());

        double square = (firstSide + secondSide + thirdSide) / 2;
        figure.setArea(Math.sqrt(square * (square - firstSide) * (square - secondSide) * (square - thirdSide)));
        figure.setName(split[0]);

        return  FigureFactory.makeFigure(figure.getName(),figure.getArea());
    }
}
