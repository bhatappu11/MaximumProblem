package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static <T extends Comparable<T>> void getMaximumNumber(T firstTerm,T secondTerm,T thirdTerm) {
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
		getMaximumNumber(4,7,2);
		getMaximumNumber(2.5f,1.2f,5.7f);
		getMaximumNumber("Dog","Tiger","Snake");
	}
	

}
