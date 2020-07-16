package com.example.firstPackage;
import java.util.Random;
public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int die1, die2, countDouble = 0;
   Random rand = new Random();
   
   for(int i=0;i<100; i++) {
	   die1 = rand.nextInt(6)+1;
	   die2 = rand.nextInt(6)+1;
	   System.out.println(die1);
	   System.out.println(die2);
	   if(die1 == die2) {
		   countDouble++;
	   }
   } System.out.println(" I rolled "+ countDouble + "doubles");
	}

}
