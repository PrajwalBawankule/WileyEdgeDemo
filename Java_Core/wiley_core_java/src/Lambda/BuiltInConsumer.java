package Lambda;

import java.util.function.BiConsumer;

public class BuiltInConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiConsumer<Integer,Integer> el = (Integer age,Integer percent) -> {
			if(age>18 && percent>75) {
				System.out.println("You are eligible");
			}
			else {
				System.out.println("You are not eligible");
			}
		};
		
		el.accept(12,78);
		el.accept(21, 88);
	}

}
