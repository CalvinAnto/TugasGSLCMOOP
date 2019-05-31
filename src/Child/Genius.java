package Child;

import Interfaces.*;
import Parent.*;

public class Genius extends BaseCharacter implements IArtist, IChef, IDriver, IWorker{

	public Genius(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	public Genius() {
		
	}

	@Override
	public void Work() {
		System.out.println("Genius Works");
	}

	@Override
	public void Drive() {
		System.out.println("Genius Drives");
		
	}

	@Override
	public void Cook() {
		System.out.println("Genius Cooks");
		
	}

	@Override
	public void Paint() {
		System.out.println("Genius Paints");
		
	}

}
