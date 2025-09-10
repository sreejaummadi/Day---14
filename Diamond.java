package com.codegnan.Patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; 

        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))  
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}

}
