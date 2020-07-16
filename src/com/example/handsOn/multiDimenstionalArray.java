package com.example.handsOn;

public class multiDimenstionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] states = new String[2][2];
		states[0][0] = "Victoria";
		states[0][1] = "Melborne";
		states[1][0] = "patna";
		states[1][1] = "saharsa";
		
//		for(int i=0;i<states.length;i++) {
//			System.out.println("the capital of "+ states[0][0] +"is" + states[0][1] + ".");
//		
//		}
		
		for(int i =0;i<states.length;i++) {
			StringBuilder sb = new StringBuilder();//StringBuilder usings
			sb.append("The Capital of ")
			.append(states[i][0])
			.append(" is ")
			.append(states[i][1])
			.append(".");
			
			
			System.out.println(sb);
		}

	}

}
