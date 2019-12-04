package interfaces;

public class Woman implements Comparable<Woman>, Cloneable, Cookable, Washable {
    private String name;

    Woman(String name) {
        this.name = name;
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
    public int compareTo(Woman o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
