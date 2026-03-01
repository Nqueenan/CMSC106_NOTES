package natalie ;
import java.util.ArrayList ;
public class Array 
{
    private static String[] arr1 = new String[]{"1", "2", "3", "4", "5"} ;
    private static String[] arr2 = new String[6] ;
    private static ArrayList<String> list = new ArrayList<String>() ;

    public static void fillArr2(String[] arr1)
    {
        for (int i = 0 ; i < arr1.length ; i++)
        {
            arr2[i] = arr1[i] ;
        }
        arr2[5] = "6" ;
    }
    public static void copyArr(String[] arr1, String[] arr2) // arr1 is the shorter array
    {
        for (int i = 0 ; i < arr1.length ; i++)
        {
            arr2[i] = arr1[i] ;
        }        
    }
    public static void fillList(String[] arr1, ArrayList<String> list)
    {
        for (int i = 0 ; i < arr1.length ; i++)
        {
            list.add(arr1[i]) ;
        }
    }
    public static void removeAll(ArrayList<String> list)
    {
        for (int i = list.size() -1 ; i >= 0 ; i--)
        {
            list.remove(i) ;
        }
    }
    public static void printArray (String[] array)
    {
        for (int i = 0 ; i < array.length ; i++)
        {
            System.out.println(array[i]) ;
        }
    }
    public static void printList(ArrayList<String> list)
    {
        for (int i = 0 ; i < list.size() ; i++)
        {
            System.out.println(list.get(i)) ;
        }
    }
    public static void main(String[] args) 
    {
        fillArr2(arr1) ;
        copyArr(arr1, arr2) ;
        printArray(arr1) ;
        printArray (arr2) ;
        fillList(arr1, list) ;
        printList(list) ;
        removeAll(list) ;
        printList(list) ;
    }
}