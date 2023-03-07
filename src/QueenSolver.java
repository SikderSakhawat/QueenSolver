import java.util.ArrayList;
/* Requirements for a successful n-queen puzzle:
- Queens need to have a knight opposition with at least 1 other queen
- each queen needs a unique row and column
- each queen cannot be in a diagonal, row, or column of another queen

for every queen placed in a certain element, we need to find every available area for another queen (basically move in an L shape)
cross out any area the queen CAN move to (so any other queen isn't there)
traverse through the array and place a queen in any place that isnt crossed out
 - we keep doing this until it is either unsolvable or is solvable
 - IF num queens is < n and num free spaces left is 0, unsolvable
 - available spaces = 0 and num queens = n, then its solvable
 */
public class QueenSolver {
    private String[][] bob;
    private ArrayList<String[][]> allSolutions;
    private int n;
    private int availableSpaces;

    public QueenSolver() {
        for(int i = 0; i < bob.length; i++){
            for(int j = 0; j < bob[i].length; i++){

            }
        }
    }
    public int fourByFourSolver(int n) {
        bob = new String[n][n];
        for (int row = 0; row < bob.length; row++) {
            for (int col = 0; col < bob.length; col++) {
                if (bob[row][col] == null) {
                    bob[row][col] = "Q";
                }
            }
        }

    }
    public int getAvailableSpaces() {
        availableSpaces = n * n;
        for (String[] row : bob) {
            for (String col : row) {
                if (!(col == null)) n--;
            }
        }
        return availableSpaces;
    }

    public int numQueens(){
        int sum = 0;
        for (String[] row : bob) {
            for (String col : row) {
                if (col.equals("Q")) sum++;
            }
        }
        return sum;
    }
    public void killDiags(){

    }

    public void killRowCol(int row, int column){
        for(int i = 0; i < n; i++){
            if(bob[row][i]bob[row]
        }
    }
}
