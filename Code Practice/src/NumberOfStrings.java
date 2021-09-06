import java.util.HashMap;
public class NumberOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Don't let what you cannot do interfere with what you can do";
		HashMap<String,Integer> hmap = new HashMap<>();
		String[] strarr = str.split(" ");
		
		for(int i = 0; i < strarr.length; i++) {
			if(hmap.containsKey(strarr[i])) {
				hmap.put(strarr[i], hmap.get(strarr[i])+1);
			}
			else {
				hmap.put(strarr[i], 1);
			}
		}
		System.out.println(hmap);
	}

}
