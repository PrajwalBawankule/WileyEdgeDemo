package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = {1,2,3,4,5,6};
//		int sum =0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				sum+=arr[i];
//			}
//		}
//		System.out.println(sum);
//		
//		int[] array = {1,2,3,4,5,6};
//		int total = Arrays.stream(array).filter(n -> n%2==0);
//		
	//Stream creation approaches
		//1
//		List<String> list = Arrays.asList("Java","Python","C","Angular");
//		Stream<String> myStream = list.stream();
//		
//		//2
//		String[] arr = {"java","Python","Angular"};
//		Stream<String> myStreamarr = Arrays.stream(arr);
//		
//		
//		//3
//		Stream<Integer> integerStream = Stream.of(1,2,3);
//		
//		//4
//		Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(10);
//		
//		//5
//		Stream<String> limitString = Stream.generate(() -> "Wiley").limit(5);
//		
//		//6
//		Stream<Integer> limitRandom = Stream.generate(() -> (int)Math.random()).limit(5);
//		
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,88,55,44,213,4567);
//		List<Integer> filterData = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
//		System.out.println(filterData);
//		
//		List<Integer> mappedList = filterData.stream()
//				.map(n -> n/2)
//				.collect(Collectors.toList());
//		System.out.println(mappedList);
		
		//or
		List<Integer> filterData = list.stream()
				.filter(n -> n%2==0)
				.map(n -> n/2)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(filterData);
		
	}

}
