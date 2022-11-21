package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestAPI
{

    public static void main(String[] args) throws IOException {

        Byte b = new Byte((byte) 5);
        Short s;
        Integer i = 56; // new Integer(56); | BOX-ING | AUTO-BOX-ING
        Long l;

        Float f =  78.56f;
        Double d;



        Character c;
        Boolean bool;

        String num  = "56.98";
        String num2 = "34.67";

        StringBuilder numExcl = new StringBuilder("");
        for ( Character ch : num.toCharArray() )
        {
            numExcl.append(ch+"!");
            System.out.println(ch);
        }
        System.out.println(numExcl);

        System.out.println("***************");

        for ( Character ch : num2.toCharArray() )
        {
            System.out.println(ch);
        }

        System.out.println("***************");

        System.out.println(num+num2);

        System.out.println(Float.valueOf(num)+Float.valueOf(num2));

        float fl = new Float(67.98); //UNBOXING

        // STRING

        char[] chAr = {'h','e','l','l','o',',','w','o','r','l','d'};
        String hello = new String(chAr);
        String testString = " Its very cold here in Delhi now and we are compelled to take out our winter clothing";
        System.out.println(hello);
        System.out.println(hello.substring(3,11));
        System.out.println(hello.toUpperCase());
        System.out.println(hello.compareTo("Hello"));
        System.out.println(hello.contains("tcs"));

        String[] splitAr = testString.split(" ");

        for (String string: splitAr)
        {
            System.out.println(string);
        }



        BufferedReader inData = Files.newBufferedReader(Paths.get("D:\\SOftware Dev and Training Material\\NewWinCode\\tcsdec22\\testtcsdec22\\data\\testdata.txt"));
        String line = inData.readLine();
        System.out.println(line);

        String[] splitAr2 = line.split(" ");

        for (String string: splitAr2)
        {
            System.out.println(string);
        }


    }
}
