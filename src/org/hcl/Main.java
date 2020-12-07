package org.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info;
		Score s=new Score();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score info:");
		info=sc.nextLine();
		System.out.println("Score Info:");
		String[] arrOfStr=info.split("#");
		s.setName(arrOfStr[0]);
		System.out.println("Score:"+s.getName());
		long l=Long.parseLong(arrOfStr[1]);
		s.setRuns(l);
		System.out.println("Runs:"+s.getRuns());
        sc.close();
	}

}
