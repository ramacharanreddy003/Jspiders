import java.util.Scanner;
public class BiggestNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2){
            System.out.println("n1 is biggest");
        }else if(n2>n1){
            System.out.println("n2 is biggest");
        }else{
            System.out.println("Both are equal");
        }
    }
}