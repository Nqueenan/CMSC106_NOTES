package natalie;

public class LinkedList<E> 
// yeah so i want to replace my .next .previous .element with getters and setters so i can make those instance variables private
// so currentNode = currentNode.next became currentNode = currentNode.getNext()
// but I dont have to do this for head, tail, size because Im working in the class I defined them in
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
            while (currentNode.getNext() != null)
            {
                currentNode = currentNode.getNext() ;
            }
            currentNode.setNext(newNode) ;
            newNode.setPrevious(currentNode) ; // what I added to make it doubly
            tail = newNode ;

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
            head.setPrevious(newNode) ;
            newNode = head ;
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
            currentNode = currentNode.getNext() ; 
        }
        return currentNode.getElement() ;
    }

    // writing method that takes a node and element as input and puts a new node with the element after the given node in the linked list
    public void addMiddle(Node<E> givenNode, E element)
    {
        Node<E> newNode = new Node<E>(element) ; 

        // so set the new nodes pointers BEFORE replacing the pointers of the nodes before and after
        newNode.setNext(givenNode.getNext()) ;
        newNode.setPrevious(givenNode.getNext());
        givenNode.setNext(newNode.getPrevious()) ;
        //now i just don't have what the node after my given node has its previous set to. i cant figure out how to reference that node
    }

    // write a mehtod that uses .equals() to traverse both lists and compare the pairs of Node elements

    // make a toString

    // make a deepCopy method

    public static void main(String[] args) 
    {
    // Actually using linked list
        LinkedList<Integer> list = new LinkedList<Integer>(5) ; // 5 is the size
        list.addBack(10) ;
        System.out.println(list) ;
    }
}