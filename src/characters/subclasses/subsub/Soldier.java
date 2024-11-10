// hänvisar till vilken mapp klassen ligger i 
package characters.subclasses.subsub;
// importerar klassen det ärvs ifrån!
import characters.subclasses.Allied;
import items.Weapon;
import java.util.Random;

public class Soldier extends Allied {
    
    private Weapon weapon = new Weapon("M16", "Assault Rifle", 10);
   

    private final String[] phrases = {
        "i will always have yor back, brother",
        "nice armor you have, is it new?",
        "I dont like war, but i really like some Aliens for breakfast",
        "Dude, wazzup?",
        "Primeminister doesnt give a shit about us on the field..."
    };
    
    public Soldier(String name, int health, int armor, boolean isArmed, Weapon weapon) {
        super(name, health, armor, isArmed);
        this.weapon = weapon;
    }
    
    
    
    
    
    @Override
    public void attack() {
        System.out.println(name + " makes an Attack with a " + weapon.getName());
    }
    @Override
    public void defend() {
        System.out.println(name + " defends itself!");
    }
    
    
    
    //========================TALK()======================
    @Override // ej abstrakt metod
    public void talk(){
        String phrase = randPhrase();
        System.out.println(phrase);
    }
    // slumtar fram en string ur "phrases"
    private String randPhrase() {
        Random rand = new Random();
        return phrases[rand.nextInt(phrases.length)];
    }
    //====================================================

}
