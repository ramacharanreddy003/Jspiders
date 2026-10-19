package comparable;

public class Emps implements Comparable {

	String name;
	int age;
	int id;

	public Emps(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	public int compareTo(Object o) {
		Emps e = (Emps) o;
//		if (this.id > e.id)
//			return 1;
//		else if (this.id < e.id)
//			return -1;
//		return 0;
		
		//return this.age=age;
		return this.name.compareTo(e.name);
	}

}
