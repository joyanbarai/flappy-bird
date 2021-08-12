import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;


public class Frame extends JFrame{
    public static boolean manuPanelToGamePanel=false;
    public static Timer timer;
   
	
	public Frame(){
		this.setSize(600,730);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Flappy Bird");
		
		
		
	}
	
	
    
	
	
    private ManuPanel mp;
	private GamePanel gp;
	
	
	
	public void setAllPanels(){
		mp= new ManuPanel();
		gp= new GamePanel();
		this.add(mp);
		this.setVisible(true);
		while(manuPanelToGamePanel==false){
			// this is an obstacle not to visible the GamePanel
		}
		this.remove(mp);
		this.add(gp);
		gp.setVisible(true);
		this.revalidate();
		timer.start();
		
		
		
}
	
	
    
	  public void methodForTimer(){
		  
		  timer=new Timer(20,new ActionListener(){
				
				@Override
				public void actionPerformed(ActionEvent e){
					
					gp.moveBird_Wall();
					gp.repaint();
					gp.collision_BirdAndWall();
				}
			});
	  }
	
	
	
	
	
	
	

}
