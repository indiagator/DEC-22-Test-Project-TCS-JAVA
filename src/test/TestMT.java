package test;

import threads.DirectChildThread;
import threads.InterfaceThread;

public class TestMT
{
    public static void main(String[] args) throws InterruptedException
    {

        MTNumber sharedNum = new MTNumber(0,0);
        MTNumber sharedNum2 = new MTNumber(0,0);

        System.out.println("Main thread just started!");

        Thread th1 = new DirectChildThread("TH1",sharedNum,sharedNum2);
        th1.start(); // thread is now started

        //Thread th2 = new DirectChildThread("TH2",sharedNum,sharedNum2);
        //th2.start(); // thread is now started

        Thread ih1 = new Thread(new InterfaceThread("IH1",sharedNum,sharedNum2));
        ih1.start();

       // Thread ih2 = new Thread(new InterfaceThread("IH2",sharedNum,sharedNum2));
       // ih2.start();
       // System.out.println("A new DirectChildThread Object just created");
       // System.out.println("A new InterfaceThread Object just created");
       // for (int i = 0; i <20 ; i++)
       // {
           // System.out.print("MAIN: ");
          //  sharedNum.printSum();
         //   System.out.println();
          //  try
           // {
           //     Thread.sleep(200);
           // }
           // catch (InterruptedException e)
          //  {

           // }
        //}
        th1.join(); // sleep till th1 is working | when th1 ends you proceed
        ih1.join(); // sleep till ih1 is working | when ih1 ends you proceed
        System.out.println("MAIN just terminated");

    }
}
