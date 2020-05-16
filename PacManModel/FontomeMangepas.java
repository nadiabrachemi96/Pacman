package PacManModel;

import java.awt.Color;

public class FontomeMangepas  extends FontomeState   {

	protected FontomeMangepas(Fontome fontome) {
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
		// TODO Auto-generated method stub
		Color clr=new Color(49,96,96);
		return clr;
	}
	
	@Override
	public Color getCLR() {
		// TODO Auto-generated method stub
		return getColor3();
	}
    
	//le fantome devient vulnerable 
	@Override
	public Boolean kill(Coordinate c) {
		// TODO Auto-generated method stub
		return false;
	}

}
