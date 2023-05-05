package Lambda;

import java.util.function.Supplier;

public class BuiltInSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> msg = () -> "Hello";
		System.out.println(msg.get());
	}

}
