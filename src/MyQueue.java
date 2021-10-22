import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T> {
    private class Node
    {
        private T data;
        private Node next;
    }
    private Node head;
    private Node tail;
    public MyQueue()
    {
        head=null;
        tail=null;
    }
    public void enqueue(T object)
    {
        Node newNode = new Node();
        newNode.data = object;
        if(isEmpty())
        {
            this.head = newNode;
            this.tail = newNode;

        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        newNode.next = null;
    }
    public T dequeue()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        else
        {
            T data = this.head.data;
            this.head = this.head.next;
            return data;
        }
    }
    public T front()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        else
        {
            return this.head.data;
        }
    }
    public int size()
    {
        if(isEmpty()){
            return 0;
        }
        else
        {
            int count = 0;
            Node current = this.head;
            while(current.next != null)
            {
                count++;
                current = current.next;
            }
            return count;
        }
    }
    public boolean isEmpty()
    {
        return this.head == null;
    }
    public void clear()
    {
        this.head = null;
        this.tail = null;
    }
}
