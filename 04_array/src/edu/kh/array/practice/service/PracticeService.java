package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

			if(i %2 == 0 || i == 0) {
				sum += arr[i];
			}
			
		}
		
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice2() {
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
			
			if( i %2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			arr[i] = input;
		}
		
		System.out.print("검색할 값 : ");
		int input2 = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(input2 == arr[i]) {
				System.out.println("인덱스 : " + i);
				
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0); // 입력받은 문자열에서 0번 인덱스 문자를 반환
		// 		      String -> char
		
		char[] arr = new char[input.length()]; // 입력받은 문자열 길이만큼 배열 생성

		int count = 0; // input에 일치하는 ch가 몇 개 있는지 카운트하는 변수
		System.out.print(input + "에" + ch + "가 존재하는 위치(인덱스) : " + i);
		
		for(int i = 0; i < arr.length; i++) {
			
			// 배열 대입
			arr[i] = input.charAt(i);
			// 입력받은 문자열에서 i번째 인덱스 문자를 arr[i]에 대입
			
			// 검색 + 카운트
			if(ch == arr[i]) { // 검색 조건
				count++;
				System.out.print(i + " ");
	
			}
		}
		System.out.println("\n" + ch + " 개수 : " + count);
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		int[] arr = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int input2 = sc.nextInt();
			arr[i] = input2;
			sum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
			if(i >= 8) {
				arr[i] = '*';
			}
			
			System.out.print(arr[i]);
		}
		
	}
}
