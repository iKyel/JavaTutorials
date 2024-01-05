
public class JavaMethods {

	public static void main(String[] args) {
		String name = "Bro";
		hello(name);
		int x = 3, y = 4;
		System.out.println(sum(x,y));
	}
	
	static void hello(String name) {
		System.out.println("Hello "+name);
	}
	static int sum(int x, int y) {
		return x+y;
	}

}
