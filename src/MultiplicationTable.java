import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {
    private final Set<Task> tasks = new HashSet<>();

    public MultiplicationTable() {
        Random random = new Random();
        while (tasks.size() < 15) {
            tasks.add((new Task(random.nextInt(8)+2, random.nextInt(8)+2))); // от 2  до 10 не включительно
        }
    }

    public Set<Task> getTasks()
    {
        return this.tasks;
    }


    @Override
    public String toString() {
        return "MultiplicationTable{" +
                "tasks=" + tasks +
                '}';
    }
}
