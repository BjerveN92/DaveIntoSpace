public class Enemy extends Character {

    public Enemy(String name, int health, int armor) {
        super (name, health, armor, new String[]{
            // minst 5 olika strings
        });
    }
    // metoder för att attackera, försvara och prata, hämtade från Character
    @Override
    public void attack() {
        System.out.println(name + " makes an Attack!");
    }

    @Override
    public void defend(){
        System.out.println(name + " defends itself!");
    }


}
