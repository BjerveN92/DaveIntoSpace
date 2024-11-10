// hänvisar till vilken mapp klassen ligger i 
package characters.subclasses.subsub;
// importerar klassen Allied från mappen "subclasses" (alltså den klassen som Soldier ärver ifrån)
import characters.subclasses.Allied;
import java.util.Random;

public class Worker extends Allied {
    
    private final String[] phrases = {
        // fem olika strings anpassat för worker! 
    };
    
    public Worker(String name, int health, int armor) {
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
