package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "ABC", 28, 123, "F", "HR", "Blore", 2020));
        employeeList.add(new Employee(2, "XYZ", 29, 120, "F", "HR", "Hyderabad", 2015));
        employeeList.add(new Employee(3, "efg", 30, 115, "M", "HR", "chennai", 2014));
        employeeList.add(new Employee(4, "def", 32, 125, "F", "HR", "chennai", 2013));
        employeeList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "noida", 2013));
        employeeList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        employeeList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        employeeList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        employeeList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

        Map<String, List<Employee>> employeesByCity;
        employeesByCity = employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));
        List<Employee> sortedList = employeeList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).toList();
        System.out.println("sorted by age and name " +sortedList);
        employeeList.sort(Comparator.comparing(Employee::getName));
        System.out.println(employeeList);
        System.out.println("salary greater than 140");
        employeeList.stream().filter(e-> e.getSalary()>140).toList().forEach(System.out::println);
        Optional lowestsal = employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary));
        if (lowestsal.isPresent())
        System.out.println("lowest sal of empl"+lowestsal);
        Optional highestsal= employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Highest sal " + highestsal );
       // System.out.println("Employee grouped by city :: \n" + employeesByCity);
        Map<Integer, List<Employee>> employeesByAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
       // System.out.println("Employee grouped by age :: \n" + employeesByAge);
        Map<String, Long> MaleAndFemaleEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        //System.out.println("count male and female employee in the organization::  \n" + MaleAndFemaleEmployee);

        System.out.println("names of all the departement in the organization ");
        employeeList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        System.out.println("Employee details whose  age is greater than 28");
        employeeList.stream().filter(e -> e.getAge() > 28).collect(Collectors.toList()).forEach(System.out::println);

        OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).max();
        if (max.isPresent())
           System.out.println("Maximum age of Employee: " + max.getAsInt());

        Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("average age of male and female Employee:: " + avgAge);

        Map<String, Long> countByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println("no of employee in each departement");
       for (Map.Entry<String, Long> entry : countByDept.entrySet()){
           System.out.println(entry.getKey() + ":" + entry.getValue());
       }
        Optional<Employee> oldestEmp = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
       Employee oldestEmployee = oldestEmp.get();
       // System.out.println("oldest employee details:: \n" + oldestEmployee);

        Optional<Employee> youngestFemale = employeeList.stream().filter(e -> e.getGender().equals("F")).min(Comparator.comparingInt(Employee::getAge));
        Employee youbgestEmployee = youngestFemale.get();
        //System.out.println("youngest female employee:: \n" + youbgestEmployee);

        System.out.println("Employee whose age is greater than 30 and less than 30");
        Map<Boolean, List<Employee>> partionOfEmployeeByAge = employeeList.stream().collect(Collectors.partitioningBy(e ->e.getAge() > 30));
        Set<Map.Entry<Boolean, List<Employee>>> empSet = partionOfEmployeeByAge.entrySet();
        for (Map.Entry<Boolean, List<Employee>> entry : empSet){
            if (Boolean.TRUE.equals(entry.getKey())) {
                System.out.println("Employee greater than 30::" + entry.getValue());
            }else {
               System.out.println("Employee less than 30::" + entry.getValue());
            }
        }
         
        Map.Entry<String , Long> maxNoOfEmployeeInDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
       System.out.println("max no of employee present in dept:: " + maxNoOfEmployeeInDept.getKey());

       Optional<Employee> emp = employeeList.stream().filter(e -> e.getDeptName().equalsIgnoreCase("HR")).findAny();
        emp.ifPresent(employee -> System.out.println("found emplyees from HR departement " + employee));

        System.out.println("Departement names where the number of employees in the departement is over 3 :: ");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 3).forEach(System.out::println);

        System.out.println("Distinct departement names that employees work for:: ");
        employeeList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        employeeList.stream().filter(e -> e.getCity().equalsIgnoreCase("Blore")).sorted(Comparator.comparing(Employee::getName)).
                forEach(e -> System.out.println("Employees staying in blore:: " + e.getName()));

        System.out.println("No of employees in the organization ::" + employeeList.stream().count());

        Map<String, Long> employeeCountInDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        //System.out.println("Employee departement and its count: \n" + employeeCountInDepartment);

        Optional<Map.Entry<String,  Long>> DeptWithHighestEmp  = employeeCountInDepartment.entrySet().stream().max(Map.Entry.comparingByValue());
        if (DeptWithHighestEmp.isPresent()) {
            //System.out.println("DEpartement which has the highest number of employees " + DeptWithHighestEmp.get());

           // System.out.println("Sorting based on name and age:: ");
            Comparator<Employee> comparator1 = Comparator.comparing(Employee::getName);
            Comparator<Employee> comparator2 = Comparator.comparingInt(Employee::getAge);
            employeeList.stream().sorted(comparator1.thenComparing(comparator2)).forEach(System.out::println);

        Optional<Employee> seniorEmp = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearofJoining)).findFirst();
           // System.out.println("Senior employee details:: " + seniorEmp.get());

        DoubleSummaryStatistics empSalary = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
            //System.out.println("Average salary of the organization = " +empSalary.getAverage());
           // System.out.println("total salary in the organization = " + empSalary.getSum());

            //System.out.println("print average salary of each departement");
            Map<String, Double> avgSalary =  employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.averagingDouble(Employee::getSalary)));
            Set<Map.Entry<String, Double>> entrySet = avgSalary.entrySet();
            for (Map.Entry<String,Double> entry : entrySet) {
               // System.out.println(entry.getKey() + ":" +entry.getValue());

                Optional<Employee> empHighest = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();
                System.out.println("highest salary in the organization:" + empHighest.get().getSalary());

                Optional<Employee> emp2  = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
                System.out.println("second highest salary in the organization : " +emp2.get().getSalary());

                int n=10;
                Optional<Employee> emp3 = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(n-1).findFirst();
               // System.out.println("Nth highest salary in the organization : " + emp2.get().getSalary());

                Map<String , Optional<Employee>> highesstPaidSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.maxBy((t1, t2) -> (int) (t1.getSalary() - t2.getSalary()))));
                System.out.println("Highest paid salry in the organization :" + highesstPaidSalary);

                Map<String , Optional<Employee>> lowestPaidEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.minBy((t1, t2) ->(int) (t1.getSalary() - t2.getSalary()))));
                //System.out.println("Lowest paid salary by gender :" + lowestPaidEmployee);

                System.out.println("sorting the organization employee salary in the organization in ascending order");
                employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary)).toList().forEach(System.out::println);

               // System.out.println("sorting the organization employee salary in descending order");
                employeeList.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).forEach(System.out::println);
            }

         }
    }

}

class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearofJoining;

    public Employee(int id, String name, int age, long salary, String gender, String deptName, String city,
                    int yearofJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
        this.yearofJoining = yearofJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", deptName='" + deptName + '\'' +
                ", city='" + city + '\'' +
                ", yearofJoining=" + yearofJoining +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearofJoining() {
        return yearofJoining;
    }

    public void setYearofJoining(int yearofJoining) {
        this.yearofJoining = yearofJoining;
    }
}
