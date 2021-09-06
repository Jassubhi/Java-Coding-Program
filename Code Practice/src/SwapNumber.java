
public class SwapNumber {

	int x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(2,5);
	}
	
	private static void swap(int x, int y) {
		System.out.println("Numbers before swap is: "+ x + " and " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Numbers after swap is: "+ x + " and " + y);
	}

}
