import java.util.Arrays;
import java.util.List;

public class SecondHighestArrayInStreams {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,33,44,55,77);
    
        int secondHighest = numList.stream().sorted().skip(numList.size()-2).findFirst().get();
        System.out.println("Second Highest number: "+ secondHighest);
    }
}
