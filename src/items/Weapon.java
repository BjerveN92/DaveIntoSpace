package items;

public class Weapon {
    
    protected String name;
    protected String type;
    protected int damage;

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
