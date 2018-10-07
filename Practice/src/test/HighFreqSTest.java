package test;

import java.util.ArrayList;
import java.util.List;

import numbers.KDiffPair;
import strings.StringFinder;

public class HighFreqSTest {

	public static void main(String[] args) {

		StringFinder sf = new StringFinder();
		
		String[] strings = {"hello", "hello1", "zxy","hello2", "hello2", "hello", "hellow3", "zxy", "", null, "", "", ""};
		
		System.out.println(sf.getHighFreqString(strings));
		
		List<String> s = new ArrayList<String>();
		s.size();
		
		System.out.println(oddNumbers(2, 5));
		
		try {
			Class.forName("numbers.KDiffPair");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static List<Integer> oddNumbers(int l, int r) {
        
        List<Integer> odds = new ArrayList();
        if(l%2 == 0){
            int k=l+1;
            while(k+2 <= r){
                odds.add(k);
                k=k+2;
            }
        }
    return odds;
    }

}
