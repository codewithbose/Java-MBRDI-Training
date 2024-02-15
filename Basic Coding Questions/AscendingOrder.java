import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AscendingOrder {
    public static void main(String[] args) {
        List<Integer> unorderedList = new ArrayList<>(List.of(1, 2));
        
        Collections.sort(unorderedList);
        System.out.println(unorderedList);
    }
}
