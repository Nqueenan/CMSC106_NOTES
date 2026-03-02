package natalie ;
public class LinkedList<E>
{
    private Node<E> head ;
    private Node<E> tail ;
    private int size ;

    public LinkedList()
    {
        head = new Node<E>(null) ;
        tail = new Node<E>(null) ;
        head.setNext(tail) ;
        tail.setPrev(head) ;
        this.size = 0 ;
    }

    public void addEnd(E element)
    {
        Node<E> newNode = new Node<E>(element) ;
        Node<E> current = head ;
        while(current.getNext() != tail)
        {
            current = current.getNext() ;
        }
        newNode.setNext(tail) ;
        newNode.setPrev(current) ;
        current.setNext(newNode) ;
        tail.setPrev(newNode) ;
        size ++ ;
    }

    @Override
    public String toString()
    {
        Node<E> current = head ;
        current = current.getNext() ;
        String string = "" ;
        while (current.getNext() != tail)
        {
            string = string + String.valueOf(current.getElement()) ;
            current = current.getNext() ;
        }
        return string ;
    }

    public static void main(String[] args) 
    {
        LinkedList<String> list = new LinkedList<String>() ;
        list.addEnd("first") ;
        list.addEnd("second") ;
        list.addEnd("third") ;
        System.out.println(list) ;
    }
}