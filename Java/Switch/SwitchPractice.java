public class SwitchPractice{
    public static void main(String[] args){
        int n=3;
        switch(n){
            case 1:
                System.out.println("case 1");
                break;
            case 2:{
                System.out.println("case 2");
                break;
        }
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                System.out.println("case 5");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}