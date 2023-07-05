package edu.kh.op.practice;

import java.util.Scanner;

public class OpPractice {

	public void practice1() {
//		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int result1 = num2 / num1;
		int result2 = num2 - result1*num1;
		
		System.out.println("");
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
		
	}
	
	public void practice2() {
//		키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();

		System.out.print("반(정수) : ");
		int class1 = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double test = sc.nextDouble();
		
		System.out.println("");
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.", grade, class1, number, gender, name, test);
	}
	
	public void practice3() {
//		정수를 하나 입력 받아 짝수/홀수를 구분하세요.
//		(0은 짝수로 취급합니다.)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input %2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		
		System.out.println(result + " 입니다.");
	}
	
	public void practice4() {
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double average = (korean + english + math)/3.0;
		
		String result;
		
		if(korean < 40 || english < 40 || math < 40) {
			result = "불합격";
			
		} else if(korean >= 40 && english >= 40 && math >= 40 && average >= 60.0) {
			result = "합격";
			
		} else {
			result = "불합격";
		}
		
		System.out.println("");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println(result);
	}
}
