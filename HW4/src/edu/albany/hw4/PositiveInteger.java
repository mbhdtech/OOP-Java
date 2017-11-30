package edu.albany.hw4;

public class PositiveInteger extends Semigroup<PositiveInteger> {
	//Just a positive Integer
	private int integer;
	
	//Simple Constructor 
	public PositiveInteger(int number) {
            this.integer = number;
    }
	
	//If a number was not specified, just use 0.
	public PositiveInteger() {
		this.integer = 0;
	}
	
	//Getter
	public int getInteger() {
		return this.integer;
	}
	
	//Implementation of the method from the abstract class
	public PositiveInteger operation(PositiveInteger obj ) {
		int sum = obj.getInteger() + this.integer;
		return new PositiveInteger(sum);
	}
}
