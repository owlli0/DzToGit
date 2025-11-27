import domain.Mage;
import domain.Thief;
import domain.Unit;
import domain.Warrior;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбите между какими персонажами вы хотите устроить дуэиль:");
        System.out.println("(введите 2 числа с клавиатуры)");
        System.out.println("1 Воин");
        System.out.println("2 Маг");
        System.out.println("3 Вор");

        int car1 = scanner.nextInt();
        int car2 = scanner.nextInt();
        Unit chose1;
        Unit chose2;


        if (car1 == 1){
            System.out.println("Введите имя вашему рыцарю");
            String name = scanner.next();
            System.out.println("Введите кол-во хп вашему рыцарю");
            int hp = scanner.nextInt();
            System.out.println("Введите кол-во брони вашему рыцарю");
            int armor = scanner.nextInt();
            chose1 = new Warrior(name, hp, armor);
        } else if (car1 == 2) {
            System.out.println("Введите имя вашему магу");
            String name = scanner.next();
            System.out.println("Введите кол-во хп вашему магу");
            int hp = scanner.nextInt();
            System.out.println("Введите кол-во маны вашему магу");
            int mp = scanner.nextInt();
            chose1 = new Mage(name, hp, mp);
        } else {
            System.out.println("Введите имя вашему вору");
            String name = scanner.next();
            System.out.println("Введите кол-во хп вашему вору");
            int hp = scanner.nextInt();
            System.out.println("Введите кол-во удачу вашему вору");
            int luck = scanner.nextInt();
            chose1 = new Thief(name, hp, luck);
        }

        if (car2 == 1){
            System.out.println("Введите имя вашему рыцарю");
            String name = scanner.next();
            System.out.println("Введите кол-во хп вашему рыцарю");
            int hp = scanner.nextInt();
            System.out.println("Введите кол-во брони вашему рыцарю");
            int armor = scanner.nextInt();
            chose2 = new Warrior(name, hp, armor);
        } else if (car2 == 2) {
            System.out.println("Введите имя вашему магу");
            String name = scanner.next();
            System.out.println("Введите кол-во хп вашему магу");
            int hp = scanner.nextInt();
            System.out.println("Введите кол-во маны вашему магу");
            int mp = scanner.nextInt();
            chose2 = new Mage(name, hp, mp);
        } else {
            System.out.println("Введите имя вашему вору");
            String name = scanner.next();
            System.out.println("Введите кол-во хп вашему вору");
            int hp = scanner.nextInt();
            System.out.println("Введите кол-во удачу вашему вору");
            int luck = scanner.nextInt();
            chose2 = new Thief(name, hp, luck);
        }
        int round = 1;
        Unit[] units = {chose1, chose2};
        System.out.println("=================ДЕМО 2.0================== ");
        System.out.println("Создны герои " + chose1.getName() + " " + chose1.getClass() + " и " + chose2.getName() + " " + chose2.getClass());
        chose1.printInfo();
        chose2.printInfo();
        while (chose1.gethP()> 0 && chose2.gethP() >0){
            chose1.atack(chose2);
            chose2.atack(chose1);
            System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓Итог " + round + "го раунда↓↓↓↓↓↓↓↓↓↓↓↓");
            chose1.printInfo();
            chose2.printInfo();
            round++;
        }
        if (chose1.gethP() > 0){
            System.out.println("+++++++ПОБЕДИЛ " + chose1.getName() + "++++++++++++" );
        } else {
            System.out.println("+++++++ПОБЕДИЛ " + chose2.getName() + "++++++++++++" );
        }
    }
}
