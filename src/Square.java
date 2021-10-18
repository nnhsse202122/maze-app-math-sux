public class Square
{
    public static final int SPACE = 0;
    public static final int WALL = 1;
    public static final int START = 2;
    public static final int EXIT = 3;
    
    private int type;
    private int row;
    private int col;

    /**
     * Constructor for objects of class Square
     * 
     * @param initialRow    the row for this Square in the Maze
     * @param initialCol    the column for this Square in the Maze
     * @param initialType   the type (space, wall, start, exit) for this
     *                          Square in the Maze
     */
    public Square(int initialRow, int initialCol, int initialType)
    {
        this.row = initialRow;
        this.col = initialCol;
        this.type = initialType;
    }

    public int getType()
    {
        return this.type;
    }

    public int getRow()
    {
        return this.row;
    }

    public int getCol()
    {
        return this.col;
    }

    @Override
    public String toString()
    {
        String str = null;

        switch(this.getType())
        {
            case Square.SPACE:
            {
                str = "_";
                break;
            }
            case Square.WALL:
            {
                str = "#";
                break;
            }
            case Square.START:
            {
                str = "S";
                break;
            }
            case Square.EXIT:
            {
                str = "E";
                break;
            }
        }

        return str;
    }

    @Override
    public boolean equals(Object other)
    {
        // self check
        if(this == other)
        {
            return true;
        }

        // null check
        if(other == null)
        {
            return false;
        }

        // type check
        if(this.getClass() != other.getClass())
        {
            return false;
        }

        Square otherSq = (Square)other;

        // field comparision
        return (this.row == otherSq.row) &&
                (this.col == otherSq.col) &&
                (this.type == otherSq.type);
    }
}


