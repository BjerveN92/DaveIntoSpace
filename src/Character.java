import java.util.Random;

public abstract class Character {
    
    protected String name;
    protected int health;  
    protected int armor;
    private final String[] phrases;
    
    
    public Character(String name, int health, int armor, String[] phrases) {
        this.name = name;
        this.health = health;
        this.health = armor;
        this.phrases = phrases;
        
    }

    public abstract void attack();
    public abstract void defend();

   
   
    public void talk(){
        String phrase = randPhrase();
        System.out.println(phrase);
    }
    
    private String randPhrase() {
        Random rand = new Random();
        return phrases[rand.nextInt(phrases.length)];
    }
}
