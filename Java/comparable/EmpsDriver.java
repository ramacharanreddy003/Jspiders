package comparable;

import java.util.Arrays;

public class EmpsDriver {

	public static void main(String[] args) {
		Emps e1 = new Emps("Ram", 21, 123);
		Emps e2 = new Emps("charan", 22, 220);
		Emps e3 = new Emps("Anu",23,543);
		Emps[] e = { e1, e2 ,e3};

		Arrays.sort(e);
		for (Emps emps : e)
			System.out.println(emps);

	}

}
