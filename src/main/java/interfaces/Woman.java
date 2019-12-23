package interfaces;

public class Woman extends Human implements Cloneable, Cookable, Washable {

    public Woman(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("I can cook all from fridge");
    }

    @Override
    public void wash() {
        System.out.println("I'm a woman. But I'm not a washing machine.");
    }

    @Override
    public void clean() {
        System.out.println("Clear!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
