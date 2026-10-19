class AC{
    int temp=24;
    static void increaseTemp(AC a){
        a.temp++;
    }
}
@SuppressWarnings("unused")
class Test{
public static void main(String[] args){
    AC ac2 = new AC();
    AC ac3 = new AC();
    AC.increaseTemp(ac2);
    AC.increaseTemp(ac3);
    AC.increaseTemp(ac2);
    System.out.println("ac2 temp = "+ac2.temp);
    System.out.println("ac3 temp = "+ac3.temp);
   

}
}