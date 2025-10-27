import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {
        
        List<String> list = List.of("apple", "banana", "orange", "apple", "kiwi", "banana");

        Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(map.toString());
    }
    
}
