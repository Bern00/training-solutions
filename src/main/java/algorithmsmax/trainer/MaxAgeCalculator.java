package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainers) {
        Trainer trainer = null;
        for(Trainer tr: trainers) {
            if(trainer == null || tr.getAge() > trainer.getAge()) {
                trainer = tr;
            }
        }
        return trainer;
    }
}
