class AC {
    int temp = 24;
    void increaseTemp(AC a) {
        temp++;
        System.out.println("temp increased");
    }
}
@SuppressWarnings("unused")
class Test3 {
    public static void main(String[] args) {
        AC ac2 = new AC();
        AC ac3 = new AC();
        ac2.increaseTemp(ac2);
        ac3.increaseTemp(ac3);
        ac2.increaseTemp(ac2);
        System.out.println("ac2 temp = " + ac2.temp);
        System.out.println("ac3 temp = " + ac3.temp);

    }
}

