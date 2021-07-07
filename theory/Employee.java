package theory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import java.util.*;
public class Employee implements Comparable<Employee>{
    private Integer id;
    private String name;
    private Double salary;
    public Employee(int id, String name, Double sal){
        this.id = id;
        this.name = name;
        this.salary = sal;
    }
    public Double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public int compareTo(Employee emp){
        return this.salary.compareTo(emp.salary);
    }

    public String toString(){
        return id+"\t"+name+"\t"+salary;
    }
}


