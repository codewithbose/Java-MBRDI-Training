//Q2) Given a list of integers, find out all the numbers starting with 1 using Stream functions?
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWith1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(123, 10, 456, 111, 789, 15);

        List<Integer> numbersStartingWith1 = numbers.stream()
                .filter(n -> String.valueOf(n).startsWith("1")) // Filter numbers starting with "1"
                .collect(Collectors.toList()); // Collect filtered numbers

        System.out.println("Numbers starting with 1: " + numbersStartingWith1);
    }
}

