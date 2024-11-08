public class Allied extends Character {
    
    public Allied(String name, int health, int armor) {
        super(name, health, armor, new String[] {
            "Dont you worry, i got you back",
            "I have extra ammo if needed, dont you worry",
            "Dude, you smoke weed?",
            "I dont like war, but i really like Aliens for breakfast",
            "The primeminister doesent give a shit about us on the field..."
        });
    }
    // metoder för att attackera, försvara och prata, hämtade från Character
    @Override
    public void attack() {
        System.out.println(name + " makes an Attack!");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends itself!");
    }


}
