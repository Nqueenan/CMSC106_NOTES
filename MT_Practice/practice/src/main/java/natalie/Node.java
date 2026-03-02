package natalie ;
public class Node<E>
{
    private Node<E> next ;
    private Node<E> prev ;
    private E element ;

    public Node(E element)
    {
        this.next = null ;
        this.prev = null ;
        this.element = element ;
    }

    public void setNext(Node<E> next)
    {
        this.next = next ;
    }
    public void setPrev(Node<E> prev)
    {
        this.prev = prev ;
    }
    public void setElement (E element)
    {
        this.element = element ;
    }
    public Node<E> getNext()
    {
        return this.next ;
    }
    public Node<E> getPrev()
    {
        return this.prev ;
    }
    public E getElement()
    {
        return this.element ;
    }
    
}