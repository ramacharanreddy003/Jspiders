import java.util.Scanner;
class PositiveOrNeg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n=sc.nextInt();
        if(n>=0){
            System.out.println("Positive number");
        }else if(n<0){
            System.out.println("Negative number");
        }

    }
}