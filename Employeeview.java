import java.util.Scanner;

public class Employeeview {
    private final Employeeservice employeeService;
    private Scanner scanner;

    public Employeeview(){
        employeeService = new Employeeservice();
        scanner = new Scanner(System.in);
    }

    
    public void home(){
        int choice;
        do{
        System.out.println("Wellcome to the employee page");
        System.out.println("Press 1>> Add Employee");
        System.out.println("Press 2>> view Employee");
         System.out.println("press 3>> for Exit");

        choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
               addEmployee();
               break;
            case 2:
                showEmployess();
                break;
            case 3:
                System.out.println("Thanks for Using app");
                continue;
            default:  
                 System.out.println("Invalid Option !!!");
                 continue;         
                  
        }

        }while (choice != 3);
    }

    private void addEmployee(){
        System.out.println("Enter Employee Name");
        String employeeName = scanner.nextLine();

        System.out.println("Enter Employee id");
        int employeeId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Employee Salary");
        double employeesalery = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(employeeId,employeeName,employeesalery);
        employeeService.addEmployee(employee);
    }

    private void showEmployess() {
        // var employees = employeeService.getEmployess();
        // for (Employee e : employees) {
        //     System.out.println("Id: " + e.getEmployeeId());
        //      System.out.println("Name:" + e.getEmployeeName());
        //       System.out.println("Name:" + e.getEmployeesalery());

        employeeService.getEmployess().forEach(System.out::println);
    } 
}
