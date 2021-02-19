
public class UpperLower {
	
	public void Changecase() {
		String str = "aAbBcCdD";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Old String:" + str);
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("New String:" + sb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperLower ul = new UpperLower();
		ul.Changecase();
	}

}
