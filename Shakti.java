import java.util.Arrays;
import java.util.List;

public class Shakti {

    public List<Integer>getAll(List<Integer> lis) {


        List<Integer> result = lis.stream().distinct().toList();

        return result;
    }

    public static void main(String[] args) {

        List<Integer> lis = List.of(1,2,3,4,5,5,4,3,2,1);

        Shakti shakti = new Shakti();

        List<Integer> res = shakti.getAll(lis);

        int a[]={1,2,3,4};

        System.out.println(Arrays.toString(a));
        System.out.println(res.toString());


        
    }
    
}
