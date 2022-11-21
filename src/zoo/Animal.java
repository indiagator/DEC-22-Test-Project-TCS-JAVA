package zoo;


public class Animal
{
    protected String collarId; // public is an access modifier
    protected String limbs;   // private is an access modifier
    protected String name;

    Animal(String collarId, String name)
    {
        this.collarId = collarId;
        this.name = name;
    }

    public Animal()
    {

    }

    public void speak()
    {
       System.out.println(name+" say BLANK");

    }
}
