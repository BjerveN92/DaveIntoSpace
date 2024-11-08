public abstract class Character {
    
    protected String name;
    protected int health;  
    protected int armor;
    protected boolean isArmed;
    
    
    public Character(String name, int health, int armor, boolean isArmed) {
        this.name = name;
        this.health = health;
        this.health = armor;
        this.isArmed = isArmed;
    }

    public abstract void attack();
    public abstract void defend();
    public abstract void talk();
}
