package PacManModel;

import java.awt.Color;


public abstract class PacManState {
public static enum State{PacManNormal,SuperPacMan,PacMamInvisible}

protected Pacman pacman;

protected PacManState(Pacman pacman) {
		this.pacman=pacman;
					}

public abstract State getState();
public abstract State setState(State s);
public abstract Color getCLR();

public abstract void setCLR(Color c);




}
