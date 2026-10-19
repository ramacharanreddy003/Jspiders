public class VowelOrConsonant{
    public static void main(String[] args){
        char ch='p';
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel character");
                break;
            default:
                System.out.println("Consonant character");
        }
    }
}