import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Bird {
	
		private BufferedImage birdImage;
		
	    int x=282;
		private static int y=400;
		private int speed=2;
		
		public Bird(){
			
				try {
					birdImage=ImageIO.read(getClass().getResource("/image/bird.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		
		public void drawBird(Graphics g){
			
			g.drawImage(birdImage, x, y, null);
		}
	
	
		public void birdMovement(){
			if(y>=0 && y<=730){
				speed=speed+1;
				y=y+speed;
			}
		}
		
		
		
		public void goUpwords(){
			speed=-15;
		
			
		}
		
		
		public Rectangle bardRactangle(){
			Rectangle OnBird= new Rectangle(x,y,40,35);
			return OnBird;
		}
	
	
	
	

}
