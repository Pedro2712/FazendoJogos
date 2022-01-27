package com.aprender.graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	private BufferedImage spritsheet;

	public Spritesheet(String path) 
	{
		try {
			this.spritsheet= ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public BufferedImage getSprite(int x, int y, int width, int heigth) {
		return spritsheet.getSubimage(x, y, width, heigth);
	}
	
}
