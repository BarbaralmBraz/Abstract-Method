package salas;

import paredes.AbstractWall;
import portas.AbstractDoor;

public abstract class AbstractRoom {
	
	private AbstractWall wall;
	private AbstractDoor door;
	
	public AbstractWall getWall() {
		return wall;
	}
	public void setWall(AbstractWall wall) {
		this.wall = wall;
	}
	public AbstractDoor getDoor() {
		return door;
	}
	public void setDoor(AbstractDoor door) {
		this.door = door;
	}
	
	
	@Override
	public String toString() {
		return this.wall.toString() + " and " + this.door.toString() ;
	}
	
	
	
	
	

}

