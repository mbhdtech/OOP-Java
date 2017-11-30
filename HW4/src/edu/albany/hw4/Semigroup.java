package edu.albany.hw4;
import java.util.*;
public abstract class Semigroup<T> {
	abstract T operation(T obj);
	
	public static <T extends Semigroup<T>> T combine (Collection<T> list){
		
		T accumulator = (T) list.toArray()[0];
		//list.remove(accumulator);
		
		for(T val : list) {
			if(val.getClass() != accumulator.getClass()) {
				throw new ClassCastException("Not all in the given collection were the same");
			}
			accumulator =  accumulator.operation(val);
		}
		
		return accumulator;
		
	}
}
