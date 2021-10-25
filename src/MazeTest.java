import static org.junit.Assert.*;

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
        assertEquals(false,m.loadMaze("maze-invalid"));
        assertEquals(false, m.loadMaze("fake-maze"));
    }
    @Test
    public void testGetNeigbors()
    {
        Maze m = new Maze();
        boolean loaded = m.loadMaze("maze-2");
        assertEquals(true, loaded);
        ArrayList<Square> neigbors = new ArrayList<Square>();
        Square case1 = new Square(5,11,1);
        neigbors.add(new Square(4,11,1));
        neigbors.add(new Square(5,12,0));
        neigbors.add(new Square(6,11,3));
        neigbors.add(new Square(5,10,0));
        
        assertEquals(neigbors, m.getNeighbors(case1));
        neigbors.clear();
        Square case2 = new Square(6,3,0);
        neigbors.add(new Square(5,3,1));
        neigbors.add(new Square(6,4,2));
        neigbors.add(new Square(6,2,0));
        
        assertEquals(neigbors, m.getNeighbors(case2));
        neigbors.clear();
        Square case3 = new Square(0,0,0);
        neigbors.add(new Square(0,1,0));
        neigbors.add(new Square(1,0,1));
        assertEquals(neigbors, m.getNeighbors(case3));
    }
    @Test
    public void testStartFinish()
    {
        Maze m = new Maze();
        boolean loaded = m.loadMaze("maze-2");
        assertEquals(true,loaded);
        Square start = new Square(6,4,2);
        assertEquals(start,m.getStart());
        Square finish = new Square(6,11,3);
        assertEquals(finish,m.getFinish());
    }
    @Test
    public void testToString()
    {
        String expected = "______#______\n##_#######_#_\n_#_________#_\n_#_##__###_#_\n___#_____#_#_\n_#####_#_#_#_\n____S__#__#E_";
        Maze m = new Maze();
        boolean loaded = m.loadMaze("maze-2");
        assertEquals(true, loaded);
        assertEquals(expected,m.toString());
    }
    @Test
    public void testReset()
    {
        
    }
}
