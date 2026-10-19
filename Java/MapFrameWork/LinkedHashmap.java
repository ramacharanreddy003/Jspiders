package MapFrameWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmap {
	public static void main(String[] args) {
		Map<Integer, String > m = new LinkedHashMap<Integer,String>();
		m.put(5, "Tarak");
		m.put(4, "Babu");
		m.put(1, "Prabhas");
		m.put(2, "Bhai");
		m.put(3, "Peddi");
		
		Set<Map.Entry<Integer,String>>entrySet=m.entrySet();
		for(Entry<Integer, String> e:entrySet)
			System.out.println(e);
		
	}
}
