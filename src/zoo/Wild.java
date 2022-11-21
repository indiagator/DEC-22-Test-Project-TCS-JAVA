package zoo;

public class Wild extends Animal
{
    Wild(String collarId, String name) {
        super(collarId, name);
    }

    public Wild() {

        new Animal();

    }

    void attack()
    {
        System.out.println(this.name+" is now attacking");
    }
}
