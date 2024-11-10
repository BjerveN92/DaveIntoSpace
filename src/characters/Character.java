package characters;

public abstract class Character {
    
    protected String name;
    protected int health;
    protected int armor;
    
    public Character(String name, int health, int armor) {
        this.name = name;
        this.health = health;
        this.health = armor;
    }
    // abstrakta metoder som bara kan nås av subklasserna(där dom implenteras)
    public abstract void attack();
    public abstract void defend();

   // ej abstrakta metoder 
    public void talk(){
        System.out.println(name + " says: Hello!");
    }

}
