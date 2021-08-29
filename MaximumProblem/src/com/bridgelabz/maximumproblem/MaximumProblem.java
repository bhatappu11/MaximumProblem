package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void getMaximumNumber(Integer firstInteger,Integer secondInteger,Integer thirdInteger) {
		if(firstInteger.compareTo(secondInteger)>0) {
			if(firstInteger.compareTo(thirdInteger)>0)
				System.out.println("Maximum number: "+firstInteger);
		}
		else {
			if(secondInteger.compareTo(thirdInteger)>0)
				System.out.println("Maximum number: "+secondInteger);
			else
				System.out.println("Maximum number: "+thirdInteger);
		}
	}
	public static void main(String[] args) {
		getMaximumNumber(4,7,2);		
	}

}
