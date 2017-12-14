public class Mage extends Protagonist {

    public Mage (String inputName) {
	super (inputName);
        health = 150;
        strength = 130;
        defense = 25;
        attack = 1;
    }

    public String toString() {
	return "Mage " + super.toString();
    }
}
