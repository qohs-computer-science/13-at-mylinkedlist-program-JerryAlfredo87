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
        ListNode temp = new ListNode(head, null);
        String returned = "";
        while(temp.getValue()!= null)
        {
            returned += temp.getValue() + ", ";
            if(temp.getNext() != null)
            {
                temp.setValue(temp.getNext());
            }
        }
        return returned;
    }

    public boolean add(Object newItem)
    {
        if(size != 0)
        {
            head.setNext(new ListNode(newItem, null));
        }
        else
        {
            head.setValue(new ListNode(newItem, null));
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
}
