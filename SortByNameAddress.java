import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByNameAddress {
    

    String name;

    int age;

    String address;

    public SortByNameAddress(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    
    
    }

    public void finalOutPut(){

        System.out.println(name+" "+age+" "+address);


    }

    public static void main(String[] args) {

        List<SortByNameAddress> list =new ArrayList<>();

        SortByNameAddress s1 = new SortByNameAddress("Shakrti",24,"Banepa");

        SortByNameAddress s2 = new SortByNameAddress("Amit",30,"Kathmandu");
        SortByNameAddress s3 = new SortByNameAddress("Ramesh",28,"Lalitpur");

        list.add(s1);
        list.add(s2);

        list.add(s3);

        List<SortByNameAddress> sortedListd= list.stream().sorted(Comparator.comparing((SortByNameAddress s)-> s.name).thenComparing(s->s.address).thenComparing(s->s.age)).toList();
   
        for(SortByNameAddress s: sortedListd){

            s.finalOutPut();
        }
    }
}
