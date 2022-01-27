package com.aprender.entities;

import java.awt.image.BufferedImage;

public class Player extends Entity{
	
	private boolean right, up, left, down;
	private int speed;
	
	public Player(int x, int y, int widht, int height, BufferedImage sprite) {
		super(x, y, widht, height, sprite);
		this.speed= 4;
	}	

	public void setRight(boolean right) {
		this.right = right;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public void tick() {
		if (right) {
			x+= this.speed;
		}else if(left) {
			x-= this.speed;
		}
		
		if (up) {
			y+= this.speed;
		}else if(down) {
			y-= this.speed;
		}
		
	}
}
