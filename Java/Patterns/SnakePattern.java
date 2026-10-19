public class SnakePattern{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int k=(n*i)-(n-1);
            if(i%2!=0){
                for(int j=1;j<=n;j++){
                    System.out.print(k+++"\t");
                }
            }else{
                k=n*i;
                for(int j=1;j<=n;j++){
                    System.out.print(k--+"\t");
                }
            }
            System.out.println();
        }
    }
}