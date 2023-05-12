package Optimization;

public class StrengthReduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
		int [] arr = {1,2,3,4};
		for(int i=0; i<arr.length;i++) {
			int s = arr[i]*arr[i];
			sum+=s;
		}
		System.out.println(sum);
	}

}
