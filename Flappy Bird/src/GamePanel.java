import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private BufferedImage backgroundImage;
	private int score=0;
	
	private Bird bird=new Bird();
	private Wall wall=new Wall(600);
	private Wall wall2=new Wall(600+300);
	
	public GamePanel(){
		
			try {
				backgroundImage=ImageIO.read(getClass().getResource("/image/background.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
			this.addMouseListener(new MouseAdapter(){
				
				@Override
				public void mouseClicked(MouseEvent e){
					super.mouseClicked(e);
					bird.goUpwords();
				}
			});
		
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);	
	     g.drawImage(backgroundImage, 0, 0, null);
		 bird.drawBird(g);
		 wall.drawWall(g);
		 wall2.drawWall(g);
		 
		 g.drawString("Score is:"+score,80,20); //for drawing Game Score
		 	
	}
	
	public void moveBird_Wall(){
		bird.birdMovement();
		wall.wallMovement();
		wall2.wallMovement();
	}
	
	
	public void collision_BirdAndWall(){
	if(	bird.bardRactangle().intersects(wall.lowerWallRactangle()) || bird.bardRactangle().intersects(wall.upperWallRactangle()) || 
		bird.bardRactangle().intersects(wall2.lowerWallRactangle())||bird.bardRactangle().intersects(wall2.upperWallRactangle())){
	    Frame.timer.stop();
		JOptionPane.showMessageDialog(null, "             GAME OVER");
	}
	
	else if(bird.x==wall.x || bird.x==wall2.x){
		score++;
		System.out.println(score);
		
	}
	
	
	
	}
	
	
	
	
	
	
	
	
}
