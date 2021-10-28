import java.util.ArrayList;

public abstract class MazeSolver {
    private Maze m;
    private String path;
    private boolean solved;
    private boolean valid;
    abstract void makeEmpty();
    
    abstract boolean isEmpty();

    abstract void add(Square sq);

    abstract Square next();
    
    public MazeSolver(Maze maze)
    {
        this.m = maze;
        this.solved = false;
        this.valid = false;
        this.makeEmpty();
        this.add(this.m.getStart());
    }

    public boolean isSolved()
    {
        return this.solved;
    }

    public String getPath()
    {
        if(this.isSolved())
        {
            return this.path;
        }
        else{
            return "No path";
        }
    }

    public Square step()
    {
        if(this.isEmpty())
        {
            this.solved = true;
            this.valid = false;
            return null;
        }
        Square working = this.next();
        if(working == this.m.getFinish())
        {
            this.solved = true;
            this.valid = true;
            Square current = working;
            while(current.getPrevious()!=null)
            {
                String s = this.path+ ","+ "[" + current.getCol() + ","+current.getRow()+"]";
                this.path = s;
                current = current.getPrevious();
            }
            return working;
        }
        ArrayList<Square> neighbors = this.m.getNeighbors(working);
        for(Square sq: neighbors)
        {
            if(!sq.getExplored())
            {
                this.add(sq);
                sq.setPrevious(working);
            }
        }
        working.explore();
        return working;
        

    }

    public void solve()
    {
        
    }
}
