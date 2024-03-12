import java.time.LocalDate;

/**
 @author Elias De Hondt
 * 5/12/2022
 */
public class TestToDo {
    // Attributen
    // Constructors
    // Methode
    public static void main(String[] args) {
        TodoList toDoList = new TodoList();

        toDoList.addTodoItem("Dit is een description1 ",Priority.HIGH_TO_LOW, LocalDate.parse("2015-01-19"));
        toDoList.addTodoItem("Dit is een description2 ",Priority.LOW_TO_HIGH, LocalDate.now().plusDays(100));
        toDoList.addTodoItem("Dit is een description3 ",Priority.LOW_TO_HIGH, LocalDate.parse("2015-02-19"));
        toDoList.addTodoItem("Dit is een description4 ",Priority.HIGH_TO_LOW, LocalDate.parse("2015-12-19"));
        toDoList.addTodoItem("Dit is een description5 ",Priority.LOW_TO_HIGH, LocalDate.parse("2020-01-19"));
        toDoList.addTodoItem("Dit is een description6 ",Priority.HIGH_TO_LOW, LocalDate.parse("2015-01-19"));
        toDoList.addTodoItem("Dit is een description7 ",Priority.HIGH_TO_LOW, LocalDate.parse("2011-11-11"));
        toDoList.addTodoItem("Dit is een description8 ",Priority.LOW_TO_HIGH, LocalDate.parse("2001-09-11"));
        toDoList.addTodoItem("Dit is een description9 ",Priority.DEADLINE, LocalDate.parse("2001-04-10"));
        toDoList.addTodoItem("Dit is een description10 ",Priority.LOW_TO_HIGH, LocalDate.parse("2815-01-16"));

        toDoList.toon();
    }
}
