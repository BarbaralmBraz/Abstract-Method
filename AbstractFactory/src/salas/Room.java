package salas;

public class Room extends AbstractRoom{

	public Room() {
		super();
		
	}
	
	@Override
	public String toString() {
		return " I'm SimpleRoom and i have " + super.toString();
	}

}
