package edu.albany.hw4;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		
		//Test for Complement of BinaryWords
		BinaryWord word = new BinaryWord("1101");
        BinaryWord comp = word.complementFunction();
        System.out.println(comp);
        
        //Test for Operation On Positive Integers
        PositiveInteger int1 = new PositiveInteger(25);
        PositiveInteger int2 = new PositiveInteger(25);
        System.out.println(int1.operation(int2).getInteger());
        
        //Print some space
        System.out.println();
        
        //Create a list of RGBColors
        ArrayList<RGBColor> list = new ArrayList<>();
        RGBColor color1 = new RGBColor(23, 45, 138);
        RGBColor color2 = new RGBColor(22, 65, 176);
        RGBColor color3 = new RGBColor(1,1,1);
        
        list.add(color1);
        list.add(color2);
        list.add(color3);
        
        //Carry out the color Blend option on them.
        System.out.println(RGBColor.combine(list));
        
        //RGBColor Complement function
        
        System.out.println(color1.complementFunction());
        
	}
}
