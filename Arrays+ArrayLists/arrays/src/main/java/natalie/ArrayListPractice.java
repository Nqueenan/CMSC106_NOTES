package natalie;
import java.util.ArrayList ;
import java.util.Arrays ;
public class ArrayListPractice 
{
    // ArrayLists store objects, so instead of int its Integer
    public ArrayList<Integer> intList ; // declaring
    private ArrayList<String> stringList = new ArrayList<>(); // declaring and initializing in same step. dont need the type again (but can have it)
    private ArrayList<Integer> intList2 = new ArrayList<>(Arrays.asList(1,2,3)) ; // declaring and initializing w values. need to import arrays to do this
    

    public ArrayListPractice()
    {
        intList = new ArrayList<>() ; // initializing. dont need the type again (but can have it)
        intList.set(1,3) ; // equivalent to intArray[1] = 3 but this is for arraylist not array
        
        

    }



    public static void main(String[] args) 
    {
        ArrayListPractice object = new ArrayListPractice() ; // making an object HAS TO BE DONE HERE
        System.out.println(object.intList.get(1)) ;
    }
}