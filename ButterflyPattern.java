package com.codegnan.Patterns;

public class ButterflyPattern {

	public static void main(String[] args) {
		//part 1 --upper part of butterfly
		int rows =5;
		for(int i=1;i<=rows;i++) {
			//inner loop-left wing
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			//inner for loop to print the spaces between left wing and right wing
			int spaces=2*(rows-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				//inner for loop 3 for upper right wing
				System.out.print("* ");
			}
			System.out.println();
			
		}
		//lower part of butterfly
		for(int i=rows;i>=1;i--) {
			//inner for loop 1 -- print starts as left wing in lower part
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			int spaces =2*(rows-i);
			//inner for loop 2
			for(int j=1;j<=spaces;j++) {
				System.out.print("  ");
			}
			//inner for loop3 print starts on right
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
