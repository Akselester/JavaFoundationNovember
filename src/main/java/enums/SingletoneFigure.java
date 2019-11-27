package enums;

public class SingletoneFigure {
    private String kindOfFigure;
    private static SingletoneFigure instance;

    //Паттерн применяется, когда мы хотим создать только один экземпляр данного класса.
    private SingletoneFigure(String kindOfFigure) {
        this.kindOfFigure = kindOfFigure;
    }

    public static SingletoneFigure getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new SingletoneFigure("Circle");
        return instance;
    }

    public String getKindOfFigure() {
        return kindOfFigure;
    }
}
