package Child;

import Interfaces.IDriver;
import Parent.BaseCharacter;

public class Driver extends BaseCharacter implements IDriver {

	public Driver() {
		
	}

	@Override
	public void Drive() {
		System.out.println("Driver Drives");
		
	}

	public Driver(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

}
