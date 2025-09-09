package com.codegnan.Patterns;

public class Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		//part 1 --- upper part of the diamond
		for(int i=1;i<=rows;i++) {
			//inner loop 1 : print leading spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			//inner loop 2 : print *
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//part 2 --- lower part of the diamond
		for(int i=rows-1;i>=1;i--) {
			//inner for loop 1 :print spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			//inner loop 2
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
