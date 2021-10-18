/**
 * Represents a single square in the maze.
 *
 * @author gcschmit
 * @version 1 June 2017
 */
public class Square
{

    public static final int SPACE = 0;
    public static final int WALL = 1;
    public static final int START = 2;
    public static final int EXIT = 3;
    
    /**
     * Constructor for objects of class Square
     */
    public Square( int row, int col, int type )
    {
    }

    /**
     * Returns this square's row
     *
     * @return    this square's row
     */
    public int getRow()
    {
    	return 0;
    }

    /**
     * Returns this square's column
     *
     * @return    this square's column
     */
    public int getCol()
    {
        return 0;
    }

    /**
     * Returns this square's type
     *
     * @return    this square's type
     */
    public int getType()
    {
        return 0;
    }
}