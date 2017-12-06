package Nackademin.com;



import java.util.Random;

public class Die
{
    //instance variable
    private int currentValue;

    private int maxValue;
    private static int generator;

    //private static int generator;


    //instance method
    public Die(int maxValue)
    {
        this.maxValue = maxValue;
        this.currentValue=0;
    }



    public void setGenerator()
    {
        Random r = new Random();
        generator = r.nextInt(maxValue)+1;
    }


    public int getMaxValue() {
        return maxValue;
    }
    public int getCurrentValue() {
        return currentValue;
    }

    public static int getGenerator() {
        return generator;
    }

    public void roll()
    {
        setGenerator();
        currentValue = generator;
    }

    public String toString()
    {
        return "Max value is "+ maxValue+" and current value is "+currentValue+" and generator is "+generator;
    }
}
