package zoo;


public  class Hyena extends Carnivores implements WildCanine, WildFeline, DomesticCanine, DomesticFeline
{
    Hyena(String collarId, String name)
    {
        super(collarId, name);
    }

    public Hyena() {
        super();
    }

    @Override
    public void sniff()
    {
        System.out.println("I am sniffind the Jungle Grass");
    }

    @Override
    public void purr() {

    }

    @Override
    public void lickFur() {

    }

    @Override
    public void roar() {

    }
}
