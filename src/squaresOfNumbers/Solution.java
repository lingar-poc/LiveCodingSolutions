package squaresOfNumbers;

public class Solution {

	public static void main(String args[]) {
		
		int[] iX = {1, 7, -10};
		int sum = 0;
        for (int i = 0; i < iX.length; i++) {
        	
        	sum += iX[i]*iX[i];
        	
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum);
    }
}
