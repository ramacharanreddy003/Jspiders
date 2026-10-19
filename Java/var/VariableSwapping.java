public class VariableSwapping{
    public static void main(String[] args){
        // int a=50;
        // int b=89;
        // System.out.println("Before Swapping a: "+a);
        // System.out.println("Before Swapping b: "+b);
        
        // int t=a;
        // a=b;
        // b=t;
        // System.out.println("After Swapping a= "+a);
        // System.out.println("After Swapping b= "+b);
    
        
    
//using 3rd var
        int a=90;
        int b=21;
        System.out.println("Before Swapping a: "+a);
        System.out.println("Before Swapping b: "+b);
        int c=0;
        c=b;
        b=a;
        a=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}