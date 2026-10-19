package comparable;

public class Emp implements Comparable {

	String name;
	int age;
	int id;

	public Emp(String name, int age, int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public String toString() {
		return "Emp [name= " + name + ", age = " + age +", id="+id+"]";
		
	}
	@Override
	public int compareTo(Object o) {
		Emp e=(Emp) o;
//		if(this.id>e.id)
//			return 1;
//		else if(this.id<e.id) return -1;
//		return 0;
		//return this.age=e.age;
		return this.name.compareTo(e.name);
		
	}

}
