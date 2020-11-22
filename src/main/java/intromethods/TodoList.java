package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    List<Todo> todoList = new ArrayList<>();

    public void addTodo(String caption) {
        Todo todo = new Todo(caption);
        todoList.add(todo);
    }

    public void finishTodos(String caption) {
        for(Todo todo: todoList) {
            if (caption.equals(todo.getCaption())) {
                todo.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish) {
        for(String todoCaption: todosToFinish) {
            finishTodos(todoCaption);
        }
    }

    public List<String> todosToFinish() {
        List<String> toFinish = new ArrayList<>();
        for(Todo todo: todoList) {
            if (todo.isFinished()) {
                toFinish.add(todo.getCaption());
            }
        }
        return toFinish;
    }

    public int numberOfFinishedTodos() {
        return todoList.size() - todosToFinish().size();
    }

}
