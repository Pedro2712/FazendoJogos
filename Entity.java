package com.aprender.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {
	protected int x;
	protected int y;
	protected int widht;
	protected int height;

	private BufferedImage sprite;
	
	public Entity(int x, int y, int widht, int height, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.widht = widht;
		this.height = height;
		this.sprite = sprite;
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

	public int getWidht() {
		return widht;
	}

	public int getHeight() {
		return height;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, this.getX(), this.getY(), null);
	}

}