import java.util.Scanner;

class Theatre{
    static Theatre t1 = null;
    int totalseats=80;
   private Theatre(){}  //constructor
   public static Theatre getInstance(){
    if(t1==null){
        return t1=new Theatre();
    }else{
        return t1;
    }
   }
    public void bookseats(int seats){
        if(seats<=totalseats){
            System.out.println("No. of seats booked: "+seats);
            totalseats-=seats;
            System.out.println("No. seats available: "+totalseats);
        }else if(seats>=totalseats){
            System.out.println("No seats available");
        }
    }
}
class BookMyshow{
    public void booktickets(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of tickets to book: ");
        int tickets=scn.nextInt();
        Theatre t = Theatre.getInstance();
        t.bookseats(tickets);
    }
}
public class App{
    public static void main(String[] args) {
        BookMyshow bms = new BookMyshow();
        bms.booktickets();
    }
}
