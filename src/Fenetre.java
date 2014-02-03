import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;





public class Fenetre extends JFrame {
			  public Fenetre(){             
				    this.setTitle("Ma première fenêtre Java");
				    this.setSize(800, 800);
				    this.setLocationRelativeTo(null);               
				 
				    //Instanciation d'un objet JPanel
				    JPanel pan = new JPanel();

				    //On prévient notre JFrame que notre JPanel sera son content pane   
				    this.setContentPane(new Panneau());
				    this.setVisible(true);
				   
		}
			  
}


