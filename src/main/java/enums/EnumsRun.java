package enums;

public class EnumsRun {
    public static void main(String[] args) {
        System.out.println(Figure.CIRCLE);
        Figure figure = Figure.valueOf("CIRCLE");
        System.out.println(figure);
    }
}
