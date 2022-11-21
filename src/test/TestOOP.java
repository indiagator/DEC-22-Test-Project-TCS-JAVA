package test;

public class TestOOP
{

    private MyNumber instNum1; // instance variable | field | data member
    private MyNumber instNum3;
    private MyNumber instNum4;
    private MyNumber instNum2; // instance variable | field | data member
    private static MyNumber clasnum; // static variable | class variable

    public static void main(String[] args) throws Exception
    {
        User user1; //Declaration |  Defines the Scope of a Variable
            user1 = new User("rajesh@123", "rajesh bairi");      //Instantiation
                user1.setUsername("rajesh@123");      //Initialization

        Dish dish1 = new Dish();

        TestOOP app = new TestOOP();
        app.instNum1 = new MyNumber("integer");
        app.instNum3 = new MyNumber("integer");
        app.instNum2 = new MyNumber("float");
        app.instNum4 = new MyNumber("float");
        app.instNum1.setValue(56);
        app.instNum3.setValue(78);
        app.instNum2.setValue(34.87f);
        app.instNum4.setValue(12.98f);

        TestOOP.clasnum = new MyNumber("integer");
        TestOOP.clasnum.setValue(89);

        System.out.println("value of instNum1: "+app.instNum1.getIntValue());
        System.out.println("value of instNum3: "+app.instNum3.getIntValue());
        System.out.println("value of instNum2: "+app.instNum2.getFloatValue());
        System.out.println("value of instNum4: "+app.instNum4.getFloatValue());

        //System.out.println("value of CLASNUM: "+test.TestOOP.clasnum.getIntValue());

        app.instNum1.increment();
        app.instNum2.increment();
        app.instNum3.increment();
        app.instNum4.increment();

        System.out.println("********** after increment **********");

        System.out.println("value of instNum1: "+app.instNum1.getIntValue());
        System.out.println("value of instNum2: "+app.instNum2.getFloatValue());
        System.out.println("value of instNum3: "+app.instNum3.getIntValue());
        System.out.println("value of instNum4: "+app.instNum4.getFloatValue());

        System.out.println("********** after static increment **********");

        app.instNum1.incrementStatic();System.out.println("StaticValue incremented by instNum1 is: "+app.instNum1.getStaticValue());
        app.instNum2.incrementStatic();System.out.println("StaticValue incremented by instNum2 is: "+app.instNum2.getStaticValue());
        app.instNum3.incrementStatic();System.out.println("StaticValue incremented by instNum3 is: "+app.instNum3.getStaticValue());
        app.instNum4.incrementStatic();System.out.println("StaticValue incremented by instNum4 is: "+app.instNum4.getStaticValue());


        System.out.println("********** object reference experiments **********");

        MyNumber num1 = new MyNumber("integer");
        num1.setValue(78);

        MyNumber num2 = new MyNumber("integer");
        num2.setValue(78);

        //num1 = num2;

       // num2.setValue(89);

        if(num1.equals(num2))
        {
            System.out.println("both num1 and num2 are equal");
        }
        else
        {
            System.out.println("both num1 and num2 are !NOT! equal");
        }

        System.out.println("value for num1 is "+ num1.getIntValue());
        System.out.println("value for num2 is "+ num2.getIntValue());


        System.out.println("********** test.User Comparison Experiment **********");

        User usernew1 = new User("tharun@123","tharun thoparapu");
        usernew1.setPhonenumber("333333333");
        User usernew2 = new User("tharun@123","vijay shinde");
        usernew2.setPhonenumber("444444444");

        if(usernew1.equals(usernew2))
        {
            System.out.println("These are the Objects of the same test.User");
        }
        else
        {
            System.out.println("These are the Objects of the DIFFERENT UserS");
        }




    }

    void incrementPrint()
    {

    }


}
