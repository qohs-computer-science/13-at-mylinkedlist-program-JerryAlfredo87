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
            temp = temp.getNext();
            
        }
        return returned;
    }

    public boolean add(Object newItem)
    {
        ListNode temp = head;
        if(!isEmpty()) // adding at the end - need loop
        {
            while(temp.getNext() != null)
            {
                
                temp = temp.getNext();
                
            }
            temp.setNext(new ListNode (newItem, null));
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
            }
            if(temp.getValue() != null && temp.getNext() != null)
            {
                if(x + 1 == i)
                {
                    removed = temp.getNext();
                    ListNode other = temp.getNext();
                    temp.setNext(other.getNext());
                    return removed;
                }
                
                
                temp.setValue(temp.getNext());
            }
        }
    }

    public Object removeFirst()
    {
        Object removed = head.getValue();
        if(head.getValue() != null)
        {
            remove(0);
        }
        return removed;
    }

    public Object removeLast()
    {
        ListNode temp = head;
        Object removed;
        int count = 0;
        while(temp.getNext() != null)
        {
            temp = temp.getNext();
            count++;
        }
        removed = temp.getValue();
        remove(count);
        return removed;
    }
}
