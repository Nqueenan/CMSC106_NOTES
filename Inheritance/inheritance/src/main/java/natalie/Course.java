package natalie;

// This is the parent class to CSCourse

public class Course {

    // Instance vars
    // They are protected instead of private because I use them in CSCourse
    protected String name ;
    protected int number ;

    // Constructor
    public Course (String name, int number)
    {
        this.name = name ;
        this.number = number ;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name ;
    }
    public void setNumber(int number)
    {
        this.number = number ;
    }

    // Getters
    public String getName()
    {
        return this.name ;
    }
    public int getNumber()
    {
        return this.number ;
    }
    public static void main(String[] args) 
    {
        Course testCourse = new Course("Probability", 218) ;
        System.out.println(testCourse.getName()) ;
    }
}