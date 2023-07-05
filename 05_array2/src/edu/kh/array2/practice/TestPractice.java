package edu.kh.array2.practice;

import java.util.Scanner;

public class TestPractice {
	
	public void test1() {
		
		// 1) 5행 5열짜리 정수형 배열 선언 및 할당하고
		// 2) 1부터 2씩 증가하는 값을 저장하세요

		int[][] arr = new int[5][5];
		int num = 1;
		for(int row = 0; row < arr.length; row++){
		    for(int col = 0; col < arr[row].length; col++){
		    	
		    	arr[row][col] = num;
		    	num += 2;
		    }
		}
	}
	
	public void test2() {
		
		// 알파벳 a~z, 대문자 A~Z, 숫자 0~9중 하나를 입력받아
		// 입력받은 문자의 아스키코드값을 출력해주세요!

		// ex) 입력 : A
		// 65
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println((int)ch);
		
	}
	
}
