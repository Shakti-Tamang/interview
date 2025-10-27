import java.util.Arrays;
import java.util.List;

public class MaxMinNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(34, 12, 5, 67, 23, 89, 1, 45);


        // optional
        int max=numbers.stream().max(Integer::compare).get();
        int min=numbers.stream().min(Integer::compare).get();

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

    }
    
}
