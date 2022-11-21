package test;

import zoo.*;
import zoo.Cattle;

import java.util.Scanner;

public class TestInherit extends Animal
{
    TestInherit()
    {

    }

    public static void main(String[] args)
    {
        //zoo.Animal animal1 = new zoo.Animal("000","dummyAnimal");


       // zoo.Cat cat1 = new zoo.Cat("001","tom");
       // cat1.sit();
        //cat1.speak();

       // zoo.Lion lion1 = new zoo.Lion("002","Ragnar");
       // lion1.attack();
       // lion1.speak();

       // zoo.Domestic d1 = new zoo.Domestic("004","someDometic");
       // d1.speak();

        //zoo.Domestic d1 = new zoo.Domestic();

       // zoo.Canine.calculateMealWeight();
       // zoo.DogType t = zoo.Canine.type;

        //zoo.Canine c1 = new zoo.Dog();
       // zoo.Dog d2 = (zoo.Dog) c1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What animal do you want to create:? ");
        String pmInput = scanner.next();
        Animal animal = null;

        switch (pmInput)
        {
            case "domestic" : animal = new Domestic();break;
            case "pet" : animal = new Pet();break;
            case "cat" : animal = new Cat();break;
            default: animal = new Animal();
        }

       animal.speak();



        Canine cn1 = new Dog();
        cn1.sniff();



    }
}
