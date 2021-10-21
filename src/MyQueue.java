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
        
    }
    
}
