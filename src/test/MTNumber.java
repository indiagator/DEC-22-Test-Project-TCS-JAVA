package test;

public class MTNumber
{
    int i=0;
    int j=0;

    boolean flag=false;

    volatile long longI;

    MTNumber(int i, int j)
    {
        i = i;
        j = j;
    }

    public synchronized long getLongI()
    {
        return longI;
    }

    public synchronized void setLongI(long longI) {
        this.longI = longI;
    }

    public void incrementI()
    {
        i++;
    }

    public void incrementJ()
    {
        j++;

    }

    public int getI()
    {
        return i;
    }

    public int getJ() {
        return j;
    }

    public  void printSum() throws InterruptedException // Transaction comprises of multiple methods
    {
        //....
        //....
        //....
        //....

        synchronized (this)
        {
            incrementI();
            incrementJ();
            System.out.println(i + j);

            //....
            //.....

        }


    }

    public synchronized boolean checkFlag() throws InterruptedException
    {
        wait(); // Just Relax and go to sleep
        return flag;
    }

    public synchronized void setFlag(boolean flag)
    {
        this.flag = flag;
        notifyAll();
    }

    @Override
    public String toString() {
        return "MTNumber{" +
                "i=" + i +
                ", j=" + j +
                ", flag=" + flag +
                ", longI=" + longI +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MTNumber mtNumber = (MTNumber) o;

        if (i != mtNumber.i) return false;
        return j == mtNumber.j;
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + j;
        return result;
    }
}
