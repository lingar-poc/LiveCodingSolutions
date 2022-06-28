package draft;

public class Try1 {
	public static String[] rows = {
//			"-rwxrwxrwx",
//			"-rwx------",
//			"-rw--w--wx",
//			"-rw-r-xr-x"
			};
	
	
	public static String[] rowsOld = {
//			"-rwxrwxrwx",
//			"-rwx------",
//			"-rw--w--wx",
//			"-rw-r-xr-x"
			};
	public static String[] result = null; 

	public static int getValue(char c) {
		if(c == 'r') {
			return 4;
		}
		else if(c == 'w') {
			return 2;
		}
		else if(c == 'x') {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	static void print(String s) {
		int sum =0 ;
		String printMe = "";
		int lastValue =1;
	
		
		for(int i =0; i< s.length();i++) {
			char myChar = s.charAt(i);
			if(myChar == '-') {
				continue;
			}
			int val = getValue(myChar);
			
			if(val < lastValue) {
				sum += val;
				
			}
			
			
			
			lastValue = val;
			
			
		}
		
		//loop from the first index check it vs the next
	}
	
	
	static void print3(String s) {
		int sum =0 ;
		String printMe = "";
	
		
		for(int i =1; i< s.length();i++) {
			char myChar = s.charAt(i);
			int val = getValue(myChar);
			sum +=val;
			
//			System.out.println((i-1)%3 == 0);
//			System.out.println( i >1);
			if((i)%3 == 0 && i >0) {
				printMe +=sum;
				sum =0;
//				System.out.println("adding - now print ln = " + printMe 
//						+"\n char is " + myChar);
			}
		}
		
		System.out.println(printMe);
		//loop from the first index check it vs the next
	}
	
	
	
	static void printOld(String s) {
		
	}
	
	public static void main(String[] args) {
		for(String s: rows) {
			print3(s);
		}
	}
	
	
	public static void assign(String s, int index) {
		
		int sum =0 ;
		String printMe = "";
	
		
		for(int i =1; i< s.length();i++) {
			char myChar = s.charAt(i);
			int val = getValue(myChar);
			sum +=val;
			
//			System.out.println((i-1)%3 == 0);
//			System.out.println( i >1);
			if((i)%3 == 0 && i >0) {
				printMe +=sum;
				sum =0;
//				System.out.println("adding - now print ln = " + printMe 
//						+"\n char is " + myChar);
			}
		}
		result[index] = printMe;
//		System.out.println(printMe);
		//loop from the first index check it vs the next
	}
	
	public static void testMe() {
		result = new String[rows.length];
		for (int i =0; i < rows.length; i++) {
			assign(rows[i], i);
		}

	}
	
	

}
