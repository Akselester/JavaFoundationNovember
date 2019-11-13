package animals;

public class Dog extends Animal {
    private String name;
    private String breed;

    public Dog() {
        super(1, "woof-woof!");
        this.name = "Rex";
        this.breed = "German shepherd";
    }

    public Dog(String name, String breed, int age) {
        super(age, "woof-woof!");
        this.name = name;
        this.breed = breed;
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

    public String toString() {
        return "Name: " + name +
                "\nBreed: " + breed +
                "\n" + super.toString();
    }
}
