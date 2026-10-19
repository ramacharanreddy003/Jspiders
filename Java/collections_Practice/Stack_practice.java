//package collections_Practice;
import java.util.Stack;

public class Stack_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> colors = new Stack<>();
		
		colors.add("Red");
		colors.add("Yellow");
		//colors.add(0,"Green");
		colors.add("Violet");
		colors.add("Purple");
		colors.add("Brown");
		colors.add("Orange");
		colors.add("White");
		//colors.remove(0);
		//colors.set(0, "Blue");//Updating the existing element
		//System.out.println(colors);
		//System.out.println(colors.get(2));
		//colors.clear();
		//System.out.println(colors);
		//System.out.println(colors.contains("Orange"));//Verification of elements
		
		//System.out.println(colors.contains("Brown"));
		
		//System.out.println(colors.get(3));
		
		/*Methods in Stack*/
		
		System.out.println(colors);
		System.out.println(colors.peek());
		
		System.out.println(colors);
		System.out.println(colors.pop());
		System.out.println(colors);
		colors.push("Black");
		System.out.println(colors);
		System.out.println(colors.search("Violet"));
		System.out.println(colors.search("Purple"));
		System.out.println(colors.indexOf("Purple"));
		System.out.println(colors);
		System.out.println(colors.pop());
		System.out.println(colors);
		System.out.println(colors.peek());
		
		System.out.println(colors.isEmpty());
		
		System.out.println(colors.empty());
		colors.push("Red");
		colors.add(null);
		colors.add(null);
		System.out.println(colors);
		
		
		
		
		
		
		
	}

}
