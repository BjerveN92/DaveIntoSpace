public abstract class Character {
    
    protected String name;
    protected int health;
    protected int armor;
    
    
    
    public Character(String name, int health, int armor) {
        this.name = name;
        this.health = health;
        this.health = armor;
    }

    public abstract void attack();
    public abstract void defend();

   
    public void talk(){
        System.out.println(name + " says: Hello!");
    }

}
