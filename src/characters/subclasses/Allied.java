package characters.subclasses;
import characters.Character;


public class Allied extends Character {

    public Allied(String name, int health, int armor) {
        super(name, health, armor);
    }
    // metoder för att attackera, försvara och prata, hämtade från Character
    
    @Override // abstrakt metod från character
    public void attack() {
        System.out.println(name + " makes an Attack!");
    }

    @Override // abstrakt metod från character
    public void defend() {
        System.out.println(name + " defends itself!");
    }
    @Override
    // ej abstrakta metoder 
    public void talk(){
    System.out.println(name + " says: Hello Friend!");
    }
    

}
