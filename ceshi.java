package ceshi;

import java.util.Scanner;
public class ceshi {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n>90) 
		System.out.println("优");
	 else if(n>80) System.out.println("中");
	else if(n>70) System.out.println("良");
	else if(n>60) System.out.println("及格");
	else System.out.println("不及格");
}
}

