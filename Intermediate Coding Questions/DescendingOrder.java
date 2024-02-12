import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class DescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 6, 3);
 
        List<Integer> sortedList = list.stream()  
                .sorted((a, b) -> Integer.compare(b, a)) 
                .collect(Collectors.toList());
 
        System.out.println("Sorted list in descending order: " + sortedList);
    }
}