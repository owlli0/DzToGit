package domain;

public class Mage extends Unit {
    private int mp;

    public Mage(String name, int HP, int mp) {
        super(name, HP);
        this.mp = mp;
    }

    public int getMp() {
        return mp;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mана " + mp);
    }

    @Override
    public int getDmg(int dmg) {
        hP -= dmg;
        return dmg;
    }

    @Override
    public void atack(Unit unit) {
        int dmg = 10;
        if (mp > 0) {
            unit.getDmg(dmg * 2);
        } else {
            unit.getDmg(dmg);
        }
    }
}
