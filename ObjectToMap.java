import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ObjectToMap {


    int id;

    String name;

    public ObjectToMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        List<ObjectToMap> list = List.of(
            new ObjectToMap(1, "Alice"),
            new ObjectToMap(2, "Bob"),
            new ObjectToMap(3, "Charlie")
        );

        Map<Integer, String> map = list.stream().collect(Collectors.toMap(e->e.id, e->e.name));

        System.out.println(map); 
        
    }
    
}
