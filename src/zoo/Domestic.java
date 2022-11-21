package zoo;

public class Domestic extends Animal
{

    Domestic(String collarId, String name) {
        super(collarId, name);
    }

    public Domestic() {
        super();
    }

    void sit()
    {
        System.out.println(name+" is now sitting");
    }


    @Override
    public void speak()
    {
        System.out.println("I am a zoo.Domestic zoo.Animal");

    }
}
