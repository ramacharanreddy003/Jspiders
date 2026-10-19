package MapFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Map<Integer,String> s = new HashMap<Integer,String>();
		s.put(1,"Ram");
		s.put(5, "Siva");
		s.put(2, "Sumathi");
		s.put(4,"Samar");
		s.put(3,"Sravani");
		s.put(3,"Amar");
		Set<Integer> keySet=s.keySet();
		Iterator<Integer> i = keySet.iterator();
		while(i.hasNext()) {
			int key=i.next();
			String value=s.get(key);
			System.out.println(key+" = "+value);
		}
	}
}
