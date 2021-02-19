import java.util.Arrays;

public class Array_sum {
	
	public void SumPair() {
		int[] arr= {1,2,3,4,5,6};
		for(int i=0; i < arr.length; i++) {
			for(int j=i+1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				for (int element: arr) {
					if (sum == element) {
						int[] arr2 = {arr[i], arr[j], sum};
						System.out.println(Arrays.toString(arr2));
					    //System.out.println(arr[i]+ " " + arr[j]+ " " + sum);
					}
			      }
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_sum obj = new Array_sum();
		obj.SumPair();
	}

}
