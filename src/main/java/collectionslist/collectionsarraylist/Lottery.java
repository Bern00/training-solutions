package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    private List<Integer> creatList(int ballCount) {

        List<Integer> creatList = new ArrayList<>();
        for(int i = 1; i <= ballCount; i++) {
            creatList.add(i);
        }
        Collections.shuffle(creatList);
        return creatList;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) throws IllegalArgumentException{
        if(lotteryType >= ballCount) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }

        List<Integer> balls = creatList(ballCount);
        List<Integer> winnerBalls = balls.subList(0, lotteryType);
        Collections.sort(winnerBalls);
        return winnerBalls;
    }
}
