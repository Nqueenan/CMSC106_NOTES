package natalie ;
public class UsingException
{
    public static void myNameIs(String name) throws NotMyNameException 
    {
        if (!name.equals("Natalie"))
        {
            throw new NotMyNameException() ;
        }
        System.out.println(name) ;
    }

    public static void myNameIs2(String name)
    {
        try
        {
            if (!name.equals("Natalie"))
            {
                throw new NotMyNameException() ;
            }
        }
        catch (NotMyNameException e)
        {
            name = "Natalie" ;
        }
        System.out.println(name) ;
    }

    public static void main(String[] args) throws NotMyNameException 
    {
        try
        {
            myNameIs("Hi");
        }
        catch (NotMyNameException e)
        {
            System.out.println("Make name Natalie") ;
            e.printStackTrace();
        }
        myNameIs2("Bye") ;
    }
}