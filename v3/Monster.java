public class Monster extends Character{

    public Monster (String inputName) {
	super(inputName);
    }

    public String toString() {
	return name + ": " + health + " HP";
    }
}

