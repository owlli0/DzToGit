package domain;

public abstract class Unit {
    private String name;
    protected int hP;

    public Unit(String name, int HP) {
        this.name = name;
        this.hP = HP;
    }

    public String getName() {
        return name;
    }

    public int gethP() {
        return hP;
    }

    public void printInfo() {
        System.out.println("===============");
        System.out.println("Name: " + name);
        System.out.println("HP: " + hP);

    }

    public abstract int getDmg(int dmg);

    public abstract void atack(Unit unit);

}
