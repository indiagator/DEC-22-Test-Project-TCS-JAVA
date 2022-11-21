package zoo;

public interface Canine
{

    DogType type=DogType.GERMANSHEPHERD; // static | final

    public void sniff();

    public static float calculateMealWeight()
    {
        return 0;
    }

}
