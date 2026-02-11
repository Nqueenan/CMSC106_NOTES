package natalie;

public class LinkedList<E> 
{
    private Node<E> head;
    private int size ;

    // Constructor 
    public LinkedList (int size)
    {
        this.head = null ;
        this.size = size ;
    }

    // For adding an element to the linked list
    public void add(E element)
    {
        Node<E> newNode = new Node<E>(element) ;

        if (head == null)
        {
            head = newNode ;
        }
        else
        {
            Node<E> currentNode = head ;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next ;
            }
            currentNode.next = newNode ;
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

    public static void main(String[] args) 
    {
    // Actually using linked list
        LinkedList<Integer> list = new LinkedList<Integer>(5) ; // 5 is the size
        list.add(10) ;
        System.out.println(list) ;
    }
}