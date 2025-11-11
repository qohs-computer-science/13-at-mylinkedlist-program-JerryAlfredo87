//Name: Meade Havenstein
//Pd: 6, Date: 11/4/25
//Purpose: Create multiple methods in order to manipulate methods created by user. Test code regularly.

public class MyLinkedList
{
    private ListNode head;
    private int size;

    public MyLinkedList()
    {
        head = null;
        size = 0;
    }//end constructor

    public int size()
    {
        return size;
    }//end size

    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }//end if
        return false;
    }//end isEmpty

    public String toString()
    {
        ListNode temp = head;
        String returned = "";
        if(temp == null)
        {
            returned = "Empty list";
        }//end if
        while(temp!= null)
        {
            returned += temp.getValue() + ", ";
            temp = temp.getNext();
        }//end while
        return returned;
    }//end toString

    public boolean add(Object newItem)
    {
        ListNode temp = head;
        if(!isEmpty()) // adding at the end - need loop
        {
            while(temp.getNext() != null)
            {
                
                temp = temp.getNext();
                
            }//end while
            temp.setNext(new ListNode (newItem, null));
        }//end if
        else
        {
            head= new ListNode(newItem, null);
        }//end else
        size++;
        return true;
    }//end add

    public boolean addFirst(Object newItem)
    {
        head = new ListNode(newItem, head);
        size++;
        return true;
    }//end addFirst

    public boolean addLast(Object newItem)
    {
        add(newItem);
        size++;
        return true;
    }//end addLast

    public Object get(int i)
    {
        ListNode temp = head;
        for(int x = 0; x < i; x++)
        {
            if(temp.getValue() != null && temp.getNext() != null)
            {
                temp = temp.getNext();
            }//end if
        }//end for
        return temp.getValue();
    }//end get

    public Object set(int i, Object newValue)
    {
        ListNode temp = head;
        for(int x = 0; x < i; x++)
        {
            if(temp.getValue() != null && temp.getNext() != null)
            {
                temp = temp.getNext();
            }//end if
        }//end for
        Object old = temp.getValue();
        temp.setValue(newValue);
        return old;
    }//end set

    public Object remove(int i)
    {
        ListNode temp = head;
        Object removed;
        for(int x = 0; x <= i; x++)
        {
            if(x == i)
            {
                removed = head.getValue();
                head = head.getNext();
                return removed;
            }//end if
            if(temp.getValue() != null && temp.getNext() != null)
            {
                if(x + 1 == i)
                {
                    ListNode other = temp.getNext();
                    temp.setNext(other.getNext());
                    removed = other.getValue();
                    return removed;
                }//end if
                temp = temp.getNext();
            }//end if
        }//end for
        removed = "Not found";
        return removed;
    }//end remove

    public Object removeFirst()
    {
        Object removed = head.getValue();
        if(head.getValue() != null)
        {
            remove(0);
        }//end if
        return removed;
    }//end removeFirst

    public Object removeLast()
    {
        ListNode temp = head;
        Object removed;
        int count = 0;
        while(temp.getNext() != null)
        {
            temp = temp.getNext();
            count++;
        }//end while
        removed = temp.getValue();
        remove(count);
        return removed;
    }//end removeLast
}//end linkedList
