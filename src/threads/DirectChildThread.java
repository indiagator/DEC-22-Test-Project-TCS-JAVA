package threads;

import test.MTNumber;

public class DirectChildThread extends Thread
{
    private String name;
    MTNumber mtNumber;
    MTNumber mtNumber2;

    public DirectChildThread(String name, MTNumber mtNumber, MTNumber mtNumber2)
    {
        this.name=name;
        this.mtNumber=mtNumber;
        this.mtNumber2=mtNumber2;
    }

    @Override
    public void run()
    {
        System.out.println("DirectChildThread th just started");
        try
        {
            while (!mtNumber.checkFlag())
            {
                System.out.println(name + " is waiting for flag change");
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
        catch (InterruptedException e)
        {

        }

        System.out.println(name+" SAYS DATA CHANGED");


        // for (long i = 0; i < 20; i++)
       // {

            //System.out.print(name+": ");
           // try {
           //     mtNumber.printSum();
           // } catch (InterruptedException e) {
           //     throw new RuntimeException(e);
           // }


           // try
          //  {
           //     Thread.sleep(500);
           // } catch (InterruptedException e)
          //  {
          //      throw new RuntimeException(e);
           // }
        }
}



