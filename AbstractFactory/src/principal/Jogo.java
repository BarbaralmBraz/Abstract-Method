package principal;

import fabricas.AbstractMazeFactory;
import fabricas.EnchantedMazeFactory;
import fabricas.MazeFactory;
import paredes.AbstractWall;
import portas.AbstractDoor;
import salas.AbstractRoom;

public class Jogo {
	
	private static AbstractRoom room;
	private static AbstractDoor door;
	private static AbstractWall wall;
	
	
	private static AbstractMazeFactory fabrica;
	
	
	
	private static String criarJogo(String tipoJogo) {
		
		String saida;
		
		switch(tipoJogo.toLowerCase()){
		
			case "simple":
				fabrica = new MazeFactory();
				room = fabrica.makeRoom();
				door = fabrica.makeDoor();
				wall = fabrica.makeWall();
				room.setDoor(door);
				room.setWall(wall);
				saida = room.toString();
				
				break;
				
			case "magic":
				fabrica = new EnchantedMazeFactory();
				room = fabrica.makeRoom();
				door = fabrica.makeDoor();
				wall = fabrica.makeWall();
				room.setDoor(door);
				room.setWall(wall);
				saida = room.toString();
				
				break;
				
			default:
				
				saida = "opção inválida!";
				
				break;
		}	
		
		return saida;
				
				
						
	}
	
	public static void main(String[]args) {
		
		String saida = " ";
		
		System.out.println("Exemplo de criação de jogo simples.");
		saida = criarJogo("simple");
		
		System.out.println(saida);
		
		
		System.out.println("\n\n\n");
		
		
		System.out.println("Exemplo de criação de jogo encantado.");
		saida = criarJogo("magic");
		
		System.out.println(saida);
		
	}
	
	

}
