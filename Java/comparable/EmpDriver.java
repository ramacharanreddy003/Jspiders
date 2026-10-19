package comparable;

import java.util.Arrays;

public class EmpDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp("Ram",22,12);
		Emp e2 = new Emp("Anurag",25,1234);
		Emp[] e = {e1,e2};
		Arrays.sort(e);
		for(Emp emp:e)
			System.out.println(emp);
		

	}

}
