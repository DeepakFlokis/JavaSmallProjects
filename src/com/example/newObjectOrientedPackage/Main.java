package com.example.newObjectOrientedPackage;

public class Main {

	public static void main(String[] args) {
		
		SuperClassChild suk = new SuperClassChild();
		suk.display();
		
		FinalKeyword fK = new FinalKeyword();
		//fK.price = 19; // not possible beacuse final keyword price can not be modified;
		fK.pr();
		
		AccesModifier acm = new AccesModifier();
		acm.setId(2);
		acm.setName("deepak");
		System.out.println(acm.getId()+ " "+ acm.getName());
		
		
		// TODO Auto-generated method stub
     Programmer pr = new Programmer();
     System.out.println("salary is = " + pr.salary);
     System.out.println("bonus is = " + pr.bonus );
	}

}
