package animals;

public class Cat extends Animal {
    private String eyeColor;

    public Cat() {
        super(1, "meooow!");
        this.eyeColor = "black";
    }

    public Cat(int age, String eyeColor) {

        super(age, "meooow!");
        this.eyeColor = eyeColor;
    }

    public String toString() {
        return "Eye Color: " + eyeColor +
                "\n" + super.toString();
    }
}
