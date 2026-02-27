package natalie;

public class Main 
{
    public static int sum(int n)
    {
        int sum = 0 ;
        for (int i = 1 ; i <= n ; i++)
        {
            sum = sum + i ;
        }
        return sum ;
    }

    public static float sum2(float a, float b)
    {
        return a + b ;
    }

    public static double convert(int n)
    {
        double i = (double) n ;
        return i ;
    }
    public static void main(String[] args) 
    {
        System.out.println(sum(4)) ;
        System.out.println(sum2(5.2f,2.5f)) ;
        System.out.println(convert(5)) ;
    }
}