package core;

public class Lion extends  Cat {

    private boolean isWild;

    public Lion(){}

    public Lion(boolean isWild){
//        super(4, "green");
        this.isWild = isWild;
    }

    @Override
    public void sayMeow(){
        System.out.println("ROAAARRR!!!!!111");
    }

    public void killAnimal(){
        System.out.println("Pew-pew!");
    }
}
