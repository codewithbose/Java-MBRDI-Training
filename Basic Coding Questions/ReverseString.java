
public class ReverseString {
    public static void main(String[] args) {
        String str = "Capgemini";
        // StringBuilder revStr = new StringBuilder(str).reverse();
        
        char[] revChar = new char[str.length()];
        for(int i=0; i<str.length(); i++) {
            revChar[str.length()-i-1] = str.charAt(i);
        }
        String revStr = new String(revChar);
        System.out.println(revStr);
    }
}
