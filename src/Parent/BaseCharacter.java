package Parent;

public class BaseCharacter {
	
	private String name;
	private String description;

	public BaseCharacter() {
		
	}
	
	public BaseCharacter(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public void getInfo() {
		System.out.println(name + ", " + description);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
