package intromethods;

import java.util.Arrays;
import java.util.List;

public class TodoListMain {
    public static void main(String[] args) {

        List<String> finished = Arrays.asList("kertészkedés", "Játszani");

        TodoList todoList = new TodoList();
        todoList.addTodo("kertészkedés");
        todoList.addTodo("Játszani");
        todoList.addTodo("vásárlás");
        todoList.addTodo("imádkozás Bernáthoz");
        todoList.finishTodos("vásárlás");
        todoList.finishAllTodos(finished);
        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());

    }
}
