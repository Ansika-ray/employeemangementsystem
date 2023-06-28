import java.util.ArrayList;
import java.util.List;

public class Employeeservice {
   private final ArrayList<Employee> employees;

public Employeeservice() {
    employees = new ArrayList<>();
}

public void addEmployee(Employee employee){
    employees.add(employee);
}

public List<Employee> getEmployess(){
    return employees;
}

   
}
