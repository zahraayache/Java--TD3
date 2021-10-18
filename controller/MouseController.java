package controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

import model.MyModel;
import view.MyDisplay;

public class MouseController extends JComponent implements MouseMotionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyDisplay view;
    private MyModel model;
    

    public MouseController(MyDisplay view, MyModel model){
        this.view = view;
        this.model = model;
        model.setController(this);
        view.setController(this);
    }
    
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("here");
	}
	
	/**
	 * Mouse Moved will set x and y the same as the mouse x and y coordinates
	 */
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		view.setBackground(Color.PINK);
		 System.out.println("Mouse movement detected! Actual mouse position is: " + e.getX()+ "," + e.getY() + ".");
		 this.model.setX(e.getX()-130);
		 this.model.setY(e.getY()-150);
		 view.repaint();
	}

}
