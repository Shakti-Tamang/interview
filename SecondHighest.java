import java.util.Comparator;
import java.util.List;

public class SecondHighest {

    public static void main(String[] args) {
        
        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 50, 40, 30, 20, 10);


      int secondHighest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Highest number: " + secondHighest);
    }
    
}
