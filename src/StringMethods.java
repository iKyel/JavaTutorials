
public class StringMethods {

	public static void main(String[] args) {
		String name = "  Coding  ";
		boolean result1 = name.equals("bro"); // name.equals trả về true or false
		boolean result2 = name.equalsIgnoreCase("bro"); // equalsIgnoreCase không phân biệt hoa và thường
		System.out.println("Kết quả của equals là: "+result1);
		System.out.println("Kết quả của equalsIgnoreCase là: "+result2);
		
		int dodai = name.length(); // trả về độ dài
		System.out.println("Độ dài của name là: "+dodai);
		
		char character = name.charAt(0); // trả về kí tự trong string
		System.out.println("Kí tự thứ 0 là: "+character);
		
		int index = name.indexOf("r"); // Trả về vị trí của kí tự
		System.out.println("Vị trí của kí tự 'r' là: "+index);
		
		boolean empty = name.isEmpty();
		System.out.println("Kiểm tra name rỗng: "+empty);
		
		String NAME = name.toUpperCase(); // In hoa tất cả kí tự
		System.out.println("Sau khi in hoa: "+NAME);
		
		String NAME2 = name.toLowerCase(); // In thường tất cả kí tự
		System.out.println("Sau khi in thường là: "+NAME2);
		
		String NameAfterRemoveSpace = name.trim(); // Xoá tất cả kí tự khoảng trắng 
		System.out.println("Sau khi xoá khoảng trắng: "+NameAfterRemoveSpace);
		
		String name2nd = name.replace('o', 'a'); // Thay thế tất vả kí tự 'o' thành 'a'
		System.out.println("Sau khi thay thế 'o' = 'a': "+name2nd);
		}

}
