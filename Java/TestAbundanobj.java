class TestAbundanobj{
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.bal=2000;
        System.out.println(a1.bal);
        a1=null;
        System.out.println(a1);
    }
}