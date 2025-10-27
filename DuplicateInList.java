import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInList {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 3, 2, 1, 6, 7, 8, 8);

        Set<Integer>seen=new HashSet<>();

        Set<Integer>duplicates=list.stream().filter(n->!seen.add(n)).collect(Collectors.toSet());

        System.out.println(duplicates.toString());
    }
    
}
