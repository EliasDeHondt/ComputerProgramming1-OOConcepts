import java.time.LocalDate;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class TodoItem {
    // Attributen
    private String description;
    private Priority priority;
    private LocalDate deadline;
    // Constructors
    public TodoItem(String description, Priority priority, LocalDate deadline) {
        this.description = description;
        this.priority = priority;
        LocalDate dateNow = LocalDate.now();
        if (!deadline.isBefore(dateNow)) {
            this.deadline = deadline;
        } else {
            System.out.println("The specified deadline has already passed.");
            this.deadline = dateNow;
        }
    }
    // Methode
    public String getDescription() { // Get..
        return description;
    }
    public Priority getPriority() { // Get..
        return priority;
    }
    public LocalDate getDeadline() { // Get..
        return deadline;
    }
    @Override
    public String toString() { // @Override van toString
        int priorityInt = 0;
        if (this.getPriority() == Priority.DEADLINE) priorityInt = 1;
        if (this.getPriority() == Priority.HIGH_TO_LOW) priorityInt = 2;
        if (this.getPriority() == Priority.LOW_TO_HIGH) priorityInt = 3;
        return String.format("%-5d %-50s %s",priorityInt,this.getDescription(),this.getDeadline().toString());
    }
}
