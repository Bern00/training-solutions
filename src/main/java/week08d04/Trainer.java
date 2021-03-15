package week08d04;

public class Trainer {

    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark(){
        return canMark.giveMark();
    }

    public static void main(String[] args) {
        GoodMood goodMood = new GoodMood();
        BadMood badMood = new BadMood();

        Trainer trainer1 = new Trainer(goodMood);
        Trainer trainer2 = new Trainer(badMood);
        System.out.println(trainer1.giveMark());
        System.out.println(trainer2.giveMark());
    }
}
