class Task extends Thread {
    private final String taskName;

    Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " : " + i);
        }
    }
}

public class MultithreadedApplication {
    public static void main(String[] args) {
        Task t1 = new Task("Thread One");
        Task t2 = new Task("Thread Two");

        t1.start();
        t2.start();
    }
}
