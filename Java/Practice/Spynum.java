class Spynum{
  static public void main(String[] args){
    int n=123;
    int sum=0;
    int prod=1;
    int m=n;
    while(n>0){
      int r=n%10;
      sum+=r;
      prod*=r;
      n/=10;
    }
    if(sum==prod){
      System.out.println(m+" is a Spy number");
    }else{
      System.out.println(m+" is not a Spy number");
    }
  }
}