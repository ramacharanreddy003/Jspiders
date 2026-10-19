package stringspractice;

public class revstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="charan";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev); 
	}

}
