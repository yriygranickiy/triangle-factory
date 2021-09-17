import Service.ImplementTriangleService;

public class Program {
    public static void main(String[] args) {
        new TriangleHandler(new ImplementTriangleService()).handle();
    }
}
