
class FactorsOfnum {

    public static void main(String[] args) {
        int a = 6;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
    }
}
