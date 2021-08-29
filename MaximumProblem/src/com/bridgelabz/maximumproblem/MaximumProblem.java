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
	private static void getMaximumNumber(String firstString, String secondString, String thirdString) {
		if(firstString.compareTo(secondString)>0) {
			if(firstString.compareTo(thirdString)>0)
				System.out.println("Maximum number: "+firstString);
			else
				System.out.println("Maximum number: "+thirdString);
		}
		else {
			if(secondString.compareTo(thirdString)>0)
				System.out.println("Maximum number: "+secondString);
			else
				System.out.println("Maximum number: "+thirdString);
		}
		
	}
	public static void main(String[] args) {
		getMaximumNumber(4,7,2);
		getMaximumNumber(2.5f,1.2f,5.7f);
		getMaximumNumber("Dog","Tiger","Snake");
	}
	

}
