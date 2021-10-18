Maze Lab

# Purpose

"In this lab you will use the power of a stack and a queue to explore and find your way through a maze. The purpose of this lab is to:

* Have you implement a stack and a queue,

* Build a simple linked list of nodes,

* Use your stack and queue to solve a maze,

* Explore the differences between the two solution strategies.

* Apply software team development best practices

# Requirements

* Complete the [CSCI 151 - Stacks and Queues Simply A-Maze-ing! lab](https://www.cs.oberlin.edu/~rhoyle/16s-cs151/lab03/index.html) from Oberlin.

* Changes from the lab as written for Oberlin:

    * The code is in the MazeApp folder in your current repository. You can skip all the steps under "starting point code"

    * You will use VS Code and not Eclipse.

    * You must implement the equals method for the Square class. Refer to [this article](https://www.sitepoint.com/implement-javas-equals-method-correctly/) for details on how to implement properly the equals method as it is more complicated than it appears.

    * Answer questions 2, 4, and 5 in Part 5 in your Canvas submission comment.

* You will work with a partner on this summative lab and demonstrate your understanding of using GitHub as a team

    * Commit to GitHub frequently, at least daily, with a meaningful commit message

    * You and your partner must create and use branches for your development as specified in the daily milestones

    * You and your partner must issue pull requests to incorporate changes in your branch into master

* Edit README.md in your repository to Include a reflection in which you reflect on you and your partners implementation of the GitHub best practices for team development. What did you or your partner do well? What do you or your partner need to improve next time? What would you do differently next time?

* This lab is recorded as two labs in the gradebook. One score is based on satisfying the requirements for the Maze lab. The other score is based on demonstrating GitHub best practices.

# Daily Milestones (will be checked daily by instructor)

1. (**Teammate A & B**) create square branch from master; implement Square class skeleton in square branch; implement Square class unit test; run tests (verify fails); implement Square class; run tests (verify passes); pull into master (**pair programming**)

2. (**Teammate A & B**) create mazeSkeleton branch from master; implement Maze class skeleton in mazeSkeleton branch; pull into master (**pair programming**)At the same time:

    * (**Teammate B**) create mazeTest branch from master; implement Maze unit test in mazeTest branch (NOTE:  There is a maze-invalid file that contains an improperly formatted maze and should be used in the test to ensure exceptions do not go unhandled.); run test (verify fails); pull into master

    * (**Teammate A**) create maze branch from master; implement Maze class in maze branch

(**Teammate A & B**) merge master into maze branch; run tests (probably fails); debug Maze class; run tests (verify passes); pull into master (**pair programming**)

3. At the same time:

    * (**Teammate A**) create stack branch from master; implement MyStack and MyStackTest in stack branch; run tests (verify passes); pull into master

    * (**Teammate B**) create queue branch from master; implement MyQueue and MyQueueTest (NOTE:  To avoid future headaches, ensure that the test thoroughly tests the Queue class. Specifically, make sure to test that the last element in the queue is successfully dequeued.) in queue branch; run tests (verify passes); pull into master

4. (**Teammate A & B**) create solver branch from master; implement MazeSolver in solver branch (**pair programming**)

5. At the same time:

    * (**Teammate A**) create stackSolver branch from solver (not master); implement MazeSolverStack in stackSolver branch

    * (**Teammate B**) create queueSolver branch from solver (not master); implement MazeSolverQueue in queueSolver branch

6. (**Teammate A & B**) tie up loose ends; pull both branches into solver; run tests (verify passes); uncomment all of the lines in MazeApp.java (refer to comment at the top of the file); test MazeApp by hand (verify functionality); pull into master

Your GitHub branching history should look similar to the following:

![image alt text](image_0.png)

# Extensions

* Try the bonus mazes.

* Add more awesome.

# Submission

* Submit a link to your GitHub repository with this assignment.

