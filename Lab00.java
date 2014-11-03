/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Sam Rooney>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/


import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab00 {

     public static void main(String[] args) {
             Display.openWorld("maps/first.map");
   Display.setSize(10, 10);
   Display.setSpeed(1);
  Robot karel = new Robot();
   karel.move();
   karel.pickBeeper();
   karel.move();
   karel.turnLeft();
   karel.move();
   karel.putBeeper();
   karel.move();
   karel.turnLeft();
   karel.turnLeft();
  
     }
}


public class SampleSubclass extends Object {

	private String nickname; // a new data field!  Object does not have this
	
	public SampleSubclass(String n) { // a constructor for this object
		super(); 
		nickname = n; // take the String provided and store it in the 'name' data field
	}
	
	@Override // redefine behavior inherited from the superclass
	public String toString() {
		return nickname;
	}
	
	/**
	 * Create a greeting String
	 * 
	 * @return	a casual greeting
	 */
	public String sayHello() {
		return "Hi.  You can call me "+nickname;
	}
	
	/**
	 * Change the nickname of this particular instance
	 * 
	 * @param newname
	 * 		the new nickname that this instance should hold
	 */
	public void changeName(String newname) {
		nickname = newname;
	}
}
