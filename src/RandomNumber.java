import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(6);	// between 0 and 5
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
