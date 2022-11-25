package threads;

import test.MTNumber;

import java.util.Scanner;

public class InterfaceThread implements Runnable //Marker Interface
{
    private String name;
    MTNumber mtNumber;
    MTNumber mtNumber2;

    public InterfaceThread(String name, MTNumber mtNumber, MTNumber mtNumber2)
    {
        this.name=name;
        this.mtNumber=mtNumber;
        this.mtNumber2=mtNumber2;
    }

    @Override
    public void run()
    {
        System.out.println("Thread ih just started");


        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        mtNumber.setFlag(true);
        //for (int i = 0; i < 20 ; i++)
        //{

           // System.out.print(name+": ");


          //  try
          //  {
           //     Thread.sleep(700);
           // }
            //catch (InterruptedException e)
           // {
           //     throw new RuntimeException(); //Tantrum
           // }
    }
}

