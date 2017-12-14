public class Archer extends Protagonist {

    public Archer (String inputName) {
	super(inputName);
	health = 150;
	strength = 180;
	defense = 45;
	attack = .5;
    }

    public String toString() {
	return "Archer " + super.toString();
    }
}
