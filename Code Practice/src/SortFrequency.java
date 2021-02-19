import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class SortFrequency {

	public static void main(String[] args) {
		
		// Declare and Initialize an array 
		int[] array = {3, 4, 4, 5, 4, 3, 3, 1, 3, 2, 2};
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		List<Integer> output = new ArrayList<Integer>();
		
		// Assign elements and their count in the list and map 
		for(int current: array) {
			int count =  hmap.getOrDefault(current, 0);
			hmap.put(current, count + 1);
			output.add(current);
		}
		
		SortComparator comp =  new SortComparator(hmap);
		
		Collections.sort(output, comp);
		
		// Final Output 
	    for (Integer i : output) { 
	         System.out.print(i + " "); 
	    } 
		
	}

}

class SortComparator implements Comparator<Integer> { 
    private final Map<Integer, Integer> freqMap; 
  
    // Assign the specified map 
    SortComparator(Map<Integer, Integer> tFreqMap) 
    { 
        this.freqMap = tFreqMap; 
    } 
  
    // Compare the values 
    @Override
    public int compare(Integer k1, Integer k2) 
    { 
  
        // Compare value by frequency 
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1)); 
  
        // Compare value if frequency is equal 
        int valueCompare = k1.compareTo(k2); 
  
        // If frequency is equal, then just compare by value, otherwise - 
        // compare by the frequency. 
        if (freqCompare == 0) 
            return valueCompare; 
        else
            return freqCompare; 
    } 
} 
