import java.io.File;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Maze {

    private Square[][] maze;
    


    boolean loadMaze(String fname)
    {
    try
    {
        File mazeFile = new File(fname);
        Scanner in = new Scanner(mazeFile);
        
        int numRows = in.nextInt();
        int numCols = in.nextInt(); // don't know if they can be read in as Int
       
        this.maze = new Square[numRows][numCols];

        for (int row=0; row < numRows; row++) {
            for (int col=0; col < numCols; col++) {
                this.maze[row][col] = new Square(row, col, in.nextInt());
            }
        }
        in.close();
        return true;
    }
    catch( IOException exception )
    {
        System.out.println( "The specified file: " + fname + " was not found." );
        return false;
    }
    catch( NoSuchElementException exception)
    {
        System.out.println("The File is invalid");
        return false;
    }

}

    ArrayList<Square> getNeighbors(Square sq)
    {
        //rows = this.maze.length;
        //cols = this.maze[0].length
        // this is the total, since, it starts at (0,0), the coordinate value for the actual squares is -1

        ArrayList<Square> neighbors = new ArrayList<Square>();

        if(sq.getRow() > 0)
        {
            neighbors.add(this.maze[sq.getRow()-1][sq.getCol()]);
        }
        if(sq.getCol() < this.maze[0].length - 1)
        {
            neighbors.add(this.maze[sq.getRow()][sq.getCol() +1]);
        }
        if(sq.getRow() < this.maze.length-1)
        {
            neighbors.add(this.maze[sq.getRow() + 1][sq.getCol()]);
        }
        if(sq.getCol() > 0)
        {
            neighbors.add(this.maze[sq.getRow()][sq.getCol()-1]);
        }

        return neighbors;
    }

    Square getStart()
    {
        for(int r = 0; r < this.maze.length; r++)
        {
            for(int c = 0; c < this.maze[0].length; c++)
            {
                if(maze[r][c].getType() == 2)
                {
                    return maze[r][c];
                }
            }
        }
        return null;
    }

    Square getFinish()
    {
        for(int r = 0; r < this.maze.length; r++)
        {
            for(int c = 0; c < this.maze[0].length; c++)
            {
                if(maze[r][c].getType() == 3)
                {
                    return maze[r][c];
                }
            }
        }
        return null;
    }

    void reset() // what are we reseting
    {
        for(int r = 0; r < this.maze.length; r++)
        {
            for(int c = 0; c < this.maze[0].length; c++)
            {
                this.maze[r][c].reset();
            }
        }
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int r = 0; r < this.maze.length; r++)
        {
            for(int c = 0; c < this.maze[0].length; c++)
            {
                sb.append(maze[r][c].toString());
            }
            sb.append("\n");
        }
        String s = new String(sb);
        return s;
    }
}
