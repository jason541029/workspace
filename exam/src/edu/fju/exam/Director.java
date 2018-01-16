package edu.fju.exam;

public class Director extends Manager {

	public Director(int amount) {
		super(amount);
		int bouns = 30000;
	}
	public void print(){
		int total = (int)((bouns));
		System.out.println(amount+"\t"+total);
	}

}
