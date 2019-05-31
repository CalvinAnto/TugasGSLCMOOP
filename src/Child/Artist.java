package Child;

import Interfaces.IArtist;
import Parent.BaseCharacter;

public class Artist extends BaseCharacter implements IArtist {

	public Artist() {
		// TODO Auto-generated constructor stub
	}

	public Artist(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Paint() {
		System.out.println("Artist Paints");
		
	}

}
