import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add("How");
		al.add("Are");
		al.add("You");
		System.out.println("Size of Arraylist:" +al.size());
        System.out.println("While Loop:");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Advanced For Loop:");
        for(Object obj : al) {
            System.out.println(obj);
    }
        System.out.println("For Loop:");
        for(int i=0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }
		
	}

}
