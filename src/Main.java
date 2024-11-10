import characters.subclasses.Enemy;
import characters.subclasses.subsub.Soldier;
import items.Weapon;


public class Main {
    public static void main(String[] args) throws Exception {
        // två objekt från vardera klasser
        Enemy bandit = new Enemy("Greger the childmolester", 100, 100, true);
        Soldier soldier = new Soldier("Sgt. Johnson", 100, 100, true, new Weapon("M16", "Assault Rifle", 10));
        // två objekt från subsubklasser        
        // testa att prata, attackera och försvara
        System.out.println("\033c");

        // System.out.println();
        // bandit.talk();
        // bandit.attack();
        // bandit.defend();
        soldier.talk();
        soldier.attack();
        soldier.defend();
    }
}