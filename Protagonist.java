/* error: Protagonist is not abstract and does not override abstract method toString() in Protagonist  */


public abstract class Protagonist extends Character{
    
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

    public abstract String toString();
    
}
