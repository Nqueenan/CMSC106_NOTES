public class ArrayStack<E> implements Stack<E>
{
    // Look @ her notes
    private E[] array ;
    private E topE ;
    private int size ;
    public static final int CAPACITY = 1000 ; 
    public ArrayStack (E[] array, int size)
    {
        array = (E[]) new Object[CAPACITY] ;
        this.size = 0 ;
    }
    public void push(E element)
    {
        array[size] = element ;
        size ++ ;
    }
    public E pop()
    {
        return array[size-1] ;
        array[size-1] = null ;
        size = size -1 ;
    }
    public E top()
    {
        return array[size] ;
    }
    public int size()
    {
        return size ;
    }
    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true ;
        }
        return false ;
    }


}