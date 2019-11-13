package animals;

public class Animal {
    private int age;
    private int countOfLegs;
    private String makeSound;
    private boolean isWild;

    public Animal(int age, String makeSound) {
        this.age = age;
        this.countOfLegs = 4;
        this.makeSound = makeSound;
        this.isWild = false;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
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

    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }

    public void makeSound() {
        System.out.println(makeSound);
    }

    public String toString() {
        return "Age: " + age +
                "\nLegs count: " + countOfLegs +
                "\nMakes sound: " + makeSound +
                "\nWildness: " + isWild;
    }
}
