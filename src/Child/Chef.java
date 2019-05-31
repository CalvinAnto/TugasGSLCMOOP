package Child;

import Interfaces.IChef;
import Parent.BaseCharacter;

public class Chef extends BaseCharacter implements IChef {

	public Chef() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Cook() {
		System.out.println("Chef Cooks");
		
	}

	public Chef(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

}
