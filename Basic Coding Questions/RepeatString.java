import java.util.stream.IntStream;

public class RepeatString {
    public static void main(String[] args) {
        String str = "Bard";

        IntStream.range(0, 3).forEach(i -> System.out.print(str+"$"));
    }
}
