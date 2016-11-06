package javagame;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	
	public Menu(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg,Graphics g) throws SlickException{
		//g.drawString("PACMAN!", 50, 50);
		g.drawRect(5, 5, 490,490);
		
		Image pacmanTitle = new Image("images/pacman.jpg");
		//pacmanTitle.draw(10, 10);
		g.drawImage(pacmanTitle, 100, 100);
		
	}
	
	public void update(GameContainer gc, StateBasedGame sbg,int delta) throws SlickException{
		
	}
	
	public int getID(){
		return 0;
	}
	
}