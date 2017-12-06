public class Bandit extends Monster {

    public Bandit (String inputName) {
	super(inputName);
	health = 120;
	strength = 60 + (int)(40 *Math.random());
	defense = 35 + (int)(30 * Math.random());
	attack = .3;
    }

    public String toString() {
	return "Bandit " + super.toString();
    }
}
