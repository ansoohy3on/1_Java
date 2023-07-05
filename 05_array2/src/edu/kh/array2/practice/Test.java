package edu.kh.array2.practice;

import java.util.Scanner;

public class Test {

	public void test1() {
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				arr[row][col] = num;
				num += 2;
			}
		}
	}

	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		char ch= sc.next().charAt(0);
		
		System.out.print((int)ch);
	}
}
