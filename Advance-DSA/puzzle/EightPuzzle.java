/****************************************************************************************
Name            :  EightPuzzle 
Revision Log    : 2015-10-05: Subhash Chander : created.
               : 
               : 
Use             : This class is used to solve puzzle
               :
 ****************************************************************************************/
package puzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class EightPuzzle implements Comparable<EightPuzzle> {

    private final static int N = 3;
    private final static String[] names = { "   ", "  1", "  2", "  3", "  4",
            "  5", "  6", "  7", "  8" };
    private static int totalEnqueued;
    private final static int[][] solved = { { 1, 2, 3 }, { 4, 5, 6 },
            { 7, 8, 0 } };
    private int moves;
    private int[][] tiles;
    private EightPuzzle parent;
    private int priority;
    private int distance;
    int zeroLocX = 0;
    int zeroLocY = 0;
    /**
	 * EightPuzzle method : allocate separate memory for new tiles array
	 * @param: array  : 2d  array
	 * */
    EightPuzzle(int[][] tiles) {
        this.tiles = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                this.tiles[i][j] = tiles[i][j];

    }
    /**
   	 * EightPuzzle method : allocate separate memory for new tiles array
   	 * @param: array  : 2d  array
   	 * */
    EightPuzzle(int[][] tiles, EightPuzzle parent, int moves) {
        this.tiles = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                this.tiles[i][j] = tiles[i][j];
        this.parent = parent;
        this.moves = moves;
        priority();
    }
    /**
   	 * priority method : get priority 
   	 * @param: periority  : 2d  array
   	 * */
    public int priority() {
        int manhatDist = 0;
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++) {
                switch (tiles[x][y]) {

                case 1:
                    manhatDist += posDiff(x, y, 0, 0);
                    break;
                case 2:
                    manhatDist += posDiff(x, y, 0, 1);
                    break;
                case 3:
                    manhatDist += posDiff(x, y, 0, 2);
                    break;
                case 4:
                    manhatDist += posDiff(x, y, 1, 0);
                    break;
                case 5:
                    manhatDist += posDiff(x, y, 1, 1);
                    break;
                case 6:
                    manhatDist += posDiff(x, y, 1, 2);
                    break;
                case 7:
                    manhatDist += posDiff(x, y, 2, 0);
                    break;
                case 8:
                    manhatDist += posDiff(x, y, 2, 1);
                    break;
                case 0:
                    manhatDist += posDiff(x, y, 2, 2);
                    break;
                default:
                    break;
                }

            }
        this.priority = manhatDist + moves;
        return priority;
    }

    private int posDiff(int xPos, int yPos, int xGoal, int yGoal) {
        int diff = Math.abs(xPos - xGoal);
        diff += Math.abs(yPos - yGoal);

        return diff;
    }
 
    @Override
    public int compareTo(EightPuzzle b) {
        if (b.distance() == distance()) {
            for (int i = 0; i < N; i++) {
                if (!(Arrays.equals(b.getBoard()[i], this.getBoard()[i]))) { 
                	if (b.priority() > priority()) 
                        return -1;
                    return 1;
                }
            }
            return 0;
        } else if (b.priority() > priority()) 
            return -1;
        else
            return 1;
    }

    /**
     * @return
     */
    public int[][] getBoard() {
        return tiles;
    }

    /**
   	 * isSolved method : does board position equal goal position?
   	 * @return: boolean output
   	 * */
    public boolean isSolved() {
        for (int i = 0; i < N; i++) {
            if (!(Arrays.equals(tiles[i], solved[i]))) {
                return false;
            }

        }
        return true;
    }

    /**
   	 * findGoalState method : for NxN expansion 
   	 * */
    public int[][] findGoalState() {
        int[][] solved = new int[N][N];
        int nums = 1;

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                solved[i][j] = nums;
                nums++;
                if (nums == (N * N)) {
                    solved[N - 1][N - 1] = 0;
                    break;
                }
            }
        return solved;
    }
    /**
   	 * distance method : return sum of Manhattan distances of tiles to their proper position
   	 * 
   	 * */
    private int distance() {
        this.distance = priority() - moves;
        return this.distance;
    }

    private int getZeroXLoc() {
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                if (tiles[x][y] == 0) {
                    zeroLocX = x; 
                    zeroLocY = y;
                }
        return zeroLocX;
    }

    private int getZeroYLoc() {
        getZeroXLoc();
        return zeroLocY;
    }

    private void assignZeroLoc() {
        getZeroYLoc();
    }

    /**
   	 * neighbors method :return the neighboring board positions
   	 * */
    public EightPuzzle[] neighbors() {
        ArrayList<EightPuzzle> tempneighbors = new ArrayList<EightPuzzle>();

        assignZeroLoc(); 

        for (int i = -1; i < 2; i++) { 
            int p = zeroLocX + i; 
            if (p < 0 || p > N - 1)
                continue; 
            for (int j = -1; j < 2; j++) {
                int q = zeroLocY + j;
                if (q < 0 || q > N - 1 || (p == zeroLocX && q == zeroLocY) ||   ((Math.abs(zeroLocX - p) + Math.abs(zeroLocY - q))) > 1) //or if delta x + delta y is greater than 1, aka at a diagonal space
                    continue; 

                int[][] temptiles = new int[N][N];

                for (int m = 0; m < N; m++)
                    temptiles[m] = Arrays.copyOf(tiles[m], N);

                int tempQ = temptiles[p][q]; 
                temptiles[p][q] = 0; 
                temptiles[zeroLocX][zeroLocY] = tempQ; 
                EightPuzzle neighbor = new EightPuzzle(temptiles, this,
                        this.moves + 1); 
                tempneighbors.add(neighbor); 
                totalEnqueued++;

            }

        }

        EightPuzzle[] neighbors = new EightPuzzle[tempneighbors.size()];

        return tempneighbors.toArray(neighbors);
    }

    public void showPath() {
        if (parent != null)
            parent.showPath();
        System.out.println("Move #" + moves + " Priority = " + priority);
        System.out.println(toString());
    }

    /**
   	 * toString method :print details of puzzle
   	 * */
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                s += names[tiles[i][j]] + " ";
            s += "\n";
        }
        return s;
    }

    public boolean isSolvable() {
        int[] row = new int[(N * N) - 1];
        int rowIndex = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tiles[i][j] != 0) {
                    row[rowIndex] = tiles[i][j];
                    rowIndex++;
                }
            }
        }

        int inversions = 0;
        for (int x = 0; x < row.length; x++) {
            for (int y = x; y < row.length; y++)
                if (row[x] > row[y])
                    inversions++;
        }
        return inversions % 2 == 0;
    }

    @SuppressWarnings("unused")
	public static void main(String[] args) {

        int[][] easy0 = { { 1, 2, 3 }, { 7, 0, 5 }, { 8, 4, 6 } }; 
        int[][] hard0 = { { 0, 8, 7 }, { 2, 5, 1 }, { 3, 6, 4 } };  
        int[][] hard1 = { { 4, 5, 0 }, { 6, 8, 7 }, { 1, 2, 3 } };  
        int[][] medium0 = { { 2, 3, 1 }, { 7, 0, 8 }, { 6, 5, 4 } };  
        int[][] medium1 = { { 1, 2, 3 }, { 8, 0, 4 }, { 7, 6, 5 } };  
        int[][] medium2 = { { 1, 2, 3 }, { 7, 0, 4 }, { 8, 6, 5 } };  
         int[][] twentytwo = { {4, 8, 2},
                 {3, 6, 5},
                 {1, 7, 0} };

        System.out.println("Please enter the 3x3 grid in the format \n\"XXX \n XXX  \n XXX\" where X is a number between 0 and 8");
        Scanner scan = new Scanner(System.in);
		int userEntered = 0;
        int[][] userIn = new int[N][N];
        userIn = easy0;
     
        EightPuzzle x = new EightPuzzle(userIn);
        System.out.println(x);

        ArrayList<EightPuzzle> pq = new ArrayList<EightPuzzle>();
        pq.add(x);
      

        int nodes = 0;
        ArrayList<EightPuzzle> seen = new ArrayList<EightPuzzle>(); 
        while (!pq.isEmpty()) {
        	ArrayList<EightPuzzle> ar = pq;
        	Collections.sort(ar);
        	 x= ar.get(0);
            pq.remove(ar.get(0));  
           
            if (nodes == 0) {
                if (!x.isSolvable()) {
                    System.out.println("This is an unsolvable puzzle, please enter a solvable one");
                    System.exit(0);
                }
            }
            nodes++;
 
            for (int i = 0; i < seen.size(); i++) {  
                if (x.compareTo(seen.get(i)) == 0) {
                	ar = pq;
                	Collections.sort(ar);
                	 x= ar.get(0);
                    pq.remove(ar.get(0)); 
                   
                }
            }

            seen.add(x);  

            if (x.isSolved()) { 
                break;
            }

            EightPuzzle[] neighbors = x.neighbors();  
            for (int i = 0; i < neighbors.length; i++)
                if (!(x.compareTo(neighbors[i]) == 0)
                        && neighbors[i].isSolvable())
                    pq.add(neighbors[i]);

        }
        System.out.println("Total nodes enqueued = " + totalEnqueued);
        System.out.println("Nodes expanded = " + nodes);
        x.showPath();
    }

}