package PacManModel;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Fenetre extends JPanel {
	
 	private static final long serialVersionUID = 1L;
 	JFrame frame=new JFrame();
  	private Key KeyList=new Key();
	private Graphe gph=Game.getGh();
	
	
	public Color getColor3() {
	Color clr=new Color(192,192,192);//La couleur du background
	return clr;
	}
	
	
 public Fenetre() {
	 
     frame.setContentPane(gph);
	 frame.setSize(Game.getWidth(),Game.getHeight());
	 frame.setTitle("Pac-Man");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setLocationRelativeTo(null);
	 frame.setVisible(true);
	 frame.setBackground(getColor3());
	 frame.add(this);
	 frame.addKeyListener(KeyList);
	 
   }
}
