package zoo;

public class Lion extends Carnivores implements WildFeline
{ // extends Object
    Lion(String collarId, String name)
    {
        super(collarId, name);
    }

    @Override
    public void lickFur()
    {

    }

    @Override
    public void roar()
    {
        System.out.println("ROARRRRRRRRRRR");
    }
}
