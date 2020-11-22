package introconstructors;

import java.time.LocalDateTime;
import java.time.LocalTime;


public class Task {
    String title;
    String description;
    LocalDateTime startDateTime;
    LocalTime duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
