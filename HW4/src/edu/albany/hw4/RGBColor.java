package edu.albany.hw4;

public class RGBColor extends Semigroup<RGBColor> implements Complementable<RGBColor> {
	private int red;
	private int green;
	private int blue;
	private int maxValue = 255;
	
	
	//Getters for Colors
	public int getRed() {
		return this.red;
	}
	
	public int getGreen() {
		return this.green;
	}
	
	public int getBlue() {
		return this.blue;
	}
	
	public RGBColor complementFunction() {
		//Complement of numbers with the values of this current instance
		return new RGBColor(maxValue - red, maxValue - green, maxValue - blue);
	}
	
	public RGBColor operation(RGBColor colors) {
		return new RGBColor(((colors.getRed() + this.red)/2), ((colors.getGreen() + this.green)/2), ((colors.getBlue() + this.blue)/2) );
	}
	
	public RGBColor(int r, int g, int b) {
		this.red = r;
		this.green = g;
		this.blue = b; 
	}
	
	public String toString() {
		return "Colors: R" + this.red + " G" + this.green + " B" + this.blue; 
	}
}
