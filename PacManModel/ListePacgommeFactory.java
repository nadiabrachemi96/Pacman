package PacManModel;

import java.util.ArrayList;
import java.util.List;

public class ListePacgommeFactory {
	     
         private static List<Pacgommee> pacgommes=new ArrayList<Pacgommee>();
         
   public static  List<Pacgommee> ListePacgomme(){ 
        
	   Pacgommee bnn=null;
	   
	  for(int i =0; i <21; i++) {
   	      for(int j = 0; j <35; j++) {
 
	       if(Game.getMap()[i][j].equals("-")) {
	         if(i==19&&j==1) {
			    bnn=new Invisible(j,i);
			    pacgommes.add(bnn); 
		     }else if(i==1&&j==33){
			     bnn=new SuperPacgome(j,i);
			     pacgommes.add(bnn); 
		     }else if(i==19 && j==33){
			     bnn=new ModificationLabyrinthe(j,i);
			     pacgommes.add(bnn); 
			 }else {
			     bnn=new PacgomeSimple(j,i);
		         pacgommes.add(bnn); 
		         
		     }
	         } 
	      }
	 }
	return pacgommes;
}
}
