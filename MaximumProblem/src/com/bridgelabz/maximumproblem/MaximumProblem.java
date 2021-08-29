package com.bridgelabz.maximumproblem;

public class MaximumProblem <T extends Comparable<T>> {
	T firstTerm,secondTerm,thirdTerm;
	
	public MaximumProblem(T firstTerm, T secondTerm, T thirdTerm) {
		this.firstTerm = firstTerm;
		this.secondTerm = secondTerm;
		this.thirdTerm = thirdTerm;
	}
	public void getMaximumNumber() {
		if(firstTerm.compareTo(secondTerm)>0) {
			if(firstTerm.compareTo(thirdTerm)>0)
				System.out.println("Maximum: "+firstTerm);
			else
				System.out.println("Maximum: "+thirdTerm);
		}
		else {
			if(secondTerm.compareTo(thirdTerm)>0)
				System.out.println("Maximum: "+secondTerm);
			else
				System.out.println("Maximum: "+thirdTerm);
		}
	}
	public static void main(String[] args) {
		new MaximumProblem<Integer>(4,7,2).getMaximumNumber();
		new MaximumProblem<Float>(2.5f,1.2f,5.7f).getMaximumNumber();
		new MaximumProblem<String>("Dog","Tiger","Snake").getMaximumNumber();
	}
	

}
