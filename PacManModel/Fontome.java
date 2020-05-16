
package PacManModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;




public class Fontome {
	
    private List<Coordinate> body; 
	private Game game;
	private DirectionFantome direction;
	private boolean alive; //vrai si le pacman est vivant
	private List<PacmanObserver> observers;
    private FontomeState State;
    
    
	public Fontome(Game game, Coordinate start) {
		setObservers(new ArrayList<>());
		alive = true;
		this.game = game;
		direction = DirectionFantome.Right; //la direction par defaut des fantomes
		body = new ArrayList<>();
		body.add(start);
	    State=new FontomeNormal(this);
	}
 
	
	public FontomeState getState() {
		return State;
	}

	public void setState(FontomeState state) {
		State = state;
	}

	public Color getColorFontome() {
		return State.getCLR();
	}
	
	public Boolean   Kill(Coordinate c){	
		return State.kill(c);
	}
	
	public DirectionFantome getDirection() {
		return direction;
	}

	public void setDirection(DirectionFantome direction) {
		this.direction = direction;
	}
	
	
	public DirectionFantome getDirectionAleatoire() {
		Random rand = new Random(); 
		int nombreAleatoire = rand.nextInt(4);
		DirectionFantome directionale = null ;
		directionale=DirectionFantome.Down;
		switch(nombreAleatoire) {
		case 0:	directionale=DirectionFantome.Down;
		break;
		case 1:	directionale=DirectionFantome.Left;
		break;
		case 2:	directionale=DirectionFantome.Right;
		break;
		case 3:	directionale=DirectionFantome.Up;
		break;
		}
		return directionale;
	}
	
	
	public List<Coordinate> getBody() {
		return new ArrayList<>(body);
	}
    
	public void move() {
		
		Coordinate current = body.get(body.size() - 1);
		Coordinate next = new Coordinate(current.getX() + direction.getX(), current.getY() + direction.getY());
		if(next.getX()!=-1&&next.getX()!=35)	
	    while(game.isOut(next)) {
		direction=this.getDirectionAleatoire();
	    next = new Coordinate(current.getX() + direction.getX(), current.getY() + direction.getY());	
	    
	 }
     
     if(Game.ACote(next)) {
    	  if(next.getX()==-1) {
   		  next.setX(34);
   		  next.setY(9);
   	  }else {
   		  next.setX(0);
   		  next.setY(9);
   	  }
      }
          body.add(next);
 	      body.remove(0);
 	      
 	   //lorsque le Pacman est mort il revient � sa position initiale et les fontomes aussi
      if(this.Kill(next)||this.Kill(current)) {
	      game.PositionStartFontome();
	      Game.getpacman().setAlive();
    	  Game.getpacman().getBody().get(0).setX(18);
    	  Game.getpacman().getBody().get(0).setY(17); 
    	  Game.getpacman().getDirections().set(0,Direction.Up);
    	  Game.getpacman().getDirections().set(1,Direction.Up);
       }
      }

	public boolean isAlive() {
		return alive;
	}


	public List<PacmanObserver> getObservers() {
		return observers;
	}


	public void setObservers(List<PacmanObserver> observers) {
		this.observers = observers;
	}

}
