package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UtilityClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,6,3,7,5,4,3,2,8,7,3};
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(3);
		a1.add(4);
		a1.add(1);
		Collection.sort(a1);
		System.out.println(a1);
		

	}

}
