import java.util.Arrays;
import java.util.List;
public class ListOfInteger {
 
    public static void main(String[] args) {
 
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        long count = list.stream().count();
 
        int sum = list.stream().mapToInt(Integer::intValue).sum();
 
        int min = list.stream().min(Integer::compareTo).orElse(Integer.MIN_VALUE);
 
        int max = list.stream().max(Integer::compareTo).orElse(Integer.MAX_VALUE);
 
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
        System.out.println("count=" + count + ", sum=" + sum + ", min=" + min + ", average=" + average + ", max=" + max);
 
    }
 
}