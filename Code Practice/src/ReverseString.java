
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String blogName = "how to do in java dot com";
		 
		//spilt on white space
		String[] tokens = blogName.split(" ");
		 
		//It will store reversed words 
		StringBuffer finalString = new StringBuffer();
		 
		//Loop all words and reverse them
		for (String token : tokens) {
		    String reversed = new StringBuffer(token).reverse().toString();
		    finalString.append(reversed);
		    finalString.append(" ");
		}
		 
		//Check final string
		System.out.println(finalString.toString()); 
	}

}
