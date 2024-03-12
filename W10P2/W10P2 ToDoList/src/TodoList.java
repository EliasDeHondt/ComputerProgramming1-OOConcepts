import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class TodoList {
    // Attributen
    private List<TodoItem> items;
    // Constructors
    public TodoList() {
        items = new LinkedList<>();
    }
    // Methode
    public void addTodoItem(String description, Priority priority, LocalDate deadline) {
        if (priority.equals(Priority.DEADLINE)) {
            items.add(0,new TodoItem(description,priority,deadline));
        }
        if (priority.equals(Priority.HIGH_TO_LOW)) {
            items.add((items.size()/2),new TodoItem(description,priority,deadline));
        }
        if (priority.equals(Priority.LOW_TO_HIGH)) {
            items.add(items.size(),new TodoItem(description,priority,deadline));
        }
    }
    public void toon() {
        for (TodoItem item : items) {
            System.out.println(item.toString());
        }
    }

}
