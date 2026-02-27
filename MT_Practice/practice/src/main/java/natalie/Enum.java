package natalie ;

public class Enum
{
    public enum College{HAV, BMC} ;
    public static void collegeMessage(College college)
    {
        switch (college)
        {
            case HAV:
                System.out.println("best") ;
                break ;
            case BMC:
                System.out.println("worst") ;
                break ;
            default:
                System.out.println("idk") ;
                break ;
        }
    }
    public static void main (String[] args)
    {
        collegeMessage(College.BMC) ;
        College haverford = College.HAV ;
        collegeMessage(haverford) ;
    }
}