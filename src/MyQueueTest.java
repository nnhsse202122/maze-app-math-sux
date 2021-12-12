import static org.junit.Assert.*;
import org.junit.Test;

public class MyQueueTest {
    public MyQueueTest()
    {}

    @Test
    public void testEmpty()
    {
        MyQueue<String> q = new MyQueue<String>();
        assertEquals(true, q.isEmpty());
        q.enqueue("test string");
        assertEquals(false, q.isEmpty());
    }
    @Test
    public void testSize()
    {
        MyQueue<String> q = new MyQueue<String>();
        assertEquals(0, q.size());
        q.enqueue("string 1");
        q.enqueue("string 2");
        assertEquals(2, q.size());
        String removed = q.dequeue();
        assertEquals(1,q.size());
        assertEquals("string 1",removed);
    }
    @Test
    public void testEnqueueDequeueFront()
    {
        MyQueue<String> q = new MyQueue<String>();
        q.enqueue("head string");
        q.enqueue("tail string");
        assertEquals("head string",q.front());
        assertEquals("head string", q.dequeue());
        assertEquals("tail string",q.dequeue());
    }
    @Test
    public void testClear()
    {
        MyQueue<String> q = new MyQueue<String>();
        assertEquals(true,q.isEmpty());
        q.enqueue("s1");
        q.enqueue("s2");
        assertEquals(false, q.isEmpty());
        q.clear();
        assertEquals(true, q.isEmpty());
    }
}
