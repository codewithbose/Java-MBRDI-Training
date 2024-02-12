import java.util.Arrays;
import java.util.List;
import java.util.Optional;
 
public class MaximumValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,100,123);
 
        Optional<Integer> maxElement = list.stream()
                .max(Integer::compareTo);
 
        if (maxElement.isPresent()) {
            System.out.println("Maximum element in the list: " + maxElement.get());
        } else {
            System.out.println("The list is empty.");
        }
    }
}