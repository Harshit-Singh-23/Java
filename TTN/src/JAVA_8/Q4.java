package JAVA_8;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String fullName;
    Long salary;
    String city;
    Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
    public String getFullName(){
        return this.fullName;
    }
    public Long getSalary(){
        return this.salary;
    }
    public String getCity(){
        return this.city;
    }
}

public class Q4 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println();
        System.out.println(l1.stream().filter(e -> e%2 == 0).collect(Collectors.toList()));
        Employee emp = new Employee("Harshit Singh", 30000L, "Punjab");
        Employee emp2 = new Employee("Harshit Sachdeva", 4000L, "Delhi");
        Employee emp3 = new Employee("Anmol Kumar", 2000L, "Delhi");
        Employee emp4 = new Employee("Anmol Sharma", 3000L, "Faridabad");
        Employee emp5 = new Employee("Ayush Tyagi", 10000L, "Delhi");
        Employee emp6 = new Employee("Ayush Sharma", 4000L, "Delhi");
        List<Employee> li = Arrays.asList(emp, emp2, emp3, emp4, emp5, emp6);
        System.out.println();
        System.out.println(li.stream()
                .filter(salary->salary.getSalary()<5000)
                .filter(city->city.getCity().equals("Delhi"))
                .map(name->name.getFullName().split(" ")[0]).distinct()
                .collect(Collectors.toList()));
    }
}