

/**  This is another Java Class*/
public class AnotherClass
{

    private int i = 0;
    public static void main(String[] args)
    {

        int[] numbers = {4,6,5,3,7,4,3,2,8,9}; // declaration, instantiation and initialization of an array

        int[] numbers2 = new int[10]; // array instantiation
        numbers2[0] = 8;

        for (int i = 0; i < numbers.length; i++)
        {
            if(i == 9)
            {
                System.out.println( "end of array" );
            }
            else
            {
                System.out.println( numbers[i] * numbers[i+1] );
            }

        }

        System.out.println("unique reference of the array is: "+numbers);

        System.out.println("***************");


        int[][] multiNumbers = {
                                    {5,7,3,2},
                                    {5,8},
                                    {7,8,3,2,0},
                                    {3,2,7,5,4,9,8},
                                    {4}
                                };

        outer:for (int i = 0; i < multiNumbers.length; i++)
        {
            inner:for (int j = 0; j < multiNumbers[i].length; j++)
            {

                if(j > 2)
                {
                    return;
                }
                System.out.print("["+multiNumbers[i][j]+"] ");
            }
            System.out.println();
        }

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
