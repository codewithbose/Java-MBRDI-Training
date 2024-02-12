import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 
public class FirstElementInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,1, 2, 3, 4, 5);
 
        Optional<Integer> firstElement = list.stream().findFirst();
 
        if (firstElement.isPresent()) {
            System.out.println("The first element is: " + firstElement.get());
        } else {
            System.out.println("The list is empty.");
        }
    }
}