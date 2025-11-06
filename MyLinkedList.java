public class MyLinkedList
{
    private ListNode head;
    private int size;

    public MyLinkedList()
    {
        head = null;
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        ListNode temp = head;
        String returned = "";
        while(temp!= null)
        {
            returned += temp.getValue() + ", ";
            temp.setValue(temp.getNext());
            
        }
        return returned;
    }

    public boolean add(Object newItem)
    {
        if(!isEmpty())
        {
            head.setNext(new ListNode(newItem, null));
        }
        else
        {
            head= new ListNode(newItem, null);
        }
        size++;
        return true;
    }

    public boolean addFirst(Object newItem)
    {
        head = new ListNode(newItem, head);
        size++;
        return true;
    }

    public boolean addLast(Object newItem)
    {
        add(newItem);
        size++;
        return true;
    }

    public Object get(int i)
    {
        ListNode temp = head;
        for(int x = 0; x < i; x++)
        {
            if(temp.getValue() != null && temp.getNext() != null)
            {
                temp.setValue(temp.getNext());
            }
        }
        return temp.getValue();
    }

    public Object set(int i, Object newValue)
    {
        ListNode temp = head;
        for(int x = 0; x < i; x++)
        {
            if(temp.getValue() != null && temp.getNext() != null)
            {
                temp.setValue(temp.getNext());
            }
        }
        Object old = temp.getValue();
        temp.setValue(newValue);
        return old;
    }
}
