import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
	  public void paintComponent(Graphics g){
	    try {
	      int x = this.getWidth()/4;
		  int y = this.getHeight()/4;
	      Image img = ImageIO.read(new File("image.png"));
	      
	      g.drawImage(img, 0, 0, this);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }                
	  }               
}