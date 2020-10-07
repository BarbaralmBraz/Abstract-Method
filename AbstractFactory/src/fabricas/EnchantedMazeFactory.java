package fabricas;

import maze.MazeGame;
import paredes.AbstractWall;
import paredes.MagiclWall;
import portas.AbstractDoor;
import portas.MagicDoor;
import salas.AbstractRoom;
import salas.EnchatedRoom;

public class EnchantedMazeFactory extends AbstractMazeFactory {
	
	
	public EnchantedMazeFactory() {
		super();
		
	}

	@Override
	public AbstractWall makeWall() {
		MagiclWall retorno = new MagiclWall();
		return retorno;
	}

	@Override
	public AbstractRoom makeRoom() {
		EnchatedRoom retorno = new EnchatedRoom();
		return retorno;
	}

	@Override
	public AbstractDoor makeDoor() {
		MagicDoor retorno = new MagicDoor();
		return retorno;
	}

}
