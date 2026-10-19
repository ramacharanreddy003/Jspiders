public class EvenorOdd{
    public static void main(String[] args) {
        System.out.println(num(3));
    }
    static String num(int n){
        if(n==0) return "Even";
        if(n==1) return "Odd";
        return num(n-2);

    }
}