// hänvisar till vilken mapp klassen ligger i 
package characters.subclasses.subsub;
// importerar klassen Allied från mappen "subclasses" (alltså den klassen som Soldier ärver ifrån)
import characters.subclasses.Allied;
import java.util.Random;

public class Soldier extends Allied {
    
    private final String[] phrases = {
        "i will always have yor back, brother",
        "nice armor you have, is it new?",
        "I dont like war, but i really like Aliens for breakfast",
        "Dude, you smoke weed??",
        "Primeminister doesnt give a shit about us on the field..."
    };
    
    public Soldier(String name, int health, int armor) {
        super(name, health, armor);
    }
    @Override
    public void attack() {
        System.out.println(name + " makes an Attack!");
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
