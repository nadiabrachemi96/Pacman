package PacManModel;

import java.awt.Color;




public class PacManNormal extends  PacManState {

	protected PacManNormal(Pacman pacman) {
		super(pacman);
		// TODO Auto-generated constructor stub
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return State.PacManNormal;
	}

	@Override
	public Color getCLR() {
		// TODO Auto-generated method stub
		return Color.YELLOW;
	}

	@Override
	public void setCLR(Color c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public State setState(State s) {
		// TODO Auto-generated method stub
		return null;
	}


}
