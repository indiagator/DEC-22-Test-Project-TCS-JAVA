package test;

import zoo.Canine;

public class TestNestedClass
{

    private int i=9;
    private int j=10;

    Canine c1 = new Canine() { // Anonymous Class
        @Override
        public void sniff()
        {
            System.out.println("sNIFFsniff");
        }
    };

    private void sum()
    {
        c1.sniff();

        Canine c1 = new Canine() { // Anonymous Class
                                        @Override
                                        public void sniff()
                                        {

                                        }
                                };


        class LocalClass
        {
            public void sniff()
            {
                System.out.println("sNIFFsniff");
            }

        }

        LocalClass lc1 = new LocalClass();
        LocalClass lc2 = new LocalClass();

        lc1.sniff();
        lc2.sniff();



    }

    class InnerNestedClass
    {


        InnerNestedClass()
        {
            i=8;
            j=78;

            sum();
        }

        class AnotherNestedClass
        {
            class YetAnotherNestedClass
            {

            }

        }


    }

    class InnerNestedClass2
    {
        InnerNestedClass2()
        {
            i=89;
            j=178;

            sum();
        }

    }

    static class InnerClass
    {

        public int k = 0;

        InnerClass()
        {

        }

    }

    static class InnerClass2
    {

    }
}
