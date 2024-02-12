import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctSquares {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(9, 10, 3, 4, 7, 3, 4,11,21,33);
 
        List<Integer> distinctSquares = integerList.stream()
                .distinct() 
                .map(num -> num * num) 
                .collect(Collectors.toList());
 
        System.out.println(distinctSquares);
    }
}