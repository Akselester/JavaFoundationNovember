package interfaces;

public class Man implements Cookable, Cloneable, Comparable<Man> {
    private String name;

    public Man(){}

    public Man(String name){
        this.name = name;
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

    @Override
    public int compareTo(Man o) {
        return this.getName().compareTo(o.getName());
    }
}
