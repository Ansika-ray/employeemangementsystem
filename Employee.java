public class Employee{
    private int EmployeeId;
    private String EmployeeName;
    private double Employeesalary;

    
    public Employee() {
    }
    public Employee(int employeeId, String employeeName, double employeesalery) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        Employeesalary = employeesalery;
    }
    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }
    public double getEmployeesalery() {
        return Employeesalary;
    }
    public void setEmployeesalery(double employeesalery) {
        Employeesalary = employeesalery;
    }


}

    