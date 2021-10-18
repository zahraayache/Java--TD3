package model;

import java.awt.Graphics;

import controller.MouseController;

public class MyModel {
	private int x ,y ;
	
	private MouseController Controller;

	/**
	 * 
	 * @param controller
	 * this method will set the controller to the model
	 */
	public void setController(MouseController controller) {
		this.Controller = controller;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
}
