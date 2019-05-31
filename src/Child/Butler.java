package Child;

import Interfaces.IChef;
import Interfaces.IDriver;
import Interfaces.IWorker;
import Parent.BaseCharacter;

public class Butler extends BaseCharacter implements IDriver, IWorker, IChef {

	public Butler() {
		
	}

	@Override
	public void Cook() {
		System.out.println("Butler Cooks");
		
	}

	@Override
	public void Work() {
		System.out.println("Butler Works");
		
	}

	@Override
	public void Drive() {
		System.out.println("Butler Drives");
		
	}

	public Butler(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

}
