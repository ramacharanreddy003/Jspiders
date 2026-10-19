import java.util.Scanner;
class Account{
    private double bal=4000;
    int pin=123;
    public void getBal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin");
        int pin = sc.nextInt();
        if(pin==pin){
            System.out.println("Available bal "+bal);
        }else{
            System.out.println("Invalid pin");
        }
    }
    public void setBal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount=sc.nextInt();
        this.bal=this.bal+amount;

    }
}
@SuppressWarnings("unused")
class Test{
    public static void main(String[] args) {
        Account ac = new Account();
        ac.getBal();
        ac.setBal();
        ac.getBal();
    }
}