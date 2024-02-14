public class LetterOccurance {

    public static long letterOccurance(String input, char target){
        return input.chars().filter(n->n==target).count();
        
    }
    public static void main(String[] args) {
        String input = "Capgemini";
        char target = 'i';
        System.out.println(letterOccurance(input, target));
    }
}
