import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Wall{
     
	private BufferedImage wallImage;
	
	private Random r=new Random();
    int x;
	private int y=r.nextInt(400)+200;
	
	
	
	public Wall(int x){
		        this.x=x;
				try {
					wallImage=ImageIO.read(getClass().getResource("/image/wall.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}
	
	
	public void drawWall(Graphics g){
		g.drawImage(wallImage, x, y, null); //bottom 
		g.drawImage(wallImage, x, -1000+y , null);  //yop
	}

	
	
	public void wallMovement(){
		
		x=x-3;
		if(x<-2){
			x=600;
			y=r.nextInt(400)+200;
		}
		
		
		
		
	}
	
	public Rectangle lowerWallRactangle(){
		
		Rectangle OnlowerWall= new Rectangle(x,y,45,800);
		return OnlowerWall;
	}
	
	
   public Rectangle upperWallRactangle(){
		
	   Rectangle OnUpperWall= new Rectangle(x,-1000+y,45,800);
		return OnUpperWall;
	}
	
	
	
	






}
