package fabricas;

import maze.MazeGame;
import paredes.AbstractWall;
import portas.AbstractDoor;
import salas.AbstractRoom;

public abstract class AbstractMazeFactory {
	
	public  MazeGame makeMaze() {
		MazeGame retorno = new MazeGame();
		return retorno;
	}
	
	public abstract AbstractWall makeWall();
	
	public abstract AbstractRoom makeRoom();
	
	public abstract AbstractDoor makeDoor();
	
	
	
}
