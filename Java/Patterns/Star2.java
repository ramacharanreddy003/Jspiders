public class Star2{
    public static void main(String[] args) {
        int n=5;
        int col=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
            col--;
        }
    }
}