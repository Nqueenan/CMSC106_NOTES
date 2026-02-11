package natalie;
// This is the child class to Course
// Also has example of overriding toString

public class CSCourse extends Course
{
    // New CS-Specific Instance vars
    private static String dept = "CS" ; // Static b/c all CS courses are from CS dept (it should prob be static final but whatevs)
    private String labSection ;

    // Constructor
    // NOTE: Static variable is NOT put in the constructor
    public CSCourse(String name, int number, String labSection)
    {
        super(name, number) ; // This calls the parent constructor
        this.labSection = labSection ;
    }

    // Overriding toString(), so System.out.println(object) prints this string instead of the objects location
    // When calling a var from parent, just use the getter. Even when its an int it automatically converts to string
    // Also note how when getting static variable you do Class.varName
    @Override
    public String toString()
    {
        String str = CSCourse.dept + getNumber() + ", " + getName() + ". Lab Section: " + labSection ;
        return str ;
    }

    // Getters
    // See I still do Class.varName for static
    public String getDept()
    {
        return CSCourse.dept ;
    }
    public String getLabSection()
    {
        return this.labSection ;
    }

    // Setters
    // This static shouldn't have a setter since it should be final b/c it never changes but I did it just to show
    public void setDept(String dept)
    {
        CSCourse.dept = dept ;
    }
    public void setLabSection(String labSection)
    {
        this.labSection = labSection ;
    }

public static void main(String[] args) 
    {
        CSCourse test = new CSCourse("Intro to Data Structures", 106, "Fridays 11:30 - 12:30") ;
        System.out.println(test) ;
        test.setDept("r") ;
        System.out.println(test.getDept()) ;
    }
}
