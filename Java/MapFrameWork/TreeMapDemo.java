package MapFrameWork;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map <String,Integer> m = new TreeMap<String,Integer>();
		m.put("Zareena",5);
		m.put("Tabu", 1);
		m.put("Amar",2);
		m.put("Yakoob", 4);
		m.put("Ram", 3);
		System.out.println(m);
	}
}
