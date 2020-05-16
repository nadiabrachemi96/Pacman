package PacManModel;

import java.awt.Color;

public class FontomeNormal extends FontomeState {

	protected FontomeNormal(Fontome fontome) {
		super(fontome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State setState(State s) {
		// TODO Auto-generated method stub
		return null;
	}


	public Color getColor3() {
		Color clr=new Color(49,96,96);
		return clr;
	}
	
	@Override
	public Color getCLR() {
		return getColor3();
	}

	@Override
	public Boolean kill(Coordinate c) {
		if(Game.getpacman().getBody().get(0).getX()==c.getX()&&Game.getpacman().getBody().get(0).getY()==c.getY())
			return true;
			
		return false;
	}

}
