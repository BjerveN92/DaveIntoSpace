package items;

public class Weapon {
    
    String name;
    String type;
    int damage;

    public Weapon (String name, String type, int damage) {
        this.name = name;  
        this.type = type;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    
}
