package ArrayProg;

public class RemoveDup {

	public static void main(String[] args) {
		int []a= {3,4,5,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			boolean flag=true;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j])
					flag=false;
				break;
			}
		if(flag)
			System.out.println(a[i]+" ");
		}
	}

}
