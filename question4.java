import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
    private Double Age;
    private Double Salary;
    private String Name;

   public Employee(Double Age,Double Salary,String Name)
    {
        this.Age=Age;
        this.Salary=Salary;
        this.Name=Name;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getAge()
    {
        return Age;
    }

    public void setAge(Double age)
    {
        Age = age;
    }

    public Double getSalary()
    {
        return Salary;
    }

    public void setSalary(Double salary)
    {
        Salary = salary;
    }


}

class SalaryCompare implements Comparator<Employee>
        {
            public int compare(Employee employee, Employee t1)
          {
                  if(employee.getSalary() > t1.getSalary())
                     {
                            return 1;
                     }

                else if (employee.getSalary() == t1.getSalary())
                     {
                       return 0;
                     }

                   else
                   {
                      return -1;
                   }
          }
        }

public class question4
{
    public static void main(String[] args)
    {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(21.0,60000.0,"abc"));
        employeeList.add(new Employee(22.0,40000.0,"def"));
        employeeList.add(new Employee(23.0,20000.0,"ghi"));
        employeeList.add(new Employee(24.0,80000.0,"xyz"));

        Collections.sort(employeeList, new SalaryCompare());


        System.out.println("Employess in decreasing order of salary");

        Collections.reverse(employeeList);

        for (Employee e: employeeList)
        {
              System.out.println(e.getName() + " " + e.getSalary());
        }
    }
}


