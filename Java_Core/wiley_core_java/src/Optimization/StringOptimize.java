package Optimization;

//string concatenation creates new object each time it is used

// efficient way is stringbuilder
public class StringOptimize {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		String s = "";
		for(int i=0;i<100000;i++) {
			s+=1;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken to add values = "+(end-start));
		
		long start2 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<100000;i++) {
			sb.append(i);
		}
		long end2 = System.currentTimeMillis();
		System.out.println("Time taken to add values = "+(end2-start2));
	
	}
}
