import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AverageSalalry {
double salary;
int age;
String department;
String name;

    public AverageSalalry(int age, double salary, String name,String department) {
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.department = department;
    }

    public static void main(String[] args) {    
        List<AverageSalalry>list=new ArrayList<>();
        AverageSalalry a1=new AverageSalalry(24,50000,"Shakti","Developement");
        AverageSalalry a2=new AverageSalalry(30,60000,"Amit","AQ");
        AverageSalalry a3=new AverageSalalry(28,55000,"Ramesh","QA");
        list.add(a1);
        list.add(a2);
        list.add(a3);

        Map<String, Double> avgSalaryByDept = list.stream()
            .collect(Collectors.groupingBy(e -> e.department, Collectors.averagingDouble(e -> e.salary)));

            avgSalaryByDept.forEach((dept, avgSalary) -> 
                System.out.println("Department: " + dept + ", Average Salary: " + avgSalary)
            );

        // for(NameAndSalary n:nameAndSalaries){
            System.out.println(n.name+" "+n.salary);
        }

    }
    
}
