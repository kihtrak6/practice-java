package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

public class StringFinder {

	Map<String, AtomicInteger> stringMap = new HashMap<>();
	
	public String getHighFreqString(String[] strings) {
		
		String highS = null;
		
		for (String string : strings) {
			if(string != null && !string.isEmpty()) {
				AtomicInteger count = stringMap.get(string);
				if(count == null) {
					stringMap.put(string, new AtomicInteger(1));
					continue;
				}
				count.incrementAndGet();
			}
		}
		
		Iterator<Entry<String, AtomicInteger>> it = stringMap.entrySet().iterator();
		
		int high = 0;
		while(it.hasNext()) {
			Entry<String, AtomicInteger> entry = it.next();
			if( entry.getValue().get() > high) {
				high = entry.getValue().get();
				highS = entry.getKey();
			} else if(entry.getValue().get() == high) {
				if(highS.compareTo(entry.getKey()) < 0) {
					highS = entry.getKey();
				}
			}
		}
		
		return highS;
		
	}
	
}
