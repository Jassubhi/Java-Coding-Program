
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10056;
		System.out.println("Number before reverse:" + num);
		reverse(num);
		System.out.println("Number after reverse:" + reverse(num));
	}
	
	private static int reverse(int num) {
		int reverse = 0;
		while(num !=0) {
			 int digit = num % 10;
			 reverse = reverse * 10 + digit;
			 num /= 10;
		}
		return reverse;
	}

}
