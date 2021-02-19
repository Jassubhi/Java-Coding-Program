import java.util.ArrayList;
import java.util.Collections;

public class GamingRank {

	public static int levelUp(int k, ArrayList<Integer> score) {
        if(k <= 0) return 0;
        Collections.sort(score, Collections.reverseOrder());
        int rank = 1;
        int res = 0;
        for(int i = 0; i < score.size(); i++) {
            if(i == 0) {
                rank = 1;
            } else if(score.get(i) != score.get(i - 1)) {
                rank = i + 1;
            }
            if(rank <= k && score.get(i) > 0) res++;
            else break;
        }
        return res;
    }	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(10);
		s.add(0);
		s.add(10);
		s.add(25);
		int k = 3;
		//int n = 4;
		System.out.println(levelUp(k,s));
		
	}

}
