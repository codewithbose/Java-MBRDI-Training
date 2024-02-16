import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class DuplicateList {

    public static List<Integer> findDuplicatesUsingSet(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        return numbers.stream()
                      .filter(n -> !seen.add(n)) // Add to set and check if already exists
                      .collect(Collectors.toList());  
    }
    public static List<Integer> findNonDuplicatesUsingSet(List<Integer> numbers){
        Set<Integer> notseen = new HashSet<>();
        return numbers.stream().filter(n-> notseen.add(n))
                    .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> allList = Arrays.asList(2, 3, 4, 5, 6, 4, 5);
        System.out.println(findDuplicatesUsingSet(allList));
        System.out.println(findNonDuplicatesUsingSet(allList));
    }
}