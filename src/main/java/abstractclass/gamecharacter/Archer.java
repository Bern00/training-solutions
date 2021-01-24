package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private static final int MAX_SECONDARY_DAMAGE = 5;
    private int numberOfArrow = 100;

    public Archer(Point position, Random random) {
        super(position, random);
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage() {
        return super.getRandom().nextInt(MAX_SECONDARY_DAMAGE -1) +1;
    }

    private void shootingAnArrow(Character enemy) {
        this.numberOfArrow -= 1;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
