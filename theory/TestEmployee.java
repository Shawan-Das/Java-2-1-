package theory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args)
    {
        List<Employee> emps = new ArrayList<Employee>();

        emps.add(new Employee(19101020,"Marani",27000.00));
        emps.add(new Employee(19101011,"Momin",26000.45));
        emps.add(new Employee(19101013,"Tanmoy",37000.56));
        emps.add(new Employee(19101003,"Piku",32000.34));
        emps.add(new Employee(19101020,"marani",21000.00));

       // Comparator reverse = Collections.reverseOrder();
        System.out.println("Ascending  Order");
        Collections.sort(emps);
        for(Employee i: emps){
            System.out.println(i.toString());
        }
        System.out.println("Decending Order");
        Collections.sort(emps,Collections.reverseOrder());
        for(Employee i: emps){
            System.out.println(i.toString());
        }

        Employee maxSalary = Collections.max(emps);
        System.out.println(maxSalary.toString());
        Employee minSalary = Collections.min(emps);
        System.out.println(minSalary.toString());
    }
}

