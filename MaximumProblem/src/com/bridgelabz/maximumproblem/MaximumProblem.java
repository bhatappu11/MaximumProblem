package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	public static void getMaximumNumber(Integer firstInteger,Integer secondInteger,Integer thirdInteger) {
		if(firstInteger.compareTo(secondInteger)>0) {
			if(firstInteger.compareTo(thirdInteger)>0)
				System.out.println("Maximum number: "+firstInteger);
			else
				System.out.println("Maximum number: "+secondInteger);
		}
		else {
			if(secondInteger.compareTo(thirdInteger)>0)
				System.out.println("Maximum number: "+secondInteger);
			else
				System.out.println("Maximum number: "+thirdInteger);
		}
	}
	public static void getMaximumNumber(Float firstFloat,Float secondFloat,Float thirdFloat) {
		if(firstFloat.compareTo(secondFloat)>0) {
			if(firstFloat.compareTo(thirdFloat)>0)
				System.out.println("Maximum number: "+firstFloat);
			else
				System.out.println("Maximum number: "+thirdFloat);
		}
		else {
			if(secondFloat.compareTo(thirdFloat)>0)
				System.out.println("Maximum number: "+secondFloat);
			else
				System.out.println("Maximum number: "+thirdFloat);
		}
	}
	public static void main(String[] args) {
		getMaximumNumber(4,7,2);
		getMaximumNumber(2.5f,1.2f,5.7f);
	}

}
