public class SnakePattern2{
    public static void main(String[] args) {
        int n=5;
        int str=1;
        for(int i=1;i<=n;i++){
            int st=str;
            if(i%2==0){
                for(int j=st+i-1;j>=st;j--){
                    System.out.print(j +" ");
                }
            }else{
                
                for(int j=st;j<st+i;j++){
                    System.out.print(j+" "); 
                }
            }
            str=str+i;
            System.out.println();
        }
    }
}