package browserInput;

import java.util.Scanner;
/**
 *  Goal
You must automate a search bar for your browser software. If the user's input contains a dot "." then it's a www site and you redirect it to http://input
Else, redirect to ftp://input

If the input already contains http://, ftp:// or https:// do not redirect to anything else.


 * @author lingar
 *
 */
public class Solution {

	public static void main(String args[]) {
		System.out.println("Write here the input you want to check. (See at assets the details)");
		Scanner in = new Scanner(System.in);
		String urlbar = in.nextLine();
		
		String valid = getValidInput(urlbar);

		// Write an answer using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println(valid);
	}

	public static String getValidInput(String input) {

		if (!(input.contains("http://") || input.contains("https://") || input.contains("ftp://"))) {
			if (input.contains(".")) {
				input = "http://" + input;
			}
			else {
				input = "ftp://" + input;
			}
		}
		return input;
	}
}