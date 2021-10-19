import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
public class MazeTest {
    public MazeTest()
    {

    }
    @Test
    public void testLoadMaze()
    {
        Maze m = new Maze();
        assertEquals(true,m.loadMaze("maze-2"));
    }
    @Test
    public void testGetNeigbors()
    {
        Maze m = new Maze();
        m.loadMaze("maze-2");
        ArrayList<Square> neigbors = new ArrayList<Square>();
        
    }
}
