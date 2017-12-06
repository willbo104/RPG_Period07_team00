public class Protagonist extends Character{
    
    private String name;
    
    public Protagonist (String inputName) {
        super(inputName);
    }

    private void specialize () {
	defense -= 15;
	attack += 15;
    }

    private void normalize () {
	defense += 15;
	attack -= 15;
    }

    public String toString() {
	return name + ": " + health + " HP";
    }
}
