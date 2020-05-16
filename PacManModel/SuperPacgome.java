package PacManModel;

import java.awt.Color;

public class SuperPacgome extends  Pacgommee  implements Effet{
	
	protected SuperPacgome(int XPosition, int YPosition) {
		super(XPosition, YPosition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void effect() {
		// TODO Auto-generated method stub
		Game.getpacman().setState(new SuperPacMan(Game.getpacman()));
		Game.getFontome1().setState(new FontomeVulnerable(Game.getFontome1()));
		Game.getFontome2().setState(new FontomeVulnerable(Game.getFontome2()));
		Game.getFontome3().setState(new FontomeVulnerable(Game.getFontome3()));
		Game.getFontome4().setState(new FontomeVulnerable(Game.getFontome4()));
		Game.getpacman().GagnerPoints(500);
	//	Game.PositionStartFontome();
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		Color clr=new Color(239,103,37);
		return clr;
	}
}
