package comparable;

import java.util.Arrays;
import java.util.Scanner;

public class MobilePro {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean r = true;
		Mobile[] m = null;
		do {
			System.out.println("1.Add Mobile\n2.Display\n3.SortByRam\n4.SortByRom\n5.SortByColor\n6.SortByPrice\n7.Exit");
			int n=s.nextInt();
			switch(n) {
			case 1:
			{
				System.out.println("How many mobiles do you want to add");
				int num=s.nextInt();
				m=new Mobile[num];
				for(int i=0;i<num;i++)
				{
					System.out.println("Enter Mobile Name, ram, rom, color, price of " +(i+1));
					m[i]=new Mobile(s.next(),s.nextInt(),s.nextInt(),s.next(),s.nextDouble());
				}
				System.out.println("Mobile added");
			}
			break;

			case 2:{
				for(Mobile mobile:m)
					System.out.println(mobile);
			}
			break;
			
			case 3:{
				Arrays.sort(m, new SortByRam());
				
			}
			break;
			case 4:{
				Arrays.sort(m,new Sortbyrom());
			}break;
			case 5:
			{
				Arrays.sort(m, new Sortbycolor());
			}break;
		
			case 6:
			{
				Arrays.sort(m,new SortByPrice());
				
			}break;
			case 7:
			{
				r=false;
				System.out.println("Thankyou");
				
			}break;
			
			default:
				System.out.println("Invalid");
			
			
			}
		}while(r);
		s.close();
	
	}
}
