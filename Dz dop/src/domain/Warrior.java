package domain;

public class Warrior extends Unit {
    private int armor;

    public Warrior(String name, int HP, int armor) {
        super(name, HP);
        this.armor = armor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Броня " + armor);
    }

    @Override
    public int getDmg(int dmg) {
        int resDmg = dmg;
        if (armor > 0) {
            resDmg /= 2;
            armor--;
            hP -= resDmg;
        } else {
            hP -= resDmg;
        }
        return resDmg;
    }

    @Override
    public void atack(Unit unit) {
        unit.getDmg(10);
    }
}
