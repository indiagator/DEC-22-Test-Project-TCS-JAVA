package test;

import exceptions.WalletBalanceInsufficientException;
import zoo.Animal;

import java.nio.file.FileAlreadyExistsException;


public class TestException
{
    public static void main(String[] args)
    {
        try
        {
            Animal animal = new Animal();
            animal.speak();
            int[] arr = {2, 4, 6, 5, 3};
            System.out.println(arr[3]);
        }
        catch( ArrayIndexOutOfBoundsException | NullPointerException exception)
        {

        }
        finally
        {
            System.out.println("this is coming from the finally block");
        }
            makePayment();
    }

    static void makePayment()
    {
        throw new WalletBalanceInsufficientException();
    }
}
