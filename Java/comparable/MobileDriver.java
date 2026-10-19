package comparable;

import java.util.Arrays;

public class MobileDriver {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Realme", 4, 128, "red", 10000);
		Mobile m2 = new Mobile("Oppo", 6, 128, "black", 15000);
		Mobile m3= new Mobile("Poco",8,128,"blue",20000);
		
		Mobile[] m = { m1, m2 ,m3};
		//Arrays.sort(m, new SortByRam());
		for (Mobile mobile : m)
			System.out.println(mobile);
		Arrays.sort(m, new SortByRam());

	}

}
