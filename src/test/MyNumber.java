package test;

import java.util.Objects;

public class MyNumber { // extends Object

    final String type; // float | integer |  instance variable
    float floatValue; // instance variable
    int intValue; // instance variable

    static int staticValue; // static variable | shared global data

    MyNumber(String type)
    {
        this.type = type;
        staticValue = 0;
    }

    public String getType() {
        return type;
    }

    public void setValue(int value) throws Exception
    {
        if(type.equals("integer")) // type == "integer"
        {
            intValue = value;
        }
        else if (type.equals("float"))
        {
            throw new Exception(); // kind of an error!
        }

    }

    public void setValue(float value) throws Exception
    {
        if(type.equals("float"))
        {
            floatValue = value;
        }
        else if (type.equals("integer"))
        {
            throw new Exception();
        }

    }

    float getFloatValue() throws Exception // Design Pattern related Problem
    {
      if(type.equals("float"))
      {
          return floatValue;
      }
      else if (type.equals("integer"))
      {
        throw new Exception();
      }
      else
      {
          throw new Exception();
      }
    }

    int getIntValue() throws Exception {

        if(type.equals("integer"))
        {
            return intValue;
        }
        else if (type.equals("float"))
        {
            throw new Exception();
        }
        else
        {
            throw new Exception();
        }
    }

    void increment()
    {
        if(type.equals("integer"))
        {
            intValue += 1; // intValue = intValue + 1;
        }
        else
        {
            floatValue += 1.0;
        }
    }

    void incrementStatic()
    {
        staticValue++;
    }

    public  int getStaticValue() {
        return staticValue;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyNumber myNumber = (MyNumber) o;

        if (Float.compare(myNumber.floatValue, floatValue) != 0) return false;
        if (intValue != myNumber.intValue) return false;
        return Objects.equals(type, myNumber.type);
    }

    @Override
    public int hashCode()
    {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (floatValue != +0.0f ? Float.floatToIntBits(floatValue) : 0);
        result = 31 * result + intValue;
        return result;
    }
}
