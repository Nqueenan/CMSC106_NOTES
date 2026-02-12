package natalie ; 
public class Node<E> 
{
    private E element ;
    private Node<E> next ; // next is an element of the node, not a variable itself
    private Node<E> previous ;

    public Node(E element)
    {
        this.element = element ;
        this.next = null ;
        this.previous = null ;
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
    public void setPrevious(Node<E> previous)
    {
        this.previous = previous ;
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
    public Node<E> getPrevious()
    {
        return this.previous ;
    }

    public static void main(String[] args) 
    {
        
    }
}