public class Warrior extends Protagonist {
    
    public Warrior (String inputName) {
	super(inputName);
	health = 200;
        strength = 150;
        defense = 65;
        attack = .5;
    }

    public String toString() {
	return "Warrior " + super.toString();
    }
}
