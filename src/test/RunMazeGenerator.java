package test;
import algorithms.mazeGenerators.*;

public class RunMazeGenerator {
    public static void main(String[] args) throws Exception {
        //testMazeGenerator(new EmptyMazeGenerator());
        //testMazeGenerator(new SimpleMazeGenerator());
        testMazeGenerator(new MyMazeGenerator());
    }
    private static void testMazeGenerator(IMazeGenerator mazeGenerator) throws Exception {
        // prints the time it takes the algorithm to run
        System.out.println(String.format("Maze generation time(ms): %s", mazeGenerator.measureAlgorithmTimeMillis(100/*rows*/,100/*columns*/)));
        // generate another maze
        Maze maze = mazeGenerator.generate(255/*rows*/, 1000/*columns*/); //todo change
        // prints the maze
        //maze.print();
        byte[] by = maze.toByteArray(); //todo delete
        Maze m = new Maze(by); //todo delete
        System.out.println("----"); //todo delete
        m.print(); //todo delete

        // get the maze entrance
        Position startPosition = maze.getStartPosition();
        // print the start position
        System.out.println(String.format("Start Position: %s", startPosition)); // format "{row,column}"
        // prints the maze exit position
        System.out.println(String.format("Goal Position: %s", maze.getGoalPosition()));
    }
}
