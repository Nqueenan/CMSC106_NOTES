package natalie ; 
public class Node<E> 
{
    public E element ;
    public Node<E> next ; // next is an element of the node, not a variable itself

    public Node(E element)
    {
        this.element = element ;
        this.next = null ;
    }

    // setters
    public void setElement(E element)
    {
        this.element = element ;
    }
    public void setNext(Node<E> next)
    {
        this.next = next ;
    }
    // getters
    public E getElement()
    {
        return this.element ;
    }
    public Node<E> getNext()
    {
        return this.next ;
    }
    public static void main(String[] args) 
    {
        
    }
}