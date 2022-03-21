package 개인과제;

import java.util.Scanner;

public class 라면끓이기 {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in); // 입력받기위한 스캐너
		
		
	while(true) { //프로그램 시작
		
	System.out.println("-----라면끓이기------");
	System.out.println("물을 끓이기위한 용기를 선택하세요 : 1.냄비 2.세숫대야 3.컵 "); int ch = scanner.nextInt(); //선택지 입력받기 
	
	if(ch == 1) {
		
		System.out.println(" 500ml 물을 넣어주세요  : ");int water = scanner.nextInt(); // 넣을 물 입력  
		if(water == 500) {  // 물이 500이면 
			outer:  // 반복문에이름을 달아서 break + 이름을 입력하면 그 반복문을 탈출할수있음
			while(true) { //while2 가스불 반복문 시작
			System.out.println("1. 가스불 ON  2. 가스불 OFF "); int gas = scanner.nextInt(); // 가스불 on off 
			if(gas == 1) { // 1을선택하면 가스불 on
				System.out.println("가스불을 켭니다.");
				for(  int i  = 1; i<6; i++) { // i 1번당 1분  
					System.out.println("물을 끓이는중 " +i + "분" );
				}
				System.out.println("물 끓이기 완료 "); 
				
				while(true) { // while3 재료를넣고 끓이는 반복문
				System.out.println("넣을 재료를 선택하세요 : 1. 스프와 면 2.밥"); int ch2 = scanner.nextInt(); // 재료선택 
				if ( ch2 == 1) { // 재료선택을 1번을 했다면 
					for(int  i = 1; i<6; i++) {  // i 1번당 1분 
						System.out.println("물을 끓이는중  " +i + "분" );
					}
					System.out.println("완성!");
					while (true){ // while 4 가스불 끌때까지 반복문 실행 
					System.out.println("1. 가스불OFF 2. 가스불ON "); int ch3 = scanner.nextInt();
					
					if(ch3 == 1 ) {
						System.out.println("라면끓이기를 종료합니다 ");
						break outer; // 반복문에이름을 달아서 break + 이름을 입력하면 그 반복문을 탈출할수있음
					}
					else {System.out.println("가스불을 끄세요 "); }
					} // while4 end
				}
				else {System.out.println("재료를 다시선택하세요");} //1번외 다른것을 선택했을때
				} // while3 end
			}
			else {System.out.println("가스불을 끕니다."); break;} // 가스불을 끄면 초기메뉴로 돌아기위해 break (while 2 	탈출)
			} // while2 end
		}
		else if ( water != 500) { // 물이 500이 아니면 
			if(water>500) { // 물이 500보다 클경우 
			System.out.println("물양이 너무 많습니다.");
			
			
			}
			else{System.out.println("물양이 너무 적습니다.");  }  // 물이 500보다 작을경우
		}
		
	}
	else {System.out.println("잘못된 선택입니다.");} // 지정한번호 외 다른키 입력시 
		
	} // while end
	
	} // me

} // ce
