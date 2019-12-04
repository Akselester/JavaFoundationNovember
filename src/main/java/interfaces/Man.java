package interfaces;

public class Man extends Human implements Cookable, Cloneable {

    public Man() {
        super();
    }

    public Man(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void cook() {
        System.out.println("I can cook eggs only");
    }

    @Override
    public void clean() {
        System.out.println("Clear all!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
