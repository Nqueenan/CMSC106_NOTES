package natalie;

public class Main
{
    public int boring (int positiveInt)
    {
        try 
        {
            if(positiveInt <= 0)
                {
                    throw new IllegalArgumentException("got negative int") ;
                }
            System.out.println("positive int") ; // so this doesnt happen if the exception is thrown
            
        } 
        catch (IllegalArgumentException e) // if the exception is throws it goes here
        {
            positiveInt = 1 ;
        }
        return positiveInt ; // after the catch block it becomes normal again
    }




    public static void main(String[] args) 
    {
        
    }
}