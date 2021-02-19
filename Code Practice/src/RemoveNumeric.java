
public class RemoveNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "House1234Wall5678";
		System.out.println(str);
		str = str.replaceAll("[^A-Za-z]", "");
		System.out.println("String only:");
		System.out.println(str); 
	}

}
