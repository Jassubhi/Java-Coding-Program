
public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We will study to night";
		System.out.println(str);
		String[] arr = str.split(" ");
		for(String a:arr) {
			System.out.println(a);
		}
		String str2 = "";
		for(String a:arr) {
			str2 += a + " ";
		}
		System.out.println(str2);
				
	}

}
