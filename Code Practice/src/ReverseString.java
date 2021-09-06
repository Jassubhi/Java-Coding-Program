
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Watermelon";
		reverseString(str);
		reverseString2(str);
		System.out.println("reverse string 3: " + reverseString3(str));
	}
	
	public static void reverseString(String s1) {
		String reverse = "";
		for(int i = s1.length()-1; i >= 0; i--) {
			reverse =  reverse + s1.charAt(i);
		}
		System.out.println("Reverse string 1: " + reverse);
	}
	
	public static void reverseString2(String s2) {
		StringBuffer sb = new StringBuffer(s2);
		sb.reverse();
		System.out.println("Reverse string 2 with reverse method : " + sb);
	}
	
	public static String reverseString3(String s3) {
		if(s3.isEmpty()) {
			return s3;
		}
		return reverseString3(s3.substring(1)) + s3.charAt(0);
	}

}
