package natalie;

public class ArrayPractice 
{ 
    // The array types are all the types we know (int, short, etc...)
    // Can also have arrays of objects or enums 

    private int[] integerArray ; // declaring array
    private String[] stringArray = {"hi", "bye"} ; // declaring and initializing in same step
    private double[] doubleArray = new double[2] ; // declaring and initializing in same step
    private float[] floatArray ;
    private static int[] arr3 ;

    public ArrayPractice ()
    {
        integerArray = new int[3] ; // initializing array. this array has 3 memory blocks
        doubleArray[0] = 4.4 ; // giving a value, has to be done in constructor
        floatArray = new float[]{3.3f, 4.4f, 0.33f} ; // when giving values in constructor you still have to do new float[]  
        arr3 = new int[5] ;
    }
    
    // can also fill the array in a method after its initialized in a constructor:
    public void fillArr3()
    {
        for (int i=0 ; i < arr3.length ; i++)
        {
            arr3[i] = i * 10 ;
        }
    }


    public static void main(String[] args) 
    {
        //System.out.println(integerArray.length) ; // This doesnt work because I need to either make array static or assign it to an object
        ArrayPractice object = new ArrayPractice() ; // making an object so i can get array values idk
        System.out.println(object.integerArray.length) ;
        System.out.println(arr3) ;
        
        // just making a local array, for when I don't need outside of this
        int[] arr2 ;
        arr2 = new int[5] ;
    }
}