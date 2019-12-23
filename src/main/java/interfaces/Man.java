package interfaces;

import equals.Programmer;

import java.util.Objects;

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

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man that = (Man) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
