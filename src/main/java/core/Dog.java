package core;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private int countOfLegs;
    private boolean isWoof;

    public Dog() {
        this.name = "Rex";
        this.breed = "German shepherd";
        this.age = 2;
        this.countOfLegs = 4;
        this.isWoof = false;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.countOfLegs = 4;
        this.isWoof = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountOfLegs() {
        return countOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public boolean isWoof() {
        return isWoof;
    }

    public void setWoof(boolean woof) {
        this.isWoof = woof;
    }

    public String toString() {
        return "Name: " + name +
                "\nBreed: " + breed +
                "\nAge: " + age +
                "\n" + name + " has " + countOfLegs + " legs" +
                "\nWoofing is " + isWoof;
    }
}
