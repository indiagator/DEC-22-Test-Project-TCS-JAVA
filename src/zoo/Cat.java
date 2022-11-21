package zoo;

public class Cat extends Pet implements DomesticFeline
{
    Cat(String collarId, String name)
    {
        super(collarId, name);
    }

    public Cat()
    {}

    @Override
    public void lickFur()
    {


    }

    @Override
    public void purr() {
        System.out.println("PURRRRRRRRRR");
    }

    @Override
    public void speak() {
        System.out.println("MeooWW");
    }
}
