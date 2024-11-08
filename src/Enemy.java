import java.util.Random;

public class Enemy extends Character {
    // lista på fraser för fiender
    private String[] phrases = {
        "well well, look whos here, an allie-scum",
        "your armor will melt like fudge on christmas-eve! mohaha",
        "I just looove the smell of dead bodies in the morning",
        "DROP THAT F****N JOINT NOW YOU DAMN HIPPIE!!",
        "Your primeminister is a joke, and so are you! allie-scum!!!"
    };
    public Enemy(String name, int health, int armor) {
        super (name, health, armor);
    }
    // metoder för att attackera, försvara och prata, hämtade från Character
    
    @Override // abstrakt metod
    public void attack() {
        System.out.println(name + " makes an Attack!");
    }

    @Override // abstrakt metod
    public void defend(){
        System.out.println(name + " defends itself!");
    }

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


}
