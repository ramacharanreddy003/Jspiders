public class Vowel{
     String check(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
         || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
            return "Vowel";
        }else{
          return "Consonant";
        }
     }
    public static void main(String[] args) {
        Vowel v = new Vowel();
        System.out.println(v.check('A'));
    }
}
