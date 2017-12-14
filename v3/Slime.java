public class Slime extends Monster {

    public Slime (String inputName) {
	super(inputName);
	health = 60;
	strength = 25 + (int)(40 *Math.random());
	defense = 15 + (int)(30 * Math.random());
	attack = .3;
    }

    public String toString() {
	return "Slime " + super.toString();
    }
}
