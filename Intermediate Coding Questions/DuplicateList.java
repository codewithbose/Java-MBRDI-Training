import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class DuplicateList {

    public static List<Integer> findDuplicatesUsingSet(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        return numbers.stream()
                      .filter(n -> !seen.add(n)) // Add to set and check if already exists
                      .collect(Collectors.toList());
    }
}