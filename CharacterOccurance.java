import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterOccurance {

    public static void main(String[] args) {
     String str = "programming java amu java";

     Map<String, Long> charCountMap = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));


        System.out.println(charCountMap);
    }
    
}
