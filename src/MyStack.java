import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyStack<T> implements StackADT<T>{
    private ArrayList<T> data;
    
    public MyStack()
    {
        data = new ArrayList<T>();
    }

    public void push(T item)
    {
        data.add(item);
    }
    public T pop() 
    {
        if(this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        int size = data.size();
        return data.remove(size-1);
    }
    public T top() 
    {
        if(this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        return data.get(data.size()-1);
    }
    public int size()
    {
        return data.size();
    }
    public boolean isEmpty()
    {
        return this.size() == 0;
    }
    public void clear()
    {
        data.clear();
    }
}
