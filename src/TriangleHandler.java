import Service.TriangleService;
import model.Figure;

import java.util.*;

public class TriangleHandler {
    private final String SHOULD_TRY_AGAIN_QUESTION = "Want enter next triangle ? yes/no";

    private TriangleService triangleService;

    public TriangleHandler(TriangleService triangleService) {
        this.triangleService = triangleService;
    }

    public  void  handle(){
        Scanner scanner = new Scanner(System.in);
        List<Figure> figureList = new ArrayList<>();
        boolean shouldGetTriangle = true;
        while (shouldGetTriangle){
            System.out.println("Введите  Tреугольник: ");
            String input = scanner.next();
            try {
                Figure figure = triangleService.createTriangle(input);
                figureList.add(figure);
            }catch (InputMismatchException inputMismatchException){
                System.out.println(inputMismatchException.getMessage());
            }
            shouldGetTriangle = Util.getConfirmation(SHOULD_TRY_AGAIN_QUESTION);
        }
        Collections.sort(figureList);
        figureList.forEach(figure1 -> System.out.println(figure1.toString()));
    }
}
