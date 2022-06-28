package likeFibo;

public class LikeFiboSolution {
	
	public static void main(String[] args) {
		
//		int[] numbers = {};
		//5 8 13 21 34 55
		String out = "invalid";
//		int[] numbers = {5, 8, 13, 21, 34, 55};//-V
//		int[] numbers = {1, 0, 1, 1, 2};//-V
//		int[] numbers = {1, 1, 2, 3, 6, 9};//-V
//		int[] numbers = {1, -1, 0, -1};//-V
		//5 5 10 15
//		int[] numbers = {5, 5, 10, 15};//-V
		int[] numbers = {6,12,18};
		boolean invalid = false;
		
		for(int i = 2; i < numbers.length; i++) {
			
			if(numbers[i] == numbers[i-2] + numbers[i-1]) {
				continue;
			}
			invalid = true;
			break;
			
		}
		
		if(!invalid) {
			out = (numbers[numbers.length-1] + numbers[numbers.length-2])+"";
		}
		
		System.out.println(out);
		
		
	}
	
}
