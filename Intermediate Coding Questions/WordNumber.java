import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 
public class WordNumber {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("22", "3", "344", "", "5", "5", "490", "3", "3", "3");
        Map<String, Long> countMap = inputList.stream()
                .filter(s -> !s.isEmpty()) 
                .collect(Collectors.groupingBy(s -> s,Collectors.counting()));
 
        String result = countMap.entrySet().stream()
                .map(entry -> entry.getKey() + "-" + entry.getValue())
                .collect(Collectors.joining(", "));
 
        System.out.println(result);
    }
}