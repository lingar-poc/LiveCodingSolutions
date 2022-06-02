package bingoCard5;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String card = in.nextLine();
        String winningNumbers = in.nextLine();

        
        String[] cardNumbers = card.split(" ");
        String[] winningNumbers2 = winningNumbers.split(" ");
        
        boolean[] matches = new boolean[9];
        
        for (int i = 0; i <9; i++) {
        	if(cardNumbers[i].equals(winningNumbers2[i])) {
        		matches[i] = true;
        	}
        }
        
        int bingos = findBingo(matches);
        System.out.println("Mathces = " + Arrays.toString(matches));
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("bingos = " + bingos);
    }
    
    public static int findBingo(boolean[] matches) {
    	
    	int bingos =0;
    	
    	//check horizontal bingos:    	
    	for(int i = 0; i < matches.length; i= i+3) {
    		
    		if(matches[i] && matches[i+1] && matches[i+2]) {
    			bingos++;
    		}
    	}
    	
    	//check vertical bingos:
    	for(int i = 0; i < 3; i++) {
    		if(matches[i] && matches[i+3] && matches[i+6]) {
    			bingos++;
    		}
    	}
    	
    	//check diagonal bingos
    	
    	if (matches[0]&& matches[8]) {
    		bingos++;
    	}
    	
    	if (matches[2]&& matches[6]) {
    		bingos++;
    	}
    	
    	
    	return bingos;
    }
    
}