package natalie ;
public class ArrayStack<E> 
{
    private E[] data ;
    private int top ;
    private static final int CAPACITY = 2 ;
    public ArrayStack()
    {
        data = (E[]) new Object[ArrayStack.CAPACITY] ;
        top = -1 ;
    }
    public void push (E element) throws IllegalArgumentException
    {
        if (top == ArrayStack.CAPACITY)
        {
            throw new IllegalArgumentException("Stack is full") ;
        }
        data[top+1] = element ;
        top ++ ;
    }
    public E pop()
    {
        if (this.isEmpty() == true)
        {
            return null ;
        }
        E target = data[top] ;
        data[top] = null ;
        top -- ;
        return target ;
    }
    public E top()
    {
        if (this.isEmpty() == true)
        {
            return null ;
        }
        return data[top] ;
    }
    public int size()
    {
        return top + 1 ;
    }
    public boolean isEmpty()
    {
        if(top == -1)
        {
            return true ;
        }
        return false ;
    }

    public static void main(String[] args) throws IllegalArgumentException
    {
        ArrayStack<Integer> myStack = new ArrayStack<Integer>() ;
        myStack.push(5) ;
        myStack.push(6) ;
        System.out.println(myStack.size()) ;
        System.out.println(myStack.pop()) ;
        System.out.println(myStack.pop()) ;
        System.out.println(myStack.isEmpty()) ;
        myStack.push(7) ;
        System.out.println(myStack.isEmpty()) ;
        System.out.println(myStack.size()) ;

    }
}