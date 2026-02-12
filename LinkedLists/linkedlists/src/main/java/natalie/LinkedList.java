package natalie;

public class LinkedList<E> 
{
    private Node<E> head ;
    private Node<E> tail ; 
    private int size ;

    // Constructor 
    public LinkedList (int size)
    {
        this.head = null ;
        this.tail = null ;
        this.size = 0 ;
    }

    // Have to initialize new node before setting values she keeps saying

    // For adding an element to the linked list
    public void addBack(E element)
    {
        Node<E> newNode = new Node<E>(element) ;

        if (head == null)
        {
            head = newNode ;
            tail = newNode ;
        }
        else
        {
            Node<E> currentNode = head ;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next ;
            }
            currentNode.next = newNode ;
            newNode.previous = currentNode ; // what I added to make it doubly

            // node.setNext(head) -- do that instead of node.next?
        }
        size ++ ;
    }

    // do one that adds to front
    public void addFront(E element)
    {
        Node<E> newNode = new Node<E>(element) ;
        if (head == null)
        {
            head = newNode ;
            tail = newNode ;
        }
        else
        {
  
        }
        size ++ ;
    }

        // For getting an element
    public E get(int index)
    {
        // This should probably just throw exception, but Im practicing try catch
        try
        {
            if (index < 0 || index >= size)
            {
                throw new IllegalArgumentException("index must be within range of the list") ;
            }
        }
        catch (IllegalArgumentException e)
        {
            index = 0 ;
        }
        Node<E> currentNode = head ;
        for (int i = 0 ; i < index ; i++)
        {
        // can do .next and .element because they are fields of the Node object, not an object
            currentNode = currentNode.next ; 
        }
        return currentNode.element ;
    }

    // writing method that takes a node and element as input and puts a new node with the element after the given node in the linked list
    public void addMiddle(Node<E> newNode, E element)
    {

    }

    public static void main(String[] args) 
    {
    // Actually using linked list
        LinkedList<Integer> list = new LinkedList<Integer>(5) ; // 5 is the size
        list.addBack(10) ;
        System.out.println(list) ;
    }
}