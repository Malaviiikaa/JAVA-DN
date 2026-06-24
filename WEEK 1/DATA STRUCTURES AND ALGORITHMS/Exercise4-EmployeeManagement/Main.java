public class Main {

    public static void main(String[] args) {

        EmployeeManagement em = new EmployeeManagement();

        em.addEmployee(new Employee(101, "Rahul", "Manager", 50000));
        em.addEmployee(new Employee(102, "Anu", "Developer", 40000));

        System.out.println("Employees:");
        em.displayEmployees();

        System.out.println("\nSearch:");
        em.searchEmployee(102);

        em.deleteEmployee(101);

        System.out.println("\nAfter Delete:");
        em.displayEmployees();

    }

}
