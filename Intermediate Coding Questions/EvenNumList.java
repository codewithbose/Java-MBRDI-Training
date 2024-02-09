import java.util.List;
import java.util.stream.Collectors;

public class EvenNumList {
    public static void main(String[] args) {
        List <Integer> allNumList = List.of(2, 34, 678, 3);

        List <Integer> evenNumList = allNumList.stream()
        .filter(n -> n % 2 ==0).collect(Collectors.toList());
        
        System.out.println(evenNumList);
    }
}
