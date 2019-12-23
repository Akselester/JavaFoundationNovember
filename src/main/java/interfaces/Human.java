package interfaces;

public class Human implements Comparable<Human> {
    protected String name;

    public Human(){}

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Human o) {
        return this.getName().compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
