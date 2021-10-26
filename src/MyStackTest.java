import static org.junit.Assert.*;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void testPushPopTop()
    {
        MyStack<String> s = new MyStack<String>();
        assertEquals(true, s.isEmpty());
        s.push("A");
        s.push("B");
        assertEquals(false, s.isEmpty());
        assertEquals("B", s.top());
        String d = s.pop();
        assertEquals("B", d);
        assertEquals("A", s.pop());
        assertEquals(true, s.isEmpty());
    }

    @Test
    public void testSizeEmptyClear()
    {
        MyStack<String> z = new MyStack<String>();
        assertEquals(true, z.isEmpty());
        assertEquals(0, z.size());
        z.push("A");
        z.push("B");
        assertEquals(false, z.isEmpty());
        assertEquals(2, z.size());
        z.clear();
        assertEquals(true, z.isEmpty());
        assertEquals(0, z.size());

        
    }
}
