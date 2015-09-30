package cm.dart.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatList {

	public static void main(String[] args) {
	
		
		System.out.println("Type 1 for computer, 2 for cup and -1 to quit");
		Scanner value = new Scanner(System.in);
	
		List<Computer> computers = new ArrayList<Computer>();
		List<Cup> cups = new ArrayList<Cup>();
		int sc = value.nextInt();
		Scanner i = value;
		
		do{
		if (sc == 1){

			System.out.println("Please enter computer's color");
			Scanner value1 = new Scanner(System.in);
			String color = value1.nextLine();
			System.out.println("Please enter computer's manufacturer");
			String manufacturer = value1.nextLine();
			System.out.println("Please enter computer's keyboardtype");
			String keyBoardType= value1.nextLine();
			System.out.println("Please enter computer's memory");
			String  memory= value1.nextLine();
			Computer mycomputer = new Computer();
			mycomputer.setColor(color);
			mycomputer.setManufacturer(manufacturer);
			mycomputer.setKeyBoardType(keyBoardType);
			mycomputer.setMemory(memory);
			
			computers.add(mycomputer);
			System.out.println(computers);
		}	
		else if (sc ==2){
			System.out.println("Please enter cup's color");
			Scanner value1 = new Scanner(System.in);
			String color = value1.nextLine();
			System.out.println("Please enter cup's capacity");
			String capacity = value1.nextLine();
			System.out.println("Please enter cup's drinktype");
			String drinktype = value1.nextLine();
			Cup myCup = new Cup();
			
			myCup.setColor(color);
			myCup.setCapacity(capacity);
			myCup.setDrinkType(drinktype);
			cups.add(myCup);
			System.out.println(cups);
		}
		if (sc !=1 && sc !=2){
			System.out.println("Programme terminated");	
		}
		}
		while(sc != -1);
		
	}

}







