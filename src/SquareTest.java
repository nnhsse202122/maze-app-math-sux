
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SquareTest
{
    /**
     * Default constructor for test class SquareTest
     */
    public SquareTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAccessors()
    {
        Square sq = new Square(2, 3, Square.WALL);
        assertEquals(2, sq.getRow());
        assertEquals(3, sq.getCol());
        assertEquals(Square.WALL, sq.getType());
    }

    @Test
    public void testToString()
    {
        Square sq = new Square(2, 3, Square.WALL);
        assertEquals("#", sq.toString());
        sq = new Square(2, 3, Square.START);
        assertEquals("S", sq.toString());
        sq = new Square(2, 3, Square.EXIT);
        assertEquals("E", sq.toString());
        sq = new Square(2, 3, Square.SPACE);
        assertEquals("_", sq.toString());
    }

    @Test
    public void testEquals()
    {
        Square sq1 = new Square(2, 3, Square.WALL);
        Square sq2 = new Square(2, 3, Square.WALL);
        assertEquals(sq1, sq2);

        sq2 = new Square(3, 3, Square.WALL);
        assertNotEquals(sq1, sq2);

        sq2 = new Square(2, 2, Square.WALL);
        assertNotEquals(sq1, sq2);

        sq2 = new Square(2, 3, Square.SPACE);
        assertNotEquals(sq1, sq2);
    }
}
white_check_mark
eyes
raised_hands







Send a message to software-engineering










