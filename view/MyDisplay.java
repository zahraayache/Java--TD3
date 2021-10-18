package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MouseController;
import model.Circle;
import model.MyModel;
import model.Point;

public class MyDisplay extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//1 -java.awt.Graphics class provides many methods for graphics programming : like setColor, drawLine.. 
	// -  Graphics2D class extends the Graphics class to provide more sophisticated control over geometry, coordinate transformations, color management, and text layout. This is the fundamental class for rendering 2-dimensional shapes, text and images on the Java(tm) platform.
	// JFrame is the class that can let you create an application layout frame.
	// JPanel is a generic lightweight container.
	
	//Le lien qui connect ses class est que un frame a toujours besoin dans layout un l'interieur(design) => JFrame fait appelle a a un container (JPanel) qui va faire appelle a les design dans le container ( Design ou Design2D)
	
	
	//5- the method paintComponent is called when the window frame appear, it calls it automatically.
	
	//6- AWT is a platform to develop GUI (Graphical User Interface) or window-based applications in Java
	// vs SWING is a lightweight Java graphical user interface (GUI) that is used to create various applications. Swing has components which are platform-independent. It enables the user to create buttons and scroll bars. 
	// swing is more powerlful then AWT and support mvc.
	
	private MyModel model;
	private MouseController controller;
	private Circle circle;
		 public MyDisplay(MyModel model) {
		// TODO Auto-generated constructor stub
			 this.model = model;
			 this.circle = new Circle(new Point(100,100),200);
			 this.model.setX(this.circle.getCenter().getX());
			 this.model.setY(this.circle.getCenter().getY());
			 
		 }
		 
		 public void setController(MouseController controller) {
			 this.controller = controller;
	
			}
		/**
		 *  The method paint will generate the graphics that will be seen inside the container in the Frame.
		 */
	  public void paintComponent(Graphics g) {
		  
		    g.setColor(Color.orange);
		    g.fillRect(0, 0, getWidth(), getHeight());
		    g.setColor(Color.red);
		    g.fillOval(this.model.getX(), this.model.getY(), 
					this.circle.getRadius(), this.circle.getRadius());
		    g.setColor(Color.black);
		    g.drawLine(1000, 1000, 2, 2);
		    
		    
		  }
	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancée - Graphic Display");
		frame.setSize(new Dimension(600,600));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyModel model = new MyModel();
		MyDisplay d = new MyDisplay(model);
		
		
		MouseController cont = new MouseController(d,model);
		frame.add(d);
		frame.addMouseMotionListener(d.controller);
		frame.setVisible(true);
		
		}

	

}
