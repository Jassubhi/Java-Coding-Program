import java.util.Arrays;

public class DiceRoll {

	public int Dice(int d) {
		int sum = 0;
		int[] arr = new int[d];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*6) + 1; 
			sum = sum + arr[i];
		}
		System.out.println("Number of Dice: "+ d + "\n" + "Dice values are:" + Arrays.toString(arr) + "\n" + "Sum:" + sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiceRoll dr = new DiceRoll();
		dr.Dice(6);
	}

}
