import java.util.Arrays;
import java.util.List;

public class ThirdHighestArrayInStreams {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,9);
        int n = numList.stream().sorted().skip(numList.size()-2).findFirst().get();
        System.out.println(n);
    }
}