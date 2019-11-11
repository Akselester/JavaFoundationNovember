package core;

public class Cat {
    private int countOfLegs;
    private String eyeColor;

    public Cat(){};

    public Cat(int countOfLegs, String eyeColor){
        this.countOfLegs = countOfLegs;
        this.eyeColor = eyeColor;
    }

    public void sayMeow(){
        System.out.println("meow-meow");
    }
}
