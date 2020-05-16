package PacManModel;

import java.awt.Color;

public abstract class Pacgommee {
	
	protected int XPosition;
	protected int YPosition;
    
	public abstract Color getColor();
	
	
	
	protected Pacgommee(int XPosition,int YPosition) {
		this.XPosition=XPosition;
		this.YPosition=YPosition;
	}
	

	protected int getXPosition() {
		return XPosition;
	}

	
	protected int getYPosition() {
		return YPosition;
	}
	public void effect() {};
	
}
