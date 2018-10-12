
package Animal;

import java.io.*;

public class CatData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Cat one = new Cat("Hamish", "Fat White", 3);
	
		Cat two = new Cat("Tango", "Striped Orange", 10);
		
		one.displayDetails();
		two.displayDetails();
			
		
		Cat three = new Cat();
		
		three.setcatName("Mindy");
		three.setcatBreed("Huge Grey Striped");
		three.setcatAge(10);
		
		three.displayDetails();
	}
	
}
