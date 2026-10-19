
import java.util.Scanner;

@FunctionalInterface
interface ATM{
    void withdraw(int amount);
}
class SBI implements ATM{
    int bal;
    public SBI(int bal){
        this.bal=bal;
    }
    @Override
    public void withdraw(int amount){
        if(amount<bal){
            bal-=amount;
            System.out.println(amount+" is withdrawn");
            System.out.println(amount+" is available balance");
        }else{
            System.out.println(amount+" is withdrawn not done");
            System.out.println(bal+" available balance");
        }
    }
}
class ICICI implements ATM{
    int bal;
    public ICICI(int bal){
        this.bal=bal;
    }
    @Override
    public void withdraw(int amount){
        if(amount<bal){
            bal-=amount;
            System.out.println(amount+" is withdrawn");
            System.out.println(amount+" i available balance");
        }else{
            System.out.println(amount+" is withdrawn not done");
            System.out.println(bal+" available balance");
        }
    }
}


class Axis implements ATM{
    int bal;
    public Axis(int bal){
        this.bal=bal;
    }
    @Override
    public void withdraw(int amount){
        if(amount<bal){
            bal-=amount;
            System.out.println(amount+" is withdrawn");
            System.out.println(amount+" is available balance");
        }else{
            System.out.println(amount+" is withdrawn not done");
            System.out.println(bal+" available balance");
        }
    }
}
public class ATMDriver{
    static Scanner s = new Scanner(System.in);
    public static ATM getBank(){
        System.out.println("1.SBI\n2.ICICI\n3.Axis\n4.Exit");
        int n=s.nextInt();
        System.out.println("Deposit Amount");
        int amount=s.nextInt();
        if(n==1) return new SBI(amount);
        else if(n==2) return new ICICI(amount);
        else if(n==3) return new Axis(amount);
        else{
            System.out.println("Invalid input");
            return null;
        }

        
    }
    public static void main(String[] args) {
        ATM a = getBank();
        System.out.println("Enter amount to withdraw");
        a.withdraw(s.nextInt());
    }

}
