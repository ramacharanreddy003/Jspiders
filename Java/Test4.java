class Account{
    int bal;

}
@SuppressWarnings("unused")
class Test4{
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.bal=4500;
        System.out.println(a1.bal);
        a1= new Account();//it prints address
        System.out.println(a1);
    }
}