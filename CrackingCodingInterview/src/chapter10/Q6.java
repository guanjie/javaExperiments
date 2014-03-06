package chapter10;

public class Q6 {
	public static int[] findNumber(int[][] matrix, int num){
		//We only need two constraints to trace our way to the number in the matrix. Two constraints.
		//We start from the last element form first row, then trace back on the same row. Until the number is less than the value, we hence move on to the next row, since there is no need to do the col--;
		int row = 0;
		int col = matrix[0].length-1;
		
		while(row < matrix.length && col >= 0){
			if(matrix[row][col] == num) break;
			else if(matrix[row][col] > num) col--;
			else if(matrix[row][col] < num) row++;
		}
		
		int[] returnValue = {row, col};
		return returnValue;
	}
}
