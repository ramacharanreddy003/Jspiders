public class A{
    static int m1(){
    //     System.out.println("M1 starts");

    //     int i=0;
    //     if(i>0){
    //         return 10;
    //     }
    //     return 10;
    //     // System.out.println("m1 ends");
    
    System.out.println("M1 starts");
    int i=10;
    if(i<10){
        return 30;
    }else{
        return 40;
    }
    
    
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(m1());
    }
}