public class Main {

    public static void main(String[] args) {

        TaskManagement tm = new TaskManagement();

        tm.addTask(1, "Coding", "Pending");
        tm.addTask(2, "Testing", "Completed");

        System.out.println("Tasks:");
        tm.displayTasks();

        System.out.println("\nSearch:");
        tm.searchTask(2);

        tm.deleteTask(1);

        System.out.println("\nAfter Delete:");
        tm.displayTasks();

    }

}