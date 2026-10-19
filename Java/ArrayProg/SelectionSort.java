package ArrayProg;

public class SelectionSort {

	public static void Sort(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min].compareTo(arr[j])>0)
				{
					min=j;
				}
			}
			String temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
	}
	public static void main(String[] args) {
		String arr[]= {"Ram","Charan","Malli","Chandra","Samar"};
		Sort(arr);
		for(String n:arr)
			System.out.println(n+" ");
	}
}
