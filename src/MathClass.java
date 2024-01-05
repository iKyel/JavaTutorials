import java.util.Scanner;
public class MathClass {

	public static void main(String[] args) {
	/*
		double x = 3.14;
		double y = -10;
		
		double z = Math.min(x,y);
		System.out.println(z);
		
		z = Math.max(x, y);
		System.out.println(z);
		
		z = Math.abs(y);
		System.out.println(z);
		
		z = Math.sqrt(x);
		System.out.println(z);
		
		z = Math.round(x); // Số nguyên dưới gần nhất
		System.out.println(z);
		
		z = Math.ceil(x); // Số nguyên trên gần nhất
		System.out.println(z);
	*/
		
		double x;
		double y;
		double z;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side x = "); x = scanner.nextDouble();
		System.out.println("Enter side y = "); y = scanner.nextDouble();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotenuse z = "+z);
		
		scanner.close();
	}

}
