//Non-static
public class Book{
    String title;
    int pages;
    public static void main(String[] args){
        Book b1 = new Book();
        b1.title="Java";
        b1.pages=500;

        Book b2 = new Book();
        b2.title="Python";
        b2.pages=290;

        System.out.println(b1.title);
        System.out.println(b1.pages);
        
        System.out.println("--------------");
        System.out.println(b2.title);
        System.out.println(b2.pages);
    }
}