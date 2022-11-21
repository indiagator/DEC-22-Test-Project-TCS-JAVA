package test;


/** Java Doc - We are lea
 *
 *
 *
 *
 *
 * rning java and this is our first class  */
public class TestTcs
{


    {

    }
    static int anInt = 78;
    static float f;

    //data members | fields | instance variables

        byte aByte; // first alphabet of the name should be in smallcase and the rest of the characters will be in camelcase
        static short aShort;
        long l;
        double d;
        char c;
        boolean aBoolean;



    public static void main(String[] args)
    {
        System.out.println("Hello world! "+f);
        //
        //New Comments
        //some more statements

        aShort = 4;
        anInt = 56;
       // aByte = 3;

        int anotherInt = 89; // local variable of the main method
        anotherInt = 98;
        //float anotherFloat;    // local variable of myBlock

        myBlock:{ // scope of myBlock is enclosed within the parent scope of main method

            anotherInt = 107;
            float anotherFloat;    // local variable of myBlock
        }

        float anotherFloat = 56.4f;

        char operator = 'a'; // a - add | m -multiply
        int x = 56;
        int y = 3;

       // if(operator == 'a')
       // {
            //true block
        //    System.out.println(add2int(x,y));break;
      //  }
      //  else if (operator == 'm')
       // {
        //    System.out.println(mul2int(x,y));
       // }
       // else if (operator == 'd')
      //  {
       //     System.out.println(div2int(x,y));

      //  }
       // else if (operator == 's')
      //  {
        //    System.out.println(sub2int(x,y));

       // }
       // else {
      //      System.out.println("incorrect operator");
     //   }


        myLabel2:switch(operator)
        {
            case 'a' : System.out.println(add2int(x,y));break myLabel2;
            case 'm' : System.out.println(mul2int(x,y));break;
            case 'd' : System.out.println(div2int(x,y));break;
            case 's' : System.out.println(sub2int(x,y));break;
            default  : System.out.println("incorrect operator");
        }




        int userInput = 5;

        switch (userInput)
       {
            case 0 : System.out.println(0);
            case 1 : System.out.println(1);
            case 2 : System.out.println(2);
            case 3 : System.out.println(3);
            case 4 : System.out.println(4);break; //breaking out of block
            case 5 : System.out.println(5);
            case 6 : System.out.println(6);
            case 7 : System.out.println(7);
            case 8 : System.out.println(8);
            case 9 : System.out.println(9);
        }

        System.out.println("*****for*****");

        for( int i = 0 ; i<10  ; i++  )
       {
            if(i == 7)
            {
                continue;
            }

           System.out.println(i);
       }


        System.out.println("*****while*****");

        int j = 0;

        while( j < 10) // infinite loop
        {

            if(j  == 5)
            { j++;continue;}

            System.out.println(j*10);

        }



    }

    /**
     * Java Doc for this Method : Method Overloading
     * */
     public void doSomething(int i, char c,float f) // parameter declaration | method declaration
    {
        aShort = 45;
        anInt = 678;
        f = 89.0f;
        //aByte = 2;
    }


    static int add2int(int x, int y)
    {
        return x+y;
    }

    static int mul2int(int x, int y)
    {
        return x*y;
    }

    static int div2int(int x, int y)
    {
        return x/y;
    }

    static int sub2int(int x,int y)
    {
        return x-y;
    }


}

