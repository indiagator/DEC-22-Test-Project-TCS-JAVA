package zoo;


public  class Dog extends Pet implements DomesticCanine // zoo.DomesticCanine extends zoo.Canine
{
    Dog(String collarId, String name)
    {
        super(collarId, name);
        DogType t = DomesticCanine.type;
    }

    public Dog() {
        super();
    }

    @Override
    public void bark() {
        DomesticCanine.super.bark();
    }

    @Override
    public void sniff()
    {
        System.out.println("I am sniffing the RUG");
    }

    @Override
    public void speak()
    {
        System.out.println("Wooff");


    }
}
