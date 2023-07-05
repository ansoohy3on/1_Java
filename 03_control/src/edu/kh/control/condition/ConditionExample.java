package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {

	public void ex1() {
		
		// if문
		// - 조건식이 true일 때만 내부 코드 수행
		
		/*
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true일 때 수행할 코드
		 * }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if(input > 0) {
			System.out.println("양수 입니다.");
		}
		
		if(input <= 0) {
			System.out.println("양수가 아닙니다.");
		}
		
	}
	
	public void ex2() {
		
		// if - else 문
		// - 조건식 결과가 true이면 if문,
		// 	 false이면 else 구문이 수행됨
		
		/* if(조건식){
		 * 		조건식이 true일 때 수행할 코드
		 * } else {
		 * 		조건식이 false일 때 수행할 코드
		 * }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 홀짝 검사
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input %2 != 0) {
			System.out.println("홀수 입니다.");
		
		} else { // 짝수 또는 0 입력 시 수행
			
			// ** 중첩 if문 **
			if(input == 0) {
				System.out.println("0 입니다.");
			} else {
				System.out.println("짝수 입니다.");
			}
			
		}
	
	}
	
	public void ex3() {
		
		// if - else if - else 문
		
		// 양수, 음수, 0 판별하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) { // input이 양수일 경우
			System.out.println("양수 입니다.");
			
		} else if(input < 0) { // input이 음수일 경우
			// 바로 위에 있는 if문이 만족되지 않은 경우 수행
			System.out.println("음수 입니다.");
			
		} else {
			// 모든 if, else if가 만족되지 않은 경우 수행
			System.out.println("0 입니다.");
		}
	}
	
	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
//		[방법 1]
//		if(month >= 3 && month <= 5) { // 봄 : 3, 4, 5월 "봄" 출력
//			System.out.println("봄");
//			
//		} else if(month >= 6 && month <= 8) { // 여름 : 6, 7, 8 월 "여름" 출력
//			System.out.println("여름");
//
//		} else if(month >= 9 && month <= 11) { // 가을: 9, 10, 11 월 "가을" 출력
//			System.out.println("가을");
//			
//		} else if(month == 12 || month == 1 || month == 2) { // 겨울: 12, 1, 2 월 "겨울" 출력
//			System.out.println("겨울");
//			
//		} else { // if, else if가 모두 false인 경우
//			// 해당하는 계절이 없을 경우 "해당하는 계절이 없습니다." 출력
//			System.out.println("해당하는 계절이 없습니다.");
//		}
//		
//		
//		[방법 2] 변수를 사용하여 보다 간단하게 코드 작성
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		if(month >= 3 && month <= 5) {
			season = "봄";
			
		} else if(month >= 6 && month <= 8) {
			season = "여름";

		} else if(month >= 9 && month <= 11) {
			season = "가을";
			
		} else if(month == 12 || month == 1 || month == 2) {
			season = "겨울";
			
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		
		System.out.println(season);
	}
	
	public void ex5() {
		
		// 나이를 입력받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 "청소년 입니다."
		// 19세 초과 시 "성입 입니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");
		} else if(age > 19) {
			System.out.println("성인 입니다.");
		} else {
			// 위 두 개의 조건식에서 13세 이하와 19세 초과에 해당하는 값이 모두 걸러졌기 때문에 '13세 초과 19세 이하' 조건식을 따로 작성할 필요가 없다
			System.out.println("청소년 입니다.");
		}
//		String str;
//		
//		if(age <= 13) {
//			str = "어린이 입니다.";
//		} else if(age <= 19) {
		// 13세 이하는 첫 번째 조건식에서 이미 걸러졌기 때문에 <=19로 해도 중복되지 않음
//			str = "청소년 입니다.";
//		} else {
//			str = "성입 입니다.";
//		}
//		
//		System.out.println(str);
	}

	public void ex6() {
		
		// 점수(100점 만점)를 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100 초과 : "잘못 입력하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력(0~100) : ");
		int score = sc.nextInt();
		
		String result; // 결과 저장용 변수

		if(score < 0 || score > 100) {
			result = "잘못 입력하셨습니다.";
			
		} else if(score >= 90) {
			result = "A";
			
		} else if(score >= 80) {
			result = "B";
			
		} else if(score >= 70) {
			result = "C";
			
		} else if(score >= 60) {
			result = "D";
			
		} else{
			result = "F";
		}
		
		System.out.println(result);
		
	}
	
	public void ex7() {
		// 놀이기구 탑승 제한 검사
	      
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
//		[내 코드]
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
		
//		System.out.print("키 입력 : ");
//		double height = sc.nextDouble();
//		
//		String result;
//		
//		if(age < 0 || age > 100) {
//			result = "잘못 입력 하셨습니다.";
//		} else if(height < 140.0) {
//			result = "적정 키가 아닙니다.";
//		} else if(age < 12) {
//			result = "적정 연령이 아닙니다.";
//		} else{
//			result = "탑승 가능";
//		}
//		
//		System.out.println(result);
		
//		[선생님 코드]
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();	
		
//		System.out.print("키 입력 : ");
//		double height = sc.nextDouble();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "잘못 입력 하셨습니다.";
			
		} else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(age < 12) {
				result = "적정 연령이 아닙니다.";
				
			} else if(height < 140.0) {
				result = "적정 키가 아닙니다.";
				
			} else {
				result = "탑승 가능";
			}
		}
		
		/*
		if(age < 0 || age > 100) {
			result = "잘못 입력 하셨습니다.";
			
		} else {
			
			if(age < 12) {
				result = "적정 연령이 아닙니다.";
				
			} else {
				if(height < 140.0) {
					result = "적정 키가 아닙니다.";
					
				} else {
					result = "탑승 가능";
				}
				
			}
		}
		*/
		
		/*		
		if(age < 0 || age > 100) {
			result = "잘못 입력 하셨습니다.";
			
		} else if(age < 12) {
			result = "적정 연령이 아닙니다.";
			
		} else if(height < 140.0) {
			result = "적정 키가 아닙니다.";
			
		} else {
			result = "탑승 가능";
		}
		*/
		
		System.out.println(result);
		
	}
	
	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
	    // 조건 - 나이 : 12세 이상
		//     -  키 : 140.0cm 이상
	      
       // 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
       // 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
       // -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
      
       // 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
       // 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
       // 나이 X , 키 X : "나이와 키 모두 적절치 않음";
       // 나이 O , 키 O : "탑승 가능"
		
//		[내 코드]
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
//		
//		String result;
//		
//		if( age < 0 || age > 100 ) {
//			result = "나이를 잘못 입력 하셨습니다.";
//		} else {
//			System.out.print("키 입력 : ");
//			double height = sc.nextDouble();
//			if(height < 0 || height > 250.0) {
//				result = "키를 잘못 입력 하셨습니다.";
//			} else {
//				if(height < 0 || height > 250.0) {
//					result = "나이는 적절하나, 키가 적절치 않음";
//				} else {
//					if(age < 0 || age > 100) {
//						result = "키는 적절하나, 나이는 적절치 않음";
//					}
//				}
//				result = "탑승 가능";
//			} 
//		} 
//		
//		System.out.println(result);
//		
//		
//		[선생님 코드]
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if( age < 0 || age > 100) {
			result = "나이를 잘못 입력 하셨습니다.";
			
		} else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(height < 0 || height > 250.0) {
				result = "키를 잘못 입력 하셨습니다.";
				
			} else {
				if( age < 12 && height >= 140.0) { // 나이 X, 키 O
					result = "키는 적절하나, 나이는 적절치 않음";
					
				} else if( age >= 12 && height < 140.0) { // 나이 O, 키 X
					result = "키는 적절하나, 나이는 적절치 않음";
					
				} else if(age < 12 && height < 140.0) { // 나이 X, 키 X
					result = "나이와 키 모두 적철치 않음";
					
				} else {
					result = "탑승 가능";
				}
			}
		}
		
		System.out.println(result);
		
	}
	
}
