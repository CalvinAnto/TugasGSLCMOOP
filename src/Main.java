import java.util.Scanner;
import java.util.Vector;

import Child.Artist;
import Child.Beggar;
import Child.Butler;
import Child.Chef;
import Child.Driver;
import Child.Genius;
import Parent.BaseCharacter;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Vector<BaseCharacter> charList = new Vector<BaseCharacter>();
	
	public Main() {
		
		charList.add(new Artist("Artist", "someone who can paint"));             //0
		charList.add(new Beggar("Beggarm", "someone who can't do anything"));    //1
		charList.add(new Butler("Butler", "someone who can drive, cook, work")); //2
		charList.add(new Driver("Driver", "someone who can drive"));             //3
		charList.add(new Genius("Genius", "someone who can do everything"));     //4
		charList.add(new Chef("Chef", "someone who can cook"));                  //5
		
		String action = "";
		String selection = "";
		menu();
		action = scan.next();
		selection = scan.nextLine();
		String[] selectionList = selection.split(",");
		
		
		
		for (String string : selectionList) {			
			doAction(action, Integer.parseInt(string.trim()));
		}
	}
	
	public void doAction(String action, int worker) {
		switch(action) {
		case "Work":
			switch(worker) {
			case 2:
				((Butler) charList.get(worker)).Work();
				break;
			case 4:
				((Genius) charList.get(worker)).Work();
				break;
			default:
				System.out.println("Character can't do the action");
				break;
			}
			break;
		case "Drive":
			switch(worker) {
			case 2:
				((Butler) charList.get(worker)).Drive();
				break;
			case 3:
				((Driver) charList.get(worker)).Drive();
				break;
			case 4:
				((Genius) charList.get(worker)).Drive();
				break;
			default:
				System.out.println("Character can't do the action");
				break;
			}
			break;
		case "Cook":
			switch(worker) {
			case 2:
				((Butler) charList.get(worker)).Cook();
				break;
			case 4:
				((Genius) charList.get(worker)).Cook();
				break;
			case 5:
				((Chef) charList.get(worker)).Cook();
				break;
			default:
				System.out.println("Character can't do the action");
				break;
			}
			break;
		case "Paint":
			switch(worker) {
			case 0:
				((Artist) charList.get(worker)).Paint();
				break;
			case 4:
				((Genius) charList.get(worker)).Paint();
				break;
			default:
				System.out.println("Character can't do the action");
				break;
			}
			break;
		case "Info":
			charList.get(worker).getInfo();
			break;
		}
	}
	
	public void menu() {
		clear();
		System.out.println("Simulasi kelompok kemampuan");
		System.out.println("0: Genius");
		System.out.println("1: Butler");
		System.out.println("2: Driver");
		System.out.println("3: Artist");
		System.out.println("4: Chef");
		System.out.println("5: Beggar");
		System.out.print("Input: ");
	}
	
	public void clear() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	public static void main(String[] args) {
		new Main();

	}

}
