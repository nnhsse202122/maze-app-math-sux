public class MazeSolverStack extends MazeSolver{
    
    private MyStack<Square> workingList;
    
    public MazeSolverStack(Maze maze)
    {
        super(maze);
    }
    public void add(Square sq) {
        workingList.push(sq);
    }
    
    public void makeEmpty()
    {
        workingList = new MyStack<Square>();
    }
    
    public boolean isEmpty()
    {
       return workingList.isEmpty();
    }


    public Square next()
    {
        return workingList.pop();
    }
}
