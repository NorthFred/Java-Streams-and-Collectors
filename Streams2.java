import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {

    public static void main(String args[]) {
        
        List<Double> randomdoubles = Stream.generate(Math::random).limit(100).collect(Collectors.toList());
        
        for (Double number : randomdoubles) {
            System.out.print(number + " / ");
        }
        
        System.out.println();
        long amount = randomdoubles.stream().count();
        
        System.out.println("Amount: " + amount);
        
        // Use map() to perform a description
        
        List<Double> randomdoublestransformed = randomdoubles.stream().map(d -> 10*d).collect(Collectors.toList());
        
        System.out.println(randomdoublestransformed);
    }
}
