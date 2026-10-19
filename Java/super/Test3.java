
class F {

    F(int i) {
        System.out.println("F(int)");
    }

    class G extends F {
        G(){
            super(10);
            System.out.println("G()");
        }
    }
    @SuppressWarnings("unused")
class Test3{
        public static void main(String[] args) {
           
        }
    }
}
