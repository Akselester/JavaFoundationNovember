package animals;

public class Lion extends Cat {

    public Lion() {
        super();
        setMakeSound("ROOOOARRR!");
        setWild(true);
    }

    public void killAnimal() {
        System.out.println("Pew-pew!");
    }
}
