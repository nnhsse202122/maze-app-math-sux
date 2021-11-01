public class Square
{
    public static final int SPACE = 0;
    public static final int WALL = 1;
    public static final int START = 2;
    public static final int EXIT = 3;
    
    private int type;
    private int row;
    private int col;
    private boolean explored;
    private Square previous;
    private boolean onWorkList;
    private boolean onFinalPath;
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
        this.explored = false;
        this.previous = null;
        this.onWorkList = false;
        this.onFinalPath = false;
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
    public boolean getExplored()
    {
        return this.explored;
    }
    public void explore()
    {
        
        this.explored = true;
    }
    public void putOnWorklist()
    {
        this.onWorkList = true;
    }
    public void putOnFinalPath()
    {
        this.onFinalPath = true;
    }
    public Square getPrevious()
    {
        return this.previous;
    }

    public void setPrevious(Square sq)
    {
        this.previous = sq;
    }

    @Override
    public String toString()
    {
        String str = null;

        switch(this.getType())
        {
            case Square.SPACE:
            {
                if(!this.getExplored() && !this.onWorkList){
                    str = "_";
                }
                if(this.onWorkList && !this.getExplored()){
                    str = "█";
                }
                if(this.getExplored()){
                    str = "▒";
                }
                if(this.onFinalPath){
                    str = "X";
                }
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
    public void reset(){
        this.explored = false;
        this.previous = null;
        this.onWorkList = false;
        this.onFinalPath = false;
    }
}


