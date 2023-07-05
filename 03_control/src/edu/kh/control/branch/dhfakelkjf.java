package edu.kh.control.branch;

import java.util.Scanner;

public class dhfakelkjf {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		System.out.println("[가위 바위 보 게임]");
		System.out.printf("몇 판? : ");
		int round = sc.nextInt();
		
		for(int i = 1; i <= round; i++) {
			
			System.out.printf("%d 번째 게임\n", i);
			System.out.print("가위/바위/보 중 하나를 입력 해 주세요. : ");
			String input = sc.next();
			
			int random = (int)(Math.random() * 3 +1);
			
			String com = null;
			
			switch(random) {
			
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			
			}
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
			
			if(input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
				
			} else {
				
				boolean win1 = input.equals("가위") && com.equals("보"); 
				boolean win2 = input.equals("바위") && com.equals("가위"); 
				boolean win3 = input.equals("보") && com.equals("바위"); 
				
				if(win1 || win2 || win3) {
					System.out.println("이겼습니다~~~");
					win++;
				} else {
					System.out.println("졌습니다 ㅠㅠ");
					lose++;
				}
				
			}
			
			System.out.printf("현재 기록 : %d승 %d무 %d 패");
			
		}
		
		
		
	}

	
	
	
}
