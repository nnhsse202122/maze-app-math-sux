public class Maze {

    public Maze()

    private Square[][] maze;

    {

    }

    boolean loadMaze(String fname)
{
    try
    {
    File mazeFile = new File(fname);
    Scanner in = null;
    
    //...

    }
catch( IOException exception )
    {
    System.out.println( "The specified file: " + fname + " was not found." );
    return false;
    }

}

    ArrayList<Square> getNeighbors(Square sq)
    {


    }

    Square getStart()
{

}

    Square getFinish()
    {

    }

    void reset()
    {

    }
    
    String toString()
    {

    }
}
