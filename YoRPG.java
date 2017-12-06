import java.util.Scanner;

public class YoRPG {
    
    public static void main (String[] args) {

	Scanner user_input = new Scanner( System.in );
	
	System.out.println("What is your name?");
	String name = user_input.next();
	
	System.out.println("Choose your class: MAGE, WARRIOR or ARCHER");
	String playerClass = user_input.next();
	
	if (playerClass == "MAGE" || playerClass == "mage" || playerClass == "Mage") {
	    Mage player = new Mage(name);
	    System.out.println("You are a mage named " + name + "!");
	} else if (playerClass == "ARCHER" || playerClass == "Archer" || playerClass == "archer") {
	    Archer player = new Archer(name);
	    System.out.println("You are an archer named " + name + "!");
	} else if (playerClass == "WARRIOR" || playerClass == "Warrior" || playerClass == "warrior") {
	    Warrior player = new Warrior(name);
	    System.out.println("You are a warrior named " + name + "!");
	} else {
	    Warrior player = new Warrior(name);
	    System.out.println("Since you refuse to pick a valid class, you have been defaulted to warrior, and you are now a mage named " + name + "!");
	}
    }
}
	
