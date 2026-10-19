package stringPrograms;

public class NumberToWord {

	public static void main(String[] args) {
		int n=29092003;
		pw(n/10000000,"crore ");
		pw((n/100000)%100,"lakhs ");
		pw((n/1000)%100,"thousand ");
		pw((n%100)," ");
	}
		public static void pw(int num,String s) {
			String[] one= {"","one","two","three","four","five","six","seven",
					"eight","nine","ten","eleven","twelve","thirteen",
					"fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
			
			String[] two= {" "," ","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
			if(num<=19) {
				System.out.print(one[num]);
				
			}else{
				System.out.print(two[num/10]+" "+one[num%10]);
			}
			if(num!=0)
				System.out.print(s);
		

		
	}

}
