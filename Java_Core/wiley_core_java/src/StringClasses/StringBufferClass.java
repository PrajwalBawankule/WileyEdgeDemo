package StringClasses;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Wiley");
		StringBuffer sb1 = new StringBuffer("Wiley");
		StringBuffer sb2 = new StringBuffer("Wiley");
		System.out.println(sb1==sb2);
		System.out.println(sb.equals(sb1));
		System.out.println(sb);
		
		String s = "Wiley";
		System.out.println(s.equals(sb));
		System.out.println(s.equals(sb.toString()));
		sb.append("Program");
		System.out.println(sb);
		sb.insert(5,"_");
		System.out.println(sb);
//		sb.insert(14,"1");
//		System.out.println(sb);
		sb.insert(13,"1");
		System.out.println(sb);
		System.out.println(sb.delete(5, 9));
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
	}

}
