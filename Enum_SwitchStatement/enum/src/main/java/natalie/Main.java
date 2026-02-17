package natalie;

public class Main 
// This is just to demonstrate the switch statement, lab 1 has good example of using variables of type enum and referencing them and whatnot.

{
    private enum Fruit{ORANGE,APPLE} ; // making the enum

    // Switch statement with enum
    public static void printFruit(Fruit fruit)
    {
        switch(fruit)
        {
            case ORANGE:
                System.out.println("Orange yay") ;
                break ;
            case APPLE:
                System.out.println("Apple bye") ;
                break ;
            default:
                System.out.println("Wrong fruit") ;
                break ;
        }
    }


    public static void main(String[] args) 
    {
        printFruit(Fruit.APPLE) ;

        // This is where we did run configuration and edited arguments to say hello world, then printed args[0]
        System.out.println(args[0]) ;
        
    }
}