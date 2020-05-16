package PacManModel;

import java.awt.Color;

public class Invisible extends Pacgommee implements Effet{
	
	public Invisible(int XPosition, int YPosition) {
		super(XPosition, YPosition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void effect() {
		// TODO Auto-generated method stub
		Game.getpacman().setState(new PacManInvisible(Game.getpacman()));
		Game.getFontome1().setState(new FontomeMangepas(Game.getFontome1()));
		Game.getFontome2().setState(new FontomeMangepas(Game.getFontome2()));
		Game.getFontome3().setState(new FontomeMangepas(Game.getFontome3()));
		Game.getFontome4().setState(new FontomeMangepas(Game.getFontome4()));
		Game.getpacman().GagnerPoints(300);
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		Color couleur=new Color(128,0,255);
		return couleur;
	}
	
}
