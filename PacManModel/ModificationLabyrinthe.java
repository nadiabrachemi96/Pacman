package PacManModel;

import java.awt.Color;

public class ModificationLabyrinthe  extends Pacgommee implements Effet {

	protected ModificationLabyrinthe(int XPosition, int YPosition) {
		super(XPosition, YPosition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void effect(){
		// TODO Auto-generated method stub
        Game.changeMap();
        Game.getpacman().changerMap();
        Game.getpacman().GagnerPoints(1000);
 	}
	
	@Override
	public Color getColor() {	
		Color clr=new Color(4,166,24);
		return clr;
		
	}
	

}
