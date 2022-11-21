package zoo;

public class Pet extends Domestic {
    Pet(String collarId, String name) {
        super(collarId, name);
    }

    public Pet() {
        super();
    }

    @Override
    public void speak() {
       System.out.println("I am a zoo.Pet");

    }
}
