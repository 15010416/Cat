package Animal; 

import java.io.*;

public class Cat {
	
	private String catName;
	private String catBreed;
	private int catAge;

	public Cat(String a, String b, int c)  {
		getCatDetails(a,b,c);
	}

	public Cat() {
	}
	
	public void getCatDetails(String gCatName, String gBreed, int gAge)  {
	  catName = gCatName;
	  catBreed = gBreed;
	  catAge = gAge;
	}
	
	public void displayDetails() throws IOException {
	  System.out.println("Cats name is : "+catName);
	  System.out.println("Cats breed is : "+catBreed);
	  System.out.println("Cats age is : "+catAge);
	}
	
	public void setcatName(String cName) {
		catName = cName;
	}
	
	public void setcatBreed(String cBreed) {
		catBreed = cBreed;
	}
	
	public void setcatAge(int cAge) {
		catAge = cAge;
	}
}
