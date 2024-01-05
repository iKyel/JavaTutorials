import java.util.ArrayList;

public class ArraysList {

	public static void main(String[] args) {
		// Sử dụng kiểu dữ liệu wrapper, exp: ArrayList<Integer>
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Hamburger");
		food.add("Hotdog");
		
		// method
		food.set(0, "Sushi"); // Thay thế element tại vị trí 0
		food.remove(0); // Xoá element
		//food.clear(); // Xoá toàn bộ
		for(int i=0; i<food.size(); i++) {
			System.out.println(food);
		}
	}

}
