package interfaces.simlethread;

import java.util.ArrayList;
import java.util.List;

public class SimpleThread implements Runnable {

    private List<String> tasks;

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        while (nextStep() == true) {
            nextStep();
        }
    }

    private boolean nextStep() {

        if(tasks != null && !tasks.isEmpty()) {
            tasks.remove(tasks.size() -1);
        }

        return tasks != null && !tasks.isEmpty();
    }


}
