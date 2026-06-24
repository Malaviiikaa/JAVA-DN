public class TaskManagement {

    Task head = null;

    public void addTask(int id, String name, String status) {

        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newTask;
    }

    public void searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                temp.display();
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task not found");
    }

    public void displayTasks() {

        Task temp = head;

        while (temp != null) {
            temp.display();
            temp = temp.next;
        }

    }

    public void deleteTask(int id) {

        if (head == null)
            return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;

    }

}