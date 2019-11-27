package enums;

public class SingletoneRunner {
    public static void main(String[] args) {
        SingletoneFigure instance = SingletoneFigure.getInstance();
        System.out.println(instance.getKindOfFigure());
        EnumSingletone.INSTANCE.print();
    }
}
