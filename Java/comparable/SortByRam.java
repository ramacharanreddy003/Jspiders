package comparable;

import java.util.Comparator;

public class SortByRam implements Comparator {
	public int compare(Object o1, Object o2) {
		Mobile m1 = (Mobile) o1;
		Mobile m2 = (Mobile) o2;
		if (m1.ram > m2.ram)
			return 1;
		else if (m1.ram < m2.ram)
			return -1;
		else 
			return 0;
	}
}
class Sortbyrom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1=(Mobile)o1;
		Mobile m2=(Mobile)o2;
		return m2.rom-m1.rom;
	}
	
	
}
class SortByPrice implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		Mobile m1=(Mobile)o1;
		Mobile m2=(Mobile)o2;
		return (int)(m1.price-m2.price);
		
	}
}
@SuppressWarnings("rawtypes")
class Sortbycolor implements Comparator{
	public int compare(Object o1,Object o2) {
		return ((Mobile)o1).color.compareTo(((Mobile)o2).color);
		
	}
}
class sortbyname implements Comparator{
	public int compare(Object o1,Object o2){
		Mobile m1=(Mobile)o1;
		Mobile m2=(Mobile)o2;
		return ((Mobile)o1).name.compareTo(((Mobile)o2).name);
		
	}
}