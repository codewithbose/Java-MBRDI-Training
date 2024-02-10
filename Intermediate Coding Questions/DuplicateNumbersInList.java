import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbersInList {
    List<Integer> allNum = List.of(12, 621, 83, 90, 90, 24, 13, 83);

    Set<Integer> seen = new HashSet<Integer>();

    List<Integer> duplicateNum = allNum.stream()
    .filter(n -> !seen.add(n))
    .collect(Collectors.toList());

    
}
