import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,5,4,3,2,1);
        List<Integer> list1=List.of(1,2,4,8);

        List<Integer> result = Stream.concat(list.stream(),list1.stream()).distinct().toList();

        System.out.println(result.toString());
    }
    
}
