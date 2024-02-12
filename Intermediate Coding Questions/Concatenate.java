import java.util.stream.Stream;

public class Concatenate {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6,9);
 
        Stream<Integer> concatenatedStream = Stream.concat(stream1, stream2);
 
        concatenatedStream.forEach(System.out::println);
        System.out.println("Done");
    }
}
 