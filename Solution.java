package co.anbu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution{
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Enter the number : ");
//		int n = bi.read();
		int[] triangle_sides = new int[3];
		String strSide[] ;
		System.out.print("Enter the number : ");
		strSide = bi.readLine().split(" ");
		for(int i=0; i<triangle_sides.length; i++) {
			triangle_sides[i] = Integer.parseInt(strSide[i]);
		}
		if(triangle_sides[0] < triangle_sides[1] || triangle_sides[1] < triangle_sides[2]) {
			System.out.println("Invalid_Input");
		}
		else {
			if(Math.pow(triangle_sides[1],2) + Math.pow(triangle_sides[2],2) == Math.pow(triangle_sides[0],2)) {
				System.out.println("RIGHT ANGLE TRIANGLE");
			}
			else {
				System.out.println("NOT RIGHT ANGLE TRIANGLE");
			}
		}
	}

}
