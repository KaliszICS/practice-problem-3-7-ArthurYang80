public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int searchMazeMoves(String[][] arr) {
        int startRow = arr.length - 1;
        int startCol = 0;
        
        int result = dfsHelper(arr, startRow, startCol, 0);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    
    public static int dfsHelper(String[][] arr, int curRow, int curCol, int noOfMoves) {
        
        if (curRow < 0 || curRow >= arr.length || curCol < 0 || curCol >= arr[0].length) {
            return -1;
        }
        
        if (arr[curRow][curCol].equals("F")) {
            return noOfMoves;
        }
        
        if (arr[curRow][curCol].equals("*")) {
            return -1;
        }
        
        String temp = arr[curRow][curCol];
        arr[curRow][curCol] = "*";
        
        int right = dfsHelper(arr, curRow, curCol + 1, noOfMoves + 1);
        int up = dfsHelper(arr, curRow - 1, curCol, noOfMoves + 1);
        int left = dfsHelper(arr, curRow, curCol - 1, noOfMoves + 1);
        int down = dfsHelper(arr, curRow + 1, curCol, noOfMoves + 1);
        
        arr[curRow][curCol] = temp;
        
        int minMoves = Integer.MAX_VALUE;
        
        if (right != -1 && right < minMoves) {
            minMoves = right;
        }
        if (up != -1 && up < minMoves) {
            minMoves = up;
        }
        if (left != -1 && left < minMoves) {
            minMoves = left;
        }
        if (down != -1 && down < minMoves) {
            minMoves = down;
        }
        
        if (minMoves != Integer.MAX_VALUE) {
            return minMoves;
        } else {
            return -1;
        }
    }
	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

}
