package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
//		키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
//		짝수가 아니면 “홀수입니다.“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input < 0) {
			result = "양수만 입력해 주세요.";
		} else if(input % 2 !=0) {
			result = "홀수입니다.";
		} else {
			result = "짝수입니다.";
		}
		
		System.out.println(result);
	}
	
	public void practice2() {
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		String result;
		
		if( korean < 40 || math < 40 || english < 40 ) {
			result = "불합격입니다.";
			
		} else if( (korean + math + english)/3 < 60 ) {
			result = "불합격입니다.";
			
		} else {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + (korean + math + english));
			System.out.println("평균 : " + (double)(korean + math + english)/3);
			result = "축하합니다, 합격입니다!";
		}
		
		System.out.println(result);
		
	}
	
	public void practice3() {
//		1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
//		잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
			switch(month) {
		
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : result = "31일까지 있습니다."; break;
			case 2 : result = "28일까지 있습니다."; break;
			case 4 : case 6 : case 9 : case 11 : result = "30일까지 있습니다."; break;
			default : result = "잘못 입력된 달입니다.";
			}
		
			System.out.println(month + "월은 " + result);
			
	}
	
	public void practice4() {
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("키(m)를 입력해 주세요. : ");
//		double height = sc.nextDouble();
//		
//		System.out.print("몸무게(kg)를 입력해 주세요. : ");
//		double weight = sc.nextDouble();
//		
//		double bmi = weight / (height * height);
//		
//		String result;
//		
//		if(bmi >= 30) {
//			result = "고도 비만";
//		} else if(bmi >= 25) {
//			result = "비만";
//		} else if(bmi >= 23) {
//			result = "과체중";
//		} else if(bmi >= 18.5) {
//			result = "정상체중";
//		} else {
//			result = "저체중";
//		}
//		
//		System.out.println("BMI 지수 : " + bmi);
//		System.out.println(result);
//		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");

		} else if(bmi < 23) {
			System.out.println("정상체중");
			
		} else if(bmi < 25) {
			System.out.println("과체중");
			
		} else if(bmi < 30) {
			System.out.println("비만");
	
		} else {
			System.out.println("고도 비만");
		}
		
		
	}
	
	public void practice5() {
//		중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
//		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("중간 고사 점수 : ");
//		int input1 = sc.nextInt();
//		double rate1 = input1*0.2;
//	
//		System.out.print("기말 고사 점수 : ");
//		int input2 = sc.nextInt();
//		double rate2 = input2*0.3;
//		
//		System.out.print("과제 점수 : ");
//		int input3 = sc.nextInt();
//		double rate3 = input3*0.3;
//		
//		System.out.print("출석 횟수 : ");
//		int input4 = sc.nextInt();
//		double rate4 = input4;
//		
//		String result;
//		
//		if(20 - input4 >= 6) {
//			result = "Fail [출석 횟수 부족 (" + input4 + "/20)]";
//			
//		} else if(rate1 + rate2 + rate3 + rate4 < 70) {
//			result = "Fail [점수 미달]";
//			
//		} else{
//			result = "Pass";
//		}
//		
//		System.out.println("================= 결과 =================");
//		System.out.println("중간 고사 점수(20) : " + rate1);
//		System.out.println("기말 고사 점수(30) : " + rate2);
//		System.out.println("과제 점수 (30) : " + rate3);
//		System.out.println("출석 점수 (20) : " + rate4);
//		System.out.println("총점 : " + (rate1 + rate2 + rate3 + rate4));
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double homework = sc.nextDouble();		
		
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextDouble();
		
		if(attendance <= 20 * (1 - 0.3) ) { // 30% 이상 결석 <-> 70% 미만 출석
			// (1-0.3)을 하는 이유 : 출석 횟수가 아닌 결석 횟수로 계산할 경우 attendance가 아닌
			// 또 다른 결석 횟수를 담을 변수를 새로 만들어야 하기 때문에 비효율적임
			System.out.println("Fail [출석 횟수 부족 (" + (int)attendance + "/20)]");
			
		} else {
			
			midTerm *= 0.2;
			finalTerm *= 0.3;
			homework *= 0.3;
			attendance *= 5 * 0.2; // 출석 점수는 20점 만점이므로 *5를 한다.
			
			// 합계
			double sum = midTerm + finalTerm + homework + attendance;
			
			System.out.printf("중간 고사 점수(20) : %.1f\n", midTerm);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalTerm);
			System.out.printf("과제 점수(30) : %.1f\n", homework);
			System.out.printf("출석 점수(20) : %.1f\n", attendance);
			System.out.printf("총점 : %.1f\n", sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
		
	}
}
