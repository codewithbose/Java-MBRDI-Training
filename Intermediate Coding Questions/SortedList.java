import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 6, 3);
 
        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
 
        System.out.println("Sorted list: " + sortedList);
    }
}