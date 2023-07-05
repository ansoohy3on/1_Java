package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		} else {
			for(int i = 1 ; i <= num ; i++) {
				
				System.out.print(i + " ");
				
			}
			
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if( num < 1 ) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		} else {
			for(int i = num ; i >= 1 ; i--) {
				
				System.out.print(i + " ");
			}
			
		}
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <= num ; i++) {
			
			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			
			sum += i;
			
		}
		
		System.out.println(sum);
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		} else if (num1 >= num2 ) {
			for (int i = num2 ; i <= num1 ; i++) {
				System.out.print(i + " ");
			}
			
		} else {
			for (int i = num1 ; i <= num2 ; i++) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public void practice5() {
		
	    Scanner sc = new Scanner(System.in);
	      
	    System.out.print("숫자 : ");
	    int dan = sc.nextInt();
	    System.out.println("===== " + dan + "단 =====");
	      
	    for(int i = 1; i <= 9; i++) {
	       System.out.printf("%d * % d = % d\n", dan, i, dan * i);
	    }
	      
	}
	
	public void practice6() {
	      
		Scanner sc = new Scanner(System.in);
	      
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
	      
		if(dan >=2 && dan <= 9) {
			for(int x = dan; x <= 9; x++) {
				System.out.println("===== " + x + "단 =====");
	            
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", x, i, x * i);
				}

			}
	         
		} else {
	         System.out.println("2~9 사이 숫자만 입력해 주세요.");
		}
	      
	}
	   
	public void practice7() {
	      
		Scanner sc = new Scanner(System.in);
	      
		System.out.printf("정수 입력 : ");
		int input = sc.nextInt();

		for(int x = 1; x <= input; x++) {
			for(int i = 1; i <= x; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	   
	public void practice8() {
	      
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
	      
		for(int x = input; x >= 1; x--) {
			for(int i = x; i >= 1; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	      
	}
	   
	public void practice9() {

//		[내 코드]
//		Scanner sc = new Scanner(System.in);
//	      
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//	      
//		for(int x = input; x >= 1; x--) {
//	         
//			for(int i = 1; i <= input; i++) {
//				if(x > i) {
//					System.out.print(" ");
//	               
//	            }else {
//	            	System.out.print("*");
//	               
//	            }
//			}
//	         
//			System.out.println();
//		}
//	   
		
//		[선생님 코드]
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1; x <= input; x++) {
			
			// 1) for문 하나 더 작성
			// * 1개 출력 전에 띄어쓰기 3번
			// * 2개 출력 전에 띄어쓰기 2번
			// * 3개 출력 전에 띄어쓰기 1번
			// * 4개 출력 전에 띄어쓰기 0번
			
			// y == 3 2 1 0
			
			/*
			for(int y = input - x; y >= 1; y--) {
				System.out.print(" ");
			}
			
			for(int i = 1; i <= x; i++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
			*/
			
			// 2) for + if - else
			
			for(int i = 1; i <= input; i++) {
			
				if(i <= input - x) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); // 줄바꿈
		}
		
		
	}
	   
	public void practice10() {
	      
		Scanner sc = new Scanner(System.in);
	      
	    System.out.print("정수 입력 : ");
	    int input = sc.nextInt();
	     
	    // 삼각형이 2개가 있다고 가정(위쪽 삼각형: 증가 / 아랫쪽 삼각형: 감소)
	    // 위쪽 삼각형
	    for(int x = 1; x <= input; x++) {
	    	
	    	for(int i = 1; i <= x; i++) {
	    		System.out.print("*");
	        }
	    	System.out.println(); // 줄바꿈
	    }

	    // 아랫쪽 삼각형
	    for(int y = (input - 1); y >= 1; y--) {
	    	
	    	for(int i = 1; i <= y; i++) {
	    		System.out.print("*");
	        }
	    	System.out.println(); // 줄바꿈
	    }
	      
	}
	   
	public void practice11() {
		Scanner sc = new Scanner(System.in);
	      
	    System.out.print("정수 입력 : ");
	    int input = sc.nextInt();
	      
	    for(int x = 1; x <= input; x++) { // 입력받은 input만큼 줄 출력
	    	
	    	// 공백 출력 for문
	    	for(int i = input - x; i >= 1; i--) {
	    		System.out.print(" ");
	    	}
	    	
	    	// * 출력 for문
	    	// 1, 3, 5, 7, 9
	    	for(int i = 1; i <= 2 * x - 1; i++) {
	    		System.out.print("*");
	    	}
	    	
	    	System.out.println(); // 줄바꿈
	    }
//			[내 코드]	    	
//	    	for(int y = input; y > x; y--) {
//	    		System.out.print(" ");
//	        }
//	         
//	    	for(int y = 1; y <= 2 * x - 1; y++) {
//	            System.out.print("*");
//	        }
//	         
//	    	System.out.println();
//	    }
//	      
	}
	   
	public void practice12() {
	      
//		Scanner sc = new Scanner(System.in);
//	      
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//	      
//		for(int i = 1; i <= input; i++) {
//			System.out.print("*");
//		}
//		System.out.println(); // 줄바꿈
//
//		for(int i = 1; i <= input - 2; i++) {
//	         
//			for(int x = 1; x <= input; x++){
//	            
//				if( x == 1 || x == input) {
//					System.out.print("*");
//	            } else {
//	            	System.out.print(" ");
//	            }
//	        }
//	         
//			System.out.println(); 
//		}
//	      
//		for(int i = 1; i <= input; i++) {
//			System.out.print("*");
//		}
	      
		Scanner sc = new Scanner(System.in);
	      
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
	      
		// row : 행(줄)
		// col(column) : 열(칸)
		
		for(int row = 1; row <= input; row++) {
			
			for(int col = 1; col <= input; col++) {
				// row 또는 col이 1 또는 input인 경우 * 출력
				// == 테두리
				
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
					
				} else { // 내부
					System.out.print(" ");
				}
				
			}
			System.out.println(); // 줄바꿈
		}
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요. : ");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if( i %2 == 0 || i %3 == 0) {
				System.out.print(i + " ");
			}
			if( i %2 == 0 && i %3 == 0) {
				count += 1;
			}
		}
		System.out.printf("\ncount : %d", count);
	}
	
}
