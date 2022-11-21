package zoo;

public interface DomesticCanine extends Canine
{
    public default void bark() // abstract method
    {
        System.out.println("WOOOOOFFFF");
    }


}
