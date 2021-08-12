import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;



public  class ManuPanel extends JPanel {
	
	
	private BufferedImage manuImage;
	
	public ManuPanel(){
		
			try {
				manuImage=ImageIO.read(getClass().getResource("/image/manu.png"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		
		
		this.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				super.mouseClicked(e);
				Frame.manuPanelToGamePanel=true;
			}
		});
		
	}
	
	
	@Override
	public void paint(Graphics g){
		super.paint(g);	
		g.drawImage(manuImage, 0, 0, 600, 800, null);
		
	}
	
	
	
	
	
	

}
