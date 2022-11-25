package test;

import zoo.Canine;

import java.util.*;

public class TestCollections
{

    static void print(Canine c)
    {
        c.sniff();
    }

   static int doCalculation(Calculable c, int i,  int j)
    {
        return c.operate(i,j);
    }

    public static void main(String[] args)
    {
        Set<MTNumber> mtSet = new HashSet<>();
        mtSet.add(new MTNumber(6,7));
        mtSet.add(new MTNumber(6,7));

        for(MTNumber num : mtSet)
        {
            System.out.println(num);
        }

        List<Integer> iList = new ArrayList<>();

        iList.add(7);
        iList.add(9);
        iList.add(2);
        iList.add(9);
        iList.add(23);

        System.out.println(iList);

        iList.add(45);

        System.out.println(iList);

        iList.add(2,67);

        System.out.println(iList);

        Collections.sort(iList);

        System.out.println(iList);

        TestNestedClass t1 = new TestNestedClass();
        TestNestedClass.InnerNestedClass t2 = t1.new InnerNestedClass();
        TestNestedClass.InnerNestedClass.AnotherNestedClass  t4 = t2.new AnotherNestedClass();
        TestNestedClass.InnerClass t3 = new TestNestedClass.InnerClass();

        Canine c1 = new Canine() { //Anonymous Class
            @Override
            public void sniff() {
                System.out.println("I am sniffing the dry leaves");
            }
        };

        Canine c2 = new Canine() {
            @Override
            public void sniff() {
                System.out.println("I am sniffing the floor");
            }
        };

       print(c1);
       print(c2);

       Calculable calculable1 = new Calculable()
       {
           @Override
           public int operate(int i, int j)
           {
               return i+j; // CRUX of The Matter
           }
       };

       System.out.println( doCalculation(calculable1,4,5));

       Calculable calculable2 = new Calculable()
       {
           @Override
           public int operate(int i, int j) {
               return i-j; // CRUX of The Matter
           }
       };

       System.out.println(    doCalculation(calculable2,4,5));

        int sum=0;
        for (int i = 0; i < iList.size(); i++)
        {
            if(iList.get(i) > 25)
            sum += iList.get(i);
        }

        int sum2 = 0;
        for ( Integer i: iList )
        {
            if(i > 25)
            sum2 += i;
        }

        iList.stream().filter(integer -> integer > 25).reduce(0,Integer::sum);

    }
}
