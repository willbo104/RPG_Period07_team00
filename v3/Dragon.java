public class Dragon extends Monster {

    public Dragon (String inputName) {
	super(inputName);
	health = 200;
	strength = 100 + (int)(40 *Math.random());
	defense = 50 + (int)(30 * Math.random());
	attack = .5;
    }

    public String toString() {
	return "Dragon " + super.toString();
    }
}
	
