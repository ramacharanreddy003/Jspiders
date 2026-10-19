package type_Interface;
public class TypeInterface {
	public static void main(String[] args) {
		int i = 60;
		String s1="Ram";
		boolean b1 = true;
		System.out.println(s1);
		
		var j=23;
		var k="Engineer";
		var l=true;
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		var var=15;
		var=var+var;
		System.out.println(var);
		
		var arr = new int[]{12,122,43};
		var arr2 = new int[5];
		arr[0]=5;
		arr[1]=6;
		arr[2]=39;
		System.out.println(arr2);
	
	}
	public void add(int i,int j) {
		System.out.println(i+j);
	}
}
