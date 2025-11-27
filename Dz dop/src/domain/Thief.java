package domain;

public class Thief extends Unit {
    int luck;

    public Thief(String name, int HP, int luck) {
        super(name, HP);
        this.luck = luck;
    }

    @Override
    public int getDmg(int dmg) {
        int loseChance = (int) (Math.random() * 100);
        if (luck > loseChance) {
            hP = dmg /= 3;
        } else {
            hP -=dmg;
        }
        return dmg;
    }

    @Override
    public void atack(Unit unit) {
        int dmg = 6;
        int loseChance = (int) (Math.random() * 100);
        if (luck > loseChance) {
            unit.getDmg(dmg * 3);
        } else {
            unit.getDmg(dmg);
        }

    }
}
