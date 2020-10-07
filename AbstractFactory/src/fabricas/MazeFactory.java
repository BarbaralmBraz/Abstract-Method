package fabricas;


import paredes.AbstractWall;
import paredes.SimpleWall;
import portas.AbstractDoor;
import portas.SimpleDoor;
import salas.AbstractRoom;
import salas.Room;

public class MazeFactory extends AbstractMazeFactory {
	
	
	public MazeFactory() {
		super();
		
	}

	@Override
	public AbstractWall makeWall() {
		SimpleWall retorno = new SimpleWall();
		return retorno;
	}

	@Override
	public AbstractRoom makeRoom() {
		Room retorno = new Room();
		return retorno;
	}

	@Override
	public AbstractDoor makeDoor() {
		SimpleDoor retorno = new SimpleDoor();
		return retorno;
	}

}
