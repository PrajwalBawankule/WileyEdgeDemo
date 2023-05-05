package Lambda;

interface getInfo {
	Info getMsg(String str);
}
class Info{
	Info(String msg){
		System.out.println(msg);
	}
}
public class ConstructorMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getInfo info = Info::new;
		info.getMsg("hello");
	}

}
