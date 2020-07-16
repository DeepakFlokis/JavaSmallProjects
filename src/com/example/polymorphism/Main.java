package com.example.polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PolyMorphismClass pmc1 = new  PmcChild1();
    PolyMorphismClass pmc2 = new PmcChild2();
    PolyMorphismClass pmc3 = new PmcChild3();
    
    System.out.println("pmcChild1 interest rate : " + pmc1.getInterestRate());
    System.out.println("pmcChild2 interest rate : " + pmc2.getInterestRate());
    System.out.println("pmcChild3 interest rate : " + pmc3.getInterestRate());
    
    
    Bike2 obj = new Bike2();
    obj.run();
    
    IntanceOfExampleChild ioe = new IntanceOfExampleChild();
    System.out.println(ioe instanceof IntanceOfExample);
    
    
	}

}
