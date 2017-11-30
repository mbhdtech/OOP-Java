package edu.albany.hw4;
import java.util.*;


public class BinaryWord implements Complementable<BinaryWord> {
	private BitSet bitset;
	
	
	
	
	
	// Constructor for BinaryWord that takes in a string argument
	public BinaryWord(String binary) {
		//Use Initialize BitSet
		this.bitset = new BitSet(binary.length());
		//Copy elements from String to BitSet
		int index = 0;
		for (char i : binary.toCharArray()) { 
            if (i == '1') { 
                this.bitset.set(index);
            }
            index++;
        }
	}
	
	
	
	
	
	
	//Implementations of complementFunction from Complementable
	public BinaryWord complementFunction() {
		// Create a new BitSet
		BitSet newSet = new BitSet(this.bitset.length());
	
		//Copies the current BitSet into the new BitSet
		newSet.or(this.bitset);
		newSet.flip(0, this.bitset.length()); // flip each bit
		
		//Turn it to a string (the new BitSet)
		String binary = BittoString(newSet);
		
		//Then return a new instance of BinaryWord
		//System.out.println("Turr");
		//System.out.println(binary);
		return new BinaryWord(binary);
	}

	
	
	
	
	
	//Call the to String method which will call 
	public String BittoString(BitSet bitset) {
		StringBuilder str = new StringBuilder();
        char one = '1';
        char zero = '0';

        //System.out.println(bitset.length());
        for (int i = 0; i <= bitset.length(); i++) { 
        	 
            if (bitset.get(i)) { 
                str.append(one); 
            } else { 
                str.append(zero); 
            }
        }
        //System.out.println();
        return String.valueOf(str);
	}
	
	
	
	public String toString() {
		return BittoString(bitset);
	}
}
