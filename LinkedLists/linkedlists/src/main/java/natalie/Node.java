package natalie ; 
public class Node<E> 
{
    private E element ;
    private Node<E> next ;

    public Node(E element, Node<E> next)
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